class SharedBuffer {
    int data;
    boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        data = value;
        System.out.println("Produced: " + data);
        available = true;
        notify();
    }

    public synchronized void consume() {
        while (!available) {
            try {
                wait();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    SharedBuffer b;

    Producer(SharedBuffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedBuffer b;

    Consumer(SharedBuffer b) {
        this.b = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            b.consume();
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        SharedBuffer b = new SharedBuffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);

        p.start();
        c.start();
    }
}
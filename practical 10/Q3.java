class Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 started");
        for (int i = 1; i <= 50; i++) {
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread 1 completed");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 started");
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Thread 2: " + i);
            try {
                Thread.sleep(250);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread 2 completed");
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread 3 started");
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Thread 3: " + i);
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread 3 completed");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();

        try {
            t1.start();
            t1.join();

            t3.start();
            t3.join();

            t2.start();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
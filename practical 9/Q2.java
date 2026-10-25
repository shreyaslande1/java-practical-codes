class Num implements Runnable {
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Num: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Even implements Runnable {
    public void run() {
        for (int i = 0; i <= 50; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Odd implements Runnable {
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Num n = new Num();
        Even e = new Even();
        Odd o = new Odd();

        Thread t1 = new Thread(n);
        Thread t2 = new Thread(e);
        Thread t3 = new Thread(o);

        t1.setPriority(10); // MAX_PRIORITY
        t2.setPriority(5);  // NORM_PRIORITY
        t3.setPriority(1);  // MIN_PRIORITY

        t1.start();
        t2.start();
        t3.start();
    }
}
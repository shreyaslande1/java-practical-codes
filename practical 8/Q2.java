import java.util.Scanner;

class Num extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
        System.out.println("Thread 1 completed");
    }
}

class Even extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
        System.out.println("Thread 2 completed");
    }
}

class ODD extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }
        System.out.println("Thread 3 completed");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Num n = new Num();
        ODD o = new ODD();
        Even e = new Even();

        
        n.start();
        o.start();
        e.start();
    }
}
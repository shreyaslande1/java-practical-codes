import java.util.Scanner;

class Add implements Runnable {
    int a, b;
    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        System.out.println("Addition : " + (a + b));
    }
}

class Sub implements Runnable {
    int a, b;
    Sub(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        System.out.println("Subtraction : " + (a - b));
    }
}

class Mul implements Runnable {
    int a, b;
    Mul(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        System.out.println("Multiplication : " + (a * b));
    }
}

class Div implements Runnable {
    int a, b;
    Div(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void run() {
        if (b != 0) {
            System.out.println("Division : " + ((double) a / b));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        Add addObj = new Add(a, b);
        Sub subObj = new Sub(a, b);
        Mul mulObj = new Mul(a, b);
        Div divObj = new Div(a, b);

        Thread t1 = new Thread(addObj);
        Thread t2 = new Thread(subObj);
        Thread t3 = new Thread(mulObj);
        Thread t4 = new Thread(divObj);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        sc.close();
    }
}
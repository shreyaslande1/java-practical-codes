import java.util.Scanner;

class Add extends Thread {
    int a, b;

    Add(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Addition = " + (a + b));
    }
}

class Sub extends Thread {
    int a, b;

    Sub(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Substraction = " + (a - b));
    }
}

class Multiplication extends Thread {
    int a, b;

    Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Multiplication = " + (a * b));
    }
}

class Div extends Thread {
    int a, b;

    Div(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void run() {
        System.out.println("Division = " + (a / b));
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        Add a1 = new Add(a, b);
        Sub s = new Sub(a, b);
        Multiplication m = new Multiplication(a, b);
        Div d = new Div(a, b);

        a1.start();
        s.start();
        m.start();
        d.start();
    }
}
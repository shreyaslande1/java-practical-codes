import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    void area() {
        System.out.println("Area of circle is: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    void area() {
        System.out.println("Area of rectangle is: " + (length * width));
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Enter radius for circle: ");
        c.radius = sc.nextDouble();

        System.out.println("Enter length & width for rectangle: ");
        r.length = sc.nextDouble();
        r.width = sc.nextDouble();

        c.area();
        r.area();
    }
}
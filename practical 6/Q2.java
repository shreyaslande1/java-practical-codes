import java.util.Scanner;

interface Shape {
    void area();
}

class Circle implements Shape {
    double radius;

    public void area() {
        System.out.println("Area of circle = " + (3.14 * radius * radius));
    }
}

class Square implements Shape {
    double side;

    public void area() {
        System.out.println("Area of square = " + (side * side));
    }
}

class Rectangle implements Shape {
    double length, width;

    public void area() {
        System.out.println("Area of rectangle = " + (length * width));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();

        System.out.println("Enter radius for circle: ");
        c.radius = sc.nextDouble();

        System.out.println("Enter length & width for rectangle: ");
        r.length = sc.nextDouble();
        r.width = sc.nextDouble();

        System.out.println("Enter side for square: ");
        s.side = sc.nextDouble();

        c.area();
        s.area();
        r.area();
    }
}
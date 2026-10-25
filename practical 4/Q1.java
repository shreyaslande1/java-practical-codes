import java.util.Scanner;

class Vehicle {
    String brand;
    int year;

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    String model;

    public void displayCar() {
        System.out.println("Model: " + model);
    }
}

class Sportscar extends Car {
    String type;
    int engine;

    public void displaySport() {
        System.out.println("Type: " + type);
        System.out.println("Engine: " + engine);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sportscar s = new Sportscar();

        System.out.println("Enter brand:");
        s.brand = sc.next();

        System.out.println("Enter year:");
        s.year = sc.nextInt();

        System.out.println("Enter model:");
        s.model = sc.next();

        System.out.println("Enter type:");
        s.type = sc.next();

        System.out.println("Enter engine:");
        s.engine = sc.nextInt();

        s.display();
        s.displayCar();
        s.displaySport();
    }
}
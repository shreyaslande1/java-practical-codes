import java.util.Scanner;

class Employee {
    String name;
    int salary;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String dept;

    public void displayManager() {
        display();
        System.out.println("Department: " + dept);
    }
}

class Engineer extends Employee {
    String trade;

    public void displayEngineer() {
        display();
        System.out.println("Trade: " + trade);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();
        System.out.println("Enter manager's name:");
        m.name = sc.next();
        System.out.println("Enter Manager salary:");
        m.salary = sc.nextInt();
        System.out.println("Enter Manager department:");
        m.dept = sc.next();

        Engineer e = new Engineer();
        System.out.println("Enter Engineer name:");
        e.name = sc.next();
        System.out.println("Enter engineer salary:");
        e.salary = sc.nextInt();
        System.out.println("Enter Engineer trade:");
        e.trade = sc.next();

        System.out.println("Manager Details:");
        m.displayManager();

        System.out.println("Engineer Details:");
        e.displayEngineer();
    }
}
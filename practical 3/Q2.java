import java.util.Scanner;

class Employee {
    int empid;
    String empname;
    double empsalary;
    String emppost;
    String empcity;

    public Employee(int i, String n, double s, String t, String c) {
        empid = i;
        empname = n;
        empsalary = s;
        emppost = t;
        empcity = c;
    }

    public void display() {
        System.out.println("ID = " + empid + " Name = " + empname + " Post = " + emppost + " Salary = " + empsalary + " City = " + empcity);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details of employee no: " + (i + 1));
            System.out.println("Enter name: ");
            String str1 = sc.next();
            System.out.println("Enter ID: ");
            int id = sc.nextInt();
            System.out.println("Enter salary: ");
            double sal = sc.nextDouble();
            System.out.println("Enter post: ");
            String str2 = sc.next();
            System.out.println("Enter city: ");
            String str3 = sc.next();

            emp[i] = new Employee(id, str1, sal, str2, str3);
        }

        System.out.println("Employee Details: ");
        for (int i = 0; i < 3; i++) {
            emp[i].display();
        }
    }
}
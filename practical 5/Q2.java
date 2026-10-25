import java.util.Scanner;

class Bank {
    float interest;

    public void getInterest() {
        System.out.println("Interest Rate: " + interest);
    }
}

class SBI extends Bank {
    String name;

    public void getInterest() {
        System.out.println("Bank name: " + name);
        System.out.println("Interest rate: " + interest);
    }
}

class ICICI extends Bank {
    String name;

    public void getInterest() {
        System.out.println("Bank name: " + name);
        System.out.println("Interest rate: " + interest);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SBI s1 = new SBI();
        System.out.println("Enter SBI name:");
        s1.name = sc.nextLine();
        System.out.println("Enter SBI interest rate:");
        s1.interest = sc.nextFloat();
        sc.nextLine();

        System.out.println("SBI Details:");
        s1.getInterest();

        ICICI i1 = new ICICI();
        System.out.println("Enter ICICI name:");
        i1.name = sc.nextLine();
        System.out.println("Enter ICICI interest rate:");
        i1.interest = sc.nextFloat();

        System.out.println("ICICI Details:");
        i1.getInterest();
    }
}
import java.util.Scanner;

interface SBI {
    void getInterest();
}

interface ICICI {
    void getInterest();
}

class SBIC implements SBI, ICICI {
    String name = "SBIC";
    float interest;

    public void getInterest() {
        System.out.println("Enter Interest rate:");
        Scanner sc = new Scanner(System.in);
        interest = sc.nextFloat();
    }

    public void displayInterest() {
        System.out.println("name: " + name);
        System.out.println("Interest rate: " + interest);
    }
}

public class Q1 {
    public static void main(String[] args) {
        SBIC s = new SBIC();
        s.getInterest();
        s.displayInterest();
    }
}
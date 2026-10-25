package Banking;

import java.util.Scanner;

public class Bankaccount {
    String acc_no;
    double bal;

    public Bankaccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account No: ");
        acc_no = sc.nextLine();
        System.out.print("Enter balance: ");
        bal = sc.nextDouble();
    }

    public double deposit(double amount) {
        bal += amount;
        return bal;
    }

    public double withdraw(double amount) {
        if (amount <= bal) {
            bal -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
        return bal;
    }

    public void checkBalance() {
        System.out.println("Available balance: " + bal);
    }
}
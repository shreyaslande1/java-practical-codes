import Banking.BankAccount;

public class Q2 {
    public static void main(String[] args) {
        Bankaccount b = new Bankaccount();
        
        System.out.println("Deposit value: " + b.deposit(5000));
        System.out.println("Withdraw value: " + b.withdraw(200));
        
        b.checkBalance();
    }
}
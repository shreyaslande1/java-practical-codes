
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
class Bank{
    double balance = 50000;
    void withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}
class Q2{
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
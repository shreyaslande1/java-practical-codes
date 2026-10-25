import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                throw new NegativeNumberException("Negative number is not allowed");
            } else {
                System.out.println("Number = " + num);
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
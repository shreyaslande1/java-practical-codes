import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            if (password.length() < 6) {
                throw new InvalidPasswordException("Password must contain at least 6 characters");
            } else {
                System.out.println("Valid password");
            }
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
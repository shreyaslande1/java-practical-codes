import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter Operator");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                    break;
                } else {
                    System.out.println("Divide by 0 can't possible");
                    break;
                }
        }
    }
}
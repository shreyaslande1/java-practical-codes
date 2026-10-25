import java.util.Scanner;

class MarksOutOfRangeExpection extends Exception {
    public MarksOutOfRangeExpection(String message) {
        super(message);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100) {
                throw new MarksOutOfRangeExpection("Marks must be between 0 and 100");
            } else {
                System.out.println("Validated marks: " + marks);
            }
        } catch (MarksOutOfRangeExpection e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
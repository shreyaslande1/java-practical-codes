import MathOperation.MathUtil;

public class Q1 {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();

        System.out.println("Addition: " + m.add(3, 5));
        System.out.println("Subtraction: " + m.sub(5, 5));
        System.out.println("Multiplication: " + m.mul(11, 12));
        System.out.println("Division: " + m.div(9, 18));
    }
}
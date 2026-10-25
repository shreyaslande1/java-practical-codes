class Q1 {
    static void divide() throws ArithmeticException {
        int a = 10;
        int b = 0;
        System.out.println("Result = " + (a / b));
    }

    public static void main(String[] args) {
        try {
            divide();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: Division by zero is not allowed");
        }
    }
}
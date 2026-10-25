public class Q1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love Java very much");
        sb.insert(7, "Advance ");
        System.out.println(sb);
        sb.replace(7, 14, "Python");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
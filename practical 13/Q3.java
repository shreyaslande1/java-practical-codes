public class Q3 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("please access valid element");
        }
    }
}
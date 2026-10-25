import java.io.FileOutputStream;
public class Q2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout = new FileOutputStream("data.txt");
            String s = "hello i am shreyas";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();

            System.out.println("data written successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

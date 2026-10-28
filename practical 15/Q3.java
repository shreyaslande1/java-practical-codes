import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q3 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("test.txt");
            FileOutputStream fout = new FileOutputStream("copy.txt");
            int i;
            while((i=fin.read())!=-1){
                fout.write(i);
            }
            fin.close();
            fout.close();
            System.out.println("file copied successfully");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

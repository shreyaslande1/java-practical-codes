import java.io.FileInputStream;
import java.io.IOException;
public class Q4 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("data.txt");
            int count=0;
            int i;
            while((i = fin.read())!=-1){
                count++;
            }
            fin.close();
            System.out.println("Number of Bytes: "+count);

        }catch(IOException e){
            System.out.println(e);
        }
    }
}

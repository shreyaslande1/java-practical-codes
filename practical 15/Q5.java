import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) {
        try{
            FileInputStream fin1 = new FileInputStream("test.txt");
            FileInputStream fin2 = new FileInputStream("data.txt");
            SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
            FileOutputStream out = new FileOutputStream("output.txt");
            int i;
            while((i=sis.read())!=-1){
                out.write(i);
            }
            sis.close();
            out.close();
            fin1.close();
            fin2.close();
            System.out.println("file concentrated successfully");
        }catch(IOException e){
            System.out.println("file error: "+e.getMessage());
        }

    }
}

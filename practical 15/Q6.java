import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Q6 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                bw.write(line);
                bw.newLine();
            }
            br.close();
            bw.close();
            System.out.println("file copied successfully");
        }catch(IOException e){
            System.out.println("file error: "+e.getMessage());
        }
    }
}

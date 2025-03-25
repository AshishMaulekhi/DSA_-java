
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Writer {
    
    public static void main(String[] args) throws IOException{

        FileWriter fw = new FileWriter("abc.txt", true);
        fw.write("\nWelcome to java");
        fw.close();

        FileReader fr = new FileReader("abc.txt");
        int i;
        while((i = fr.read()) != -1){
            System.out.print((char)i);
        }
        fr.close();
    }
}

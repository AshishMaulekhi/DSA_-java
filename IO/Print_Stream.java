import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.IOException;

public class Print_Stream {
    
    public static void main(String[] args)throws IOException{

        FileOutputStream fout = new FileOutputStream("ex.txt", true);
        PrintStream pout = new PrintStream(fout);
        pout.println(2016);
        pout.println("Hello java");
        pout.println("Welcome to java batch");
        fout.close();
        

    }
}

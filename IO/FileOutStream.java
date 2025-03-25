import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStream {
    
    public static void main(String[] args) throws IOException
    {
        //File Output Stream
        FileOutputStream fout = new FileOutputStream("ex.txt", true);
        String s = "Hello"; //data to write

        byte b[] = s.getBytes();
        fout.write(b); //writes in format of bytes

        for(byte i : b){
            System.out.print(i + " "); //prints ascii values
        }
        fout.close(); //closing the file
        System.out.println();

        
        //File Input Stream
        FileInputStream fin = new FileInputStream("ex.txt");
        int i=0;
        while((i=fin.read())!=-1)
        {
            System.out.print((char)i);
        }

        fin.close();
    }
}

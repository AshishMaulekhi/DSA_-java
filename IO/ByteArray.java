import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArray {
    
    public static void main(String[] args) throws IOException{

        FileOutputStream fout = new FileOutputStream("ex.txt", true); //file for writting
        ByteArrayOutputStream b = new ByteArrayOutputStream(); //using byte array
        //byte a[] = {65, 66, 67, 68}; //Array of bites
        String a = "Hello";
        b.write(a.getBytes());
        b.writeTo(fout);

        byte c[] = {1,2,3,4,5};

        ByteArrayInputStream d = new ByteArrayInputStream(c);
        int i = 0;
        while((i = d.read()) != -1){
            System.out.print(i + " ");
        }


        b.close();
        fout.close();
    }
}

import java.io.CharArrayReader;
import java.io.IOException;

public class Reader {
    
    public static void main(String[] args) throws IOException{

        char a[] = {'A', 'B', 'C', 'D'};
        CharArrayReader car = new CharArrayReader(a);
        int i;
        while((i = car.read()) != -1){
            System.out.println((char)i);
        }


    }


}

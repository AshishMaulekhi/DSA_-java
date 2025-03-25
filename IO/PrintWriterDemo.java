import java.io.PrintWriter;

public class PrintWriterDemo {
    
    public static void main(String[] args){
        String data = "This is example of print writer";
        try{
            PrintWriter pw = new PrintWriter("abc.txt");
            pw.print(data);
            pw.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

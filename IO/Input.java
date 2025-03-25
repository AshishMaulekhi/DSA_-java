import java.io.*;

public class Input {


    public static void main(String[] args){
        String file = "ex.txt";

        try{
            FileInputStream fileinput = new FileInputStream(file);
            InputStreamReader ir = new InputStreamReader(fileinput);
            BufferedReader br = new BufferedReader(ir);

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
            br.close();
        }catch(IOException i){
            i.printStackTrace();
        }
    }
    
}


class InputTwo {
    public static void main(String[] args) {
        byte arr[] = {1, 2, 3, 4, 5};
        ByteArrayInputStream b = new ByteArrayInputStream(arr);
        
        int byteRead;
        while ((byteRead = b.read()) != -1) {
            System.out.println(byteRead);  // Print the byte value (it will print integer values)
        }
    }
}

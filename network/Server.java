//Asynchronous

import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(777);

        Socket s = ss.accept();
        System.out.println("Connection Established");

        //Attach the ouput stream to serversocket
        OutputStream os = s.getOutputStream();
        //Attach the print stream and send data to server socket
        PrintStream ps = new PrintStream(os);
        String str = "Hello, Client";
        ps.println(str);
        ps.println("Now Server send data to client");
        ps.println("Bye");

        ps.close();
        ss.close();
        s.close();
    }
}

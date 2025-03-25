import java.net.Socket;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost on port 777
            Socket socket = new Socket("localhost", 777);
            System.out.println("Connected to the server");

            // Get input stream to read data from the server
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            // Read and print messages from the server
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("Server says: " + message);
            }

            // Close the reader and socket when done
            reader.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

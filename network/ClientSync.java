import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSync {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost on port 8888
            Socket s = new Socket("localhost", 8888);
            System.out.println("Connected to the server.");

            // Streams for communication with the server
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            // Buffered reader to read from the client-side console
            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverResponse;

            // Infinite loop to send and receive messages between client and server
            while (true) {
                // Prompt user for input
                System.out.print("Client: ");
                clientMessage = kb.readLine().trim();  // Read input from the user and trim spaces

                if (clientMessage.isEmpty()) {
                    System.out.println("Please enter a message before pressing Enter.");
                    continue;  // If input is empty, ask again
                }

                // Send message to server
                dos.writeBytes(clientMessage + "\n");

                // If client sends "exit", break the loop and close connection
                if (clientMessage.equalsIgnoreCase("exit")) {
                    System.out.println("Exiting...");
                    break;
                }

                // Read response from the server
                serverResponse = br.readLine();
                if (serverResponse != null) {
                    System.out.println("Server: " + serverResponse);
                }
            }

            // Close all streams and the socket
            dos.close();
            br.close();
            kb.close();
            s.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSync {
    public static void main(String[] args) throws Exception {
        // Create a server socket listening on port 8888
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Server is waiting for a client connection...");
        
        // Accept a client connection
        Socket socket = serverSocket.accept();
        System.out.println("Connection established with client.");

        // Streams for communication with the client
        BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        DataOutputStream clientOutput = new DataOutputStream(socket.getOutputStream());
        
        // BufferedReader to read from the server-side console
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        String clientMessage, serverResponse;

        // Infinite loop to receive messages from the client and send responses
        while (true) {
            // Read message from client
            clientMessage = clientInput.readLine();
            if (clientMessage != null) {
                System.out.println("Client: " + clientMessage);
            }

            // Read server console input to respond to client
            System.out.print("Server: ");
            serverResponse = kb.readLine();
            clientOutput.writeBytes(serverResponse + "\n"); // Send the server response to client

            if (serverResponse.equalsIgnoreCase("exit")) {
                break; // Exit loop if the server sends "exit"
            }
        }

        // Close the streams and the socket
        clientInput.close();
        clientOutput.close();
        socket.close();
        serverSocket.close();
        System.out.println("Server stopped.");
    }
}

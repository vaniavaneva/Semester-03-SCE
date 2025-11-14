import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public Client(String address, int port) {
        try {
            Socket socket = new Socket(address, port);
            System.out.println("Connected to server.");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);

            System.out.println(in.readUTF());

            while (true) {
                System.out.print("Your guess: ");
                int guess = scanner.nextInt();
                out.writeInt(guess);

                String response = in.readUTF();
                System.out.println("Server: " + response);

                if (response.contains("Winner") || response.contains("Game over")) break;
            }

            socket.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        new Client("127.0.0.1", 5000);
    }
}
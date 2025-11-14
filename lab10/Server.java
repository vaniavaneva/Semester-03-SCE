import java.net.*;
import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Server {

    private static final int MIN = 0;
    private static final int MAX = 10;

    private ServerSocket serverSocket;
    private int secretNumber;
    private AtomicBoolean gameOver = new AtomicBoolean(false);

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started on port " + port);

            secretNumber = MIN + (int)(Math.random() * (MAX - MIN + 1));
            System.out.println("Secret number is generated");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

                new Thread(new ClientHandler(socket, secretNumber, gameOver)).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Server(5000);
    }
}

class ClientHandler implements Runnable {

    private Socket socket;
    private int secretNumber;
    private AtomicBoolean gameOver;

    public ClientHandler(Socket socket, int secretNumber, AtomicBoolean gameOver) {
        this.socket = socket;
        this.secretNumber = secretNumber;
        this.gameOver = gameOver;
    }

    @Override
    public void run() {

        try {
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            out.writeUTF("Connected! Guess number (0-10): ");

            while (!gameOver.get()) {

                int guess = in.readInt();

                if (guess == secretNumber) {
                    out.writeUTF("Correct you win");
                    gameOver.set(true);
                } else if (guess < secretNumber) {
                    out.writeUTF("Guess higher");
                } else {
                    out.writeUTF("Guess lower");
                }
            }

            out.writeUTF("Game over someone already guessed");
            socket.close();

        } catch (IOException e) {
            System.out.println("Client disconnected");
        }
    }
}

// cd lab10
// javac Server/Client.java
// java Server/Client.com
// https://www.geeksforgeeks.org/java/socket-programming-in-java/
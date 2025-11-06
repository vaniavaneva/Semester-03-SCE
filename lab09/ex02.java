import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class ex02 {
    static final int PORT = 80;
    static final int TIMEOUT = 2500;
    static final String HOST_NAME = "www.kst.tugab.bg";
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getByName(HOST_NAME);
        } catch(UnknownHostException ex) {
            System.out.println("Unknown host name.");
            return;
        }
        try (Socket socket = new Socket()) {
            try {
                socket.connect(new InetSocketAddress(ip, PORT), TIMEOUT);
                System.out.println("Port " + PORT + " is open.");
            } catch(SocketTimeoutException ex) {
                System.out.println("No server answer.");
            } catch(IOException ex){
                System.out.println("Port " + PORT + " is closed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Port " + PORT + " is closed.");
        }
    }
}

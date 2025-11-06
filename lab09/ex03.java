import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class ex03 {
    static final int START_PORT = 1;
    static final int END_PORT = 1024;
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
        for (int i = START_PORT; i <= END_PORT; i++) {
            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(ip, i), TIMEOUT);
                System.out.println("Port " + i + " is open.");
            } catch (SocketTimeoutException ex) {
                System.out.println("Port " + i + " -> No server answer (timeout).");
            } catch (IOException ex) {
                System.out.println("Port " + i + " is closed.");
            }
        }
    }
}

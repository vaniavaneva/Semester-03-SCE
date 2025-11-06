import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ex04 {
    static final int START_PORT = 1;
    static final int END_PORT = 1024;
    static final int TIMEOUT = 100000;
    static final String HOST_NAME = "www.kst.tugab.bg";

    static Socket socket;
    static InetAddress ip;

    static class ScanThread extends Thread{
        public ScanThread(String s) {super(s);}
        @Override
        public void run(){
            int port = Integer.parseInt(getName());
            try {
                try (Socket socket = new Socket()) {
                    socket.connect(new InetSocketAddress(ip, port), TIMEOUT);
                }
                System.out.println(port);
            } catch(IOException ex){}
            finally {
                socket = null;
            }
        }
    }

    public static void main(String[] args) {
        try{
            ip = InetAddress.getByName(HOST_NAME);
        } catch(UnknownHostException ex) {
            System.out.println("Invalid host name.");
            return;
        }
        System.out.println("Open ports");
        for(int i = START_PORT; i < END_PORT; i++){
            (new ScanThread("" + i)).start();
        }
    }
}

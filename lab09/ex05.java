package lab09;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ex05 {
    static final int START_PORT = 1;
    static final int END_PORT = 1024;
    static final int TIMEOUT = 2500;
    static final String HOST_NAME = "www.kst.tugab.bg";

    static InetAddress ip;

    public static void main(String[] args) {
        try{
            ip = InetAddress.getByName(HOST_NAME);
        } catch(UnknownHostException ex) {
            System.out.println("Invalid host name.");
            return;
        }
        ExecutorService fixedExecutor = Executors.newFixedThreadPool(20);
        System.out.println("Open ports");
        for(int i = START_PORT; i < END_PORT; i++){
            final int current = i;
            fixedExecutor.execute(() -> scanPort(current));
        }
        fixedExecutor.shutdown();
        try{
            if(!fixedExecutor.awaitTermination(TIMEOUT, TimeUnit.SECONDS)){
                fixedExecutor.shutdownNow();
            }
        } catch(InterruptedException ex){
            fixedExecutor.shutdownNow();
        }
    }

    static void scanPort(int port) {
        try (Socket socket = new Socket()){
            socket.connect(new InetSocketAddress(ip, port), TIMEOUT);
            System.out.println(port);
        } catch(IOException ignore){}
    }
}
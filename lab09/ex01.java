package lab09;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ex01 {

    final static String REQUEST = "https://www.fbi.gov";

    public static void main(String[] args) {
        try{
            URL server = new URL(REQUEST);
            URLConnection conn = server.openConnection();
            String serverInfo = conn.getHeaderField("Server");
            if(serverInfo!=null){
                System.out.println(serverInfo);
            } else {
                if(conn.getContentLength() == -1){
                    System.out.println("No connection/host.");
                } else {
                    System.out.println("No name for web server");
                }
            }
        } catch(MalformedURLException ex) {
            System.out.println("Invalid syntax");
        } catch(IOException ex) {
            System.out.println("Error with server communication.");
        }
    }
}

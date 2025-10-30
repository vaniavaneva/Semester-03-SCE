import java.net.*;

public class amazonAddresses {
   public static void main(String args[]) {
      try {
         String hostName = "amazon.com";
         InetAddress[] host = InetAddress.getAllByName(hostName);
         System.out.println("Host name: "+hostName);
         System.out.println("IP addresses: ");
         for(InetAddress addr : host){
            System.out.println(addr);
         }
      } catch(UnknownHostException ex) {
         System.out.println("Unknown host");
         return;
      }
   }
}
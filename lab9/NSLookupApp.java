import java.net.*; 
public class NSLookupApp {
   public static void main(String args[]) {
      try {
            if(args.length!=1){ 
               System.out.println("Usage: java NSLookupApp hostName"); 
               return; 
           }
            InetAddress[] host = InetAddress.getAllByName(args[0]);
            String hostName = args[0];
            System.out.println("Host name: "+hostName); 
           System.out.println("IP addresses: ");
         for(InetAddress addr : host){
            System.out.println(addr);
         }
      }
      catch(UnknownHostException ex) { 
            System.out.println("Unknown host");
            return; 
      }
   }
}

// cd lab9
// javac NSLookupApp.java
// java NSLookupApp amazon.com
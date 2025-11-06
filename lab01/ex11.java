package lab01;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 2 == 0){
            System.out.print("Polojitelno");
        }
        else{
            System.out.print("Otricatelno");
        }
        in.close();
    }
}

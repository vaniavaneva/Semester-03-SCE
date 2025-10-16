package lab1;
import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n >= 1 && n <= 3){
            System.out.print(n + "0");
        }
        else if(n > 3 && n <= 6){
            System.out.print(n + "00");
        }
        else if(n > 6 && n <= 9){
            System.out.print(n + "000");
        }
        else{
            System.out.print("Error");
        }
        in.close();
    }
}

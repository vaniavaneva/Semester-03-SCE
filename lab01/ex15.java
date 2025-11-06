package lab01;
import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        switch (n) {
            case 0:
                System.out.print("nula");
                break;
            case 1:
                System.out.print("edno");
                break;
            case 2:
                System.out.print("dve");
                break;
            case 3:
                System.out.print("tri");
                break;
            case 4:
                System.out.print("chetiri");
                break;
            case 5:
                System.out.print("pet");
                break;
            case 6:
                System.out.print("shest");
                break;
            case 7:
                System.out.print("sedem");
                break;
            case 8:
                System.out.print("osem");
                break;
            case 9:
                System.out.print("devet");
                break;    
            default:
                break;
        }
        in.close();
    }
}

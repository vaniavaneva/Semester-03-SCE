package lab01;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double out = Math.pow(2, n);
        System.out.println(out);
        in.close();
    }
}

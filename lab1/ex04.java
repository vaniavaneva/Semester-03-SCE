package lab1;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double num, sum = 0;
        for(int i = n; i > 0; i--){
            num = in.nextDouble();
            sum += num;
        }
        double out = sum / n;
        System.out.printf("%.2f%n", out);
        in.close();
    }
}

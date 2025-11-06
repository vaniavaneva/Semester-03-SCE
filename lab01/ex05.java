package lab01;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), counter = 0;
        double sum = 0;
        while(n > 0){
            sum += n;
            n = in.nextInt();
            counter++;
        }
        double out = sum / counter;
        System.out.printf("%.2f%n", out);
        in.close();
    }
}

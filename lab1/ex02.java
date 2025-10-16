package lab1;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            double n = in.nextDouble();
        while(n > 0){
            System.out.printf("Result: %.2f%n", n * 2);
            n = in.nextDouble();
        }
        System.out.print("Negative number!");
        in.close();
    }
}

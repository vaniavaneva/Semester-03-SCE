package lab01;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }

        System.out.print(sum);
        in.close();
    }
}
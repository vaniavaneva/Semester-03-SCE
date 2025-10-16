package lab1;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0, pr = 1, counter = 0;
        while(n <= 10 && n >= -10){
            if(n > 0){
                sum += n;
                pr *= n;
                counter++;
            }
            n = in.nextInt();
        }
        System.out.print("Sum = " + sum + ", Proiz= " + pr + ", Broi= " + counter);
        in.close();
    }
}

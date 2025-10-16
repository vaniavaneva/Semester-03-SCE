package lab2;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = 1, plus = 0;
        System.out.print("Numbers^3: ");
        for(int i = n; i <= m; i++){
            x *= i;
            plus += i;
            System.out.printf("%.0f ", Math.pow(i, 3));
        }
        System.out.printf("\nNumbers multiplied: %d\nNumbers'sum: %d\n", x, plus);
        in.close();
    }
}

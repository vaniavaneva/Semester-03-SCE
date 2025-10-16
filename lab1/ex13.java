package lab1;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your weight on Earth: ");
        double earth = in.nextDouble();
        double moon = earth * 0.83;
        System.out.printf("%.2f is your weight on the Moon", moon);
        in.close();
    }
}


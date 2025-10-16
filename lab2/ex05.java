package lab2;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallInCar = in.nextDouble();
        double miles = in.nextDouble();
        double price = in.nextDouble();
        System.out.printf("Can go for %.2f miles with %.2f gallons fuel.",
         miles / gallInCar, gallInCar);
        System.out.printf("Cost for fuel to drive for 100 miles is %.2f", miles * 100 * price);
        in.close();
    }
}

package lab02;

import java.util.Random;
import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(16) + 85; // 0–15 + 85 = [85,100]
            if(arr[i] % 2 != 0){
                System.out.printf("Odd num %d [%d]\n", arr[i], i);
            }
            if(arr[i] % 2 == 0){
                System.out.printf("Even num %d^3 = %.0f\n", arr[i], Math.pow(arr[i], 3));
            }
        }
        in.close();
    }
}
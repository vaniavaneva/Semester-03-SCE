package lab3;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = 1;
        int current = 1;
        int end = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i] > arr[i - 1]) {
                current++;
            } else {
                current = 1;
            }
            if(current > max) {
                max = current;
                end = i;
            }
        }
        System.out.println("Longest increasing row of elements:");
        System.out.print("{ ");
        for(int i = end - max + 1; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("}");
        in.close();
    }
}

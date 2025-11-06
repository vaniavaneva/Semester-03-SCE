package lab03;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        int max = 1;
        int current = 1;
        int element = arr1[0];
        for(int i = 1; i < n; i++) {
            if(arr1[i] == arr1[i - 1]) {
                current++;
            } else {
                current = 1;
            }

            if(current > max) {
                max = current;
                element = arr1[i];
            }
        }
        System.out.print("Longest row of same elements: ");
        System.out.print("{ ");
        for(int i = 0; i < max; i++) {
            System.out.print(element + " ");
        }
        System.out.println("}");
        in.close();
    }
}

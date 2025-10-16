package lab3;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            int max = i; //min = i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) { //if (arr[j] < arr[min]) {
                    max = j; //min = j;
                }
            }
            int temp = arr[max]; //int temp = arr[min];
            arr[max] = arr[i]; //arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.print("Sorted array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        in.close();
    }
}

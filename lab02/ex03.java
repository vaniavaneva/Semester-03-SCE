package lab02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n <= 0 || n > 20){
            n = in.nextInt();
        }
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            do {
                arr[i] = in.nextInt();
                if (arr[i] < 10 || arr[i] > 25) {
                System.out.println("Number must be [10;25] enter again");
                }
            } while (arr[i] < 10 || arr[i] > 25);
        }
        int biggest = arr[0], index = 0;
        for(int i = 1; i < n; i++){
            if(biggest < arr[i]){
                biggest = arr[i];
                index = i;
            }
        }
        System.out.printf("Biggest element is %d [%d]\n", biggest, index);
        in.close();
    }
}

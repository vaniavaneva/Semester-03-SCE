package lab3;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr1 = new int[n];
        Add(arr1, in);
        int[] arr2 = new int[m];
        Add(arr2, in);
        boolean result = Same(arr1, arr2);
        System.out.print("Are arrays the same? : ");
        System.out.println(result);
    }
    private static void Add(int[] arr, Scanner in){
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
    }
    private static boolean Same(int[] arr1, int[] arr2){
        boolean result = false;
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    result = false;
                }
                else{
                    result = true;
                }
            }
        }
        else{
            result = false;
        }
        return result;
    }
}


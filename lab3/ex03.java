package lab3;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] chars1 = new char[n];
        char[] chars2 = new char[n];
        Add(chars1, in);
        Add(chars2, in);
        int score1 = 0, score2 = 0;
        for(int i = 0; i < chars1.length; i++) {
            int result = Character.compare(chars1[i], chars2[i]);
            if (result < 0) {
                score1++;
            } else if (result > 0) {
                score2++;
            }
        }
        if(score1 > score2) {
            System.out.println("Array 1 has more chars ahead");
        } else if(score2 > score1) {
            System.out.println("Array 2 has more chars ahead");
        } else {
            System.out.println("Both arrays have the same result");
        }
        System.out.println("Result: arr1 = " + score1 + ", arr2 = " + score2);
        in.close();
    }
    private static void Add(char[] arr, Scanner in){
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.next().charAt(0);
        }
    }
}

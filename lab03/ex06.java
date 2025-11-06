package lab03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(in.nextInt());
        }
        Collections.sort(arr, Collections.reverseOrder());
        System.out.print("Largest elements: ");
        for(int i = 0; i < k && i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
            sum += arr.get(i);
        }
        System.out.println("\nSum of these elements = " + sum);
        in.close();
    }
}

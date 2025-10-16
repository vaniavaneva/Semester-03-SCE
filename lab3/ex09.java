package lab3;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int target = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        boolean found = false;
        for(int start = 0; start < n; start++) {
            int current = 0;
            for(int end = start; end < n; end++) {
                current += arr[end];
                if(current == target) {
                    found = true;
                    System.out.print("{ ");
                    for(int k = start; k <= end; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println("}");
                    break;
                }
            }
            if(found) break;
        }
        if(!found) {
            System.out.println("No sequence found with sum " + target);
        }
        in.close();
    }
}

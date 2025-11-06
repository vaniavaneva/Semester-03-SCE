package lab03;
import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int mostFreq = arr[0];
        int max = 1;
        for(int i = 0; i < n; i++) {
            int count = 1;
            for(int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                mostFreq = arr[i];
            }
        }
        System.out.printf("Most frequent number: %d (%d times)\n", mostFreq, max);
        in.close();
    }
}

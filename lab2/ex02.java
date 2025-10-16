package lab2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i+=3){
            System.out.println(i);
        }
        in.close();
    }
}

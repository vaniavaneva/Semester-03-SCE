package lab3;

public class ex01 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int i = 0; i < 20; i++){
            arr[i] = i * 5;
            System.out.printf("Element [%d] * 5 = %d\n", i, arr[i]);
        }
    }
}

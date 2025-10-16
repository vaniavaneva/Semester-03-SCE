package lab1;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Orhidei: ");
        n = in.nextInt();
        double orh = n * 13.25;
        
        System.out.print("Zyumbyuli: ");
        n = in.nextInt();
        double zyu = n * 5.0;
        
        System.out.print("Rozi: ");
        n = in.nextInt();
        double roz = n * 8.5;
        
        System.out.print("Kaktusi: ");
        n = in.nextInt();
        double kak = n * 8;
        
        System.out.print("Laleta: ");
        n = in.nextInt();
        double lal = n * 3.0;
        
        System.out.print("Cena telefon: ");
        double cena = in.nextDouble();
        
        double obshto = (orh + zyu + roz + kak + lal) * 0.93;
        
        if(obshto > cena){
            int rounded = (int) Math.floor(obshto - cena);
            System.out.print("She is left with " + rounded + " leva.");
        }
        else{
            int rounded = (int) Math.ceil(cena - obshto);
            System.out.printf("She will have to borrow "+ rounded +" leva.");
        }
        in.close();
    }
}

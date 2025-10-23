package lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int n = in.nextInt();
            int[] years = new int[n];
            for(int i = 0; i < n; i++){
                years[i] = in.nextInt();
            }
            for(int y : years){
                System.out.println(isLeap(y));
            }
        } catch(InputMismatchException ex){
            System.out.println(ex.getMessage());
        } catch(NegativeArraySizeException ex){
            ex.printStackTrace();
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        finally
        {
            in.close();
        }
    }

    public static boolean isLeap(int y){
        if(y % 4 == 0 && (y % 400 == 0 || y % 100 != 0)){
            return true;
        }
        else return false;
    }
}

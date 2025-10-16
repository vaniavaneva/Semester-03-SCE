package lab3;

public class ex10 {
    public static void main(String[] args) {

        int[][] arr = new int[][] {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        // a)
        // for(int i = 0; i < arr.length; i++){ //column -
        //     for(int j = 0; j < arr[i].length; j++){ //row |
        //         System.out.print(arr[j][i] + " ");
        //     }
        //     System.out.println();
        // }

        int[][] transArr = new int[4][4];
        for(int i = 0; i < arr.length; i++){
            // if(i % 2 != 0){
            //     for(int j = 3; j >= 0; j--){
            //         transArr[j][i] = arr[i][j];
            //     }
            // }
            // else{
                for(int j = 0; j < arr[i].length; j++){  
                    transArr[i][j] = arr[j][i];
                }
            }
        // }

        for(int i = 0; i < transArr.length; i++){ //column -
            for(int j = 0; j < transArr[i].length; j++){ //row |
                System.out.print(transArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("%n %n");

        for(int i = 0; i < 4; i++){ // row |
            if(i % 2 == 0){for(int j = 0; j < 4; j++){System.out.print(transArr[j][i] + " ");}}
            else{for(int j = 3; j >= 0; j--){System.out.print(transArr[j][i] + " ");}}
            System.out.println();
        }
    }
}
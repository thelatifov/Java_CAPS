package Ders;

public class TwoDimesionalArray {
    public static void main(String[] args) {
          //iki olculu array massiv icerisinde massiv saxlamaq
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
                
            }

        }
    }
}

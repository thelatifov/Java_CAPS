package DataTypes;

import java.util.Arrays;

public class HomeWork3 {
    static void main() {
        int [] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] =(int) (Math.random()*(100 - 20))+20;

        }
        System.out.println(Arrays.toString(arr1));


    }
}

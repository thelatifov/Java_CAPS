package Ders;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//Buradaki intin icindeki ededlerin cemini tapmaq
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        System.out.println(sum);
        //System.out.println(Arrays.stream(arr).sum());
// Array elemenlerin bele cap etmek olmaz.
        //System.out.println(arr);
        //System.out.println(arr[0]);
//
//        String[] a = {"a", "b", "c"};
//        System.out.println(a[0].toUpperCase());


    }
}

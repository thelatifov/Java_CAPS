package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {

        ArrayList<Integer> siyahi = new ArrayList<>();

//        siyahi.add(10);
//        siyahi.add(20);
//        siyahi.add(30);
//        siyahi.add(40);
//
//        System.out.println("Siyahi: " + siyahi);
//
//        System.out.println("Elementle:");
//        for (int eded : siyahi) {
//            System.out.println(eded);
//        }

//        int cem = 0;

//// Siyahıdakı ededlerin cemi
//        for (int eded : siyahi) {
//            cem += eded;
//        }
//
//        System.out.println("Ededlerin cemi: " + cem);
//

//        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "code", "loop"));
//        for (String word : words) {
//            System.out.println(word.toUpperCase());
//        }

        //en boyuk ededi tap

//        int[] nums = {4, 9, 1, 15, 3};
//
//        int max = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] > max) {
//                max = nums[i];
//            }
//        }
//        System.out.println("En boyik: " + max);


        String[] names = {"Orxan", "Aysel", "Leman", "Eli", "Cavid"};
        int say = 0;

        for (String ad : names) {
            if (ad.length() == 5) {
                say++;
            }
        }

        System.out.println("Uzunlugu 5 olan: " + say);

    }
}

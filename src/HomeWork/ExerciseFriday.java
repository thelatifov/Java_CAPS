package HomeWork;

import java.util.ArrayList;

public class ExerciseFriday {
    public static void main(String[] args) {
        //Nece dene tek ve cut eded var.
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int tek = 0;
//        int cut = 0;
//        for (int num : arr) {
//            if (num % 2 == 0) cut++;
//            else tek++;
//        }
//        System.out.println("cut = " + cut);
//        System.out.println("tek = " + tek);
// Ededleri tersine siralamaq.
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        for (int i=arr.length-1; i>=0; i--) {
//            System.out.println(arr[i]);
//
//        }
//
//        //Ededi ortani tapin. Ondan boyuk ededleri gosterin
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            sum %= arr.length;
//
//        }
//        System.out.println("ededi orta:" + sum);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > sum) {
//                System.out.println("Boyuk ededler:" + arr[i]);
//            }
//
//        }

        //Ededlerden ortaq olanlarinini cixaririq.
//        int[] arr = {1, 2, 2, 3, 4, 4, 7, 7, 8};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.print(arr[i] + " ");
//                }
//            }
//        }


        //1-den 100-e qeder ededlerin kvdrati
//
//        int i = 1;
//        long cem = 0;
//        do {
//            int kvadrat = i * i;
//            System.out.println(kvadrat);
//            cem+=kvadrat;
//            i++;
//        } while (i <= 10);
//        System.out.println(cem);
//

        //Her hansi ededin cemi 345=12
//        int eded = 345;
//        int cem = 0;
//        int qaliq;
//        do {
//            qaliq = eded % 10;
//            cem += qaliq;
//            eded = eded / 10;
//        } while (eded > 0);
//        System.out.println(cem);


        //ArrayList

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        names.add("Ruslan");
        numbers.add(20);
        System.out.println(numbers+" "+names);

    }
}

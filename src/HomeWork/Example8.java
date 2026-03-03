package HomeWork;

import java.util.Scanner;

public class Example8 {
    static void main() {
        //Tələblər:
        //
        //İstifadəçidən n ədədini al — massiv ölçüsü.
        //
        //n elementlik massiv yarat.
        //
        //Hər elementi 1 ilə 100 arasında təsadüfi ədədlə doldur (Math.random() istifadə et).
        //
        //Massivin:
        //
        //ən böyük ədədini tap,
        //
        //ən kiçik ədədini tap,
        //
        //ortalamasını hesabla.

        Scanner sc = new Scanner(System.in);
        System.out.print("Userden eded al: ");
        int n = sc.nextInt();

        int[] massive = new int[n];
        int cem = 0;
        System.out.println("Yaradilan Massiv");
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * (100 - 1) + 1);
            System.out.print(massive[i] + " ");

            cem += massive[i];


        }
        int boyuk = Integer.MIN_VALUE;
        int kicik = Integer.MAX_VALUE;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > boyuk) {
                boyuk = massive[i];
            }
            if (massive[i] < kicik) {
                kicik = massive[i];
            }
        }
        double ortalama = cem / n;
        System.out.println();
        System.out.println("En boyuk: " + boyuk);
        System.out.println("En kicik: " + kicik);
        System.out.println("En ortalama: " + ortalama);
    }
}

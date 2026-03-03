package HomeWork;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ballar = new int[10];
        double cem = 0;

        System.out.println("10 neferin bali:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". bali: ");
            ballar[i] = scanner.nextInt();
            cem += ballar[i];
        }

        double ortalama = cem / 10;
        System.out.println("Qrupun bali ortalama: " + ortalama);

        System.out.println("Ortalamani kecen ballar:");
        for (int i = 0; i < 10; i++) {
            if (ballar[i] > ortalama) {
                System.out.println(ballar[i] + " bal Telebe " + (i + 1));
            }
        }


    }
}



package DataTypes;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_18_01 {
    static void main() {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> qiymetler = new ArrayList<>();
        String cavab;
        double cem = 0;
        do {
            System.out.print("Telebenin qiymetini daxil edin: ");
            int qiymet = input.nextInt();
            qiymetler.add(qiymet);
            cem += qiymet;

            System.out.print("Davam etmek isteyirsiniz? B/X: ");
            cavab = input.next();
        } while (cavab.equalsIgnoreCase("B"));

        if (qiymetler.size() > 0) {
            double ortalama = cem / qiymetler.size();
            int telebe = 0;
            for (int i = 0; i < qiymetler.size(); i++) {
                if (qiymetler.get(i) > ortalama) {
                    telebe++;
                }
            }
            System.out.println("Daxil edilen qiymet: " + qiymetler.size());
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Kecen Telebe sayi: " + telebe);

        }

    }
}

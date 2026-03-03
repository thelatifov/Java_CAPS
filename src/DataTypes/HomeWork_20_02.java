package DataTypes;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_20_02 {
    static void main() {
        Scanner rdInt = new Scanner(System.in);
        Scanner rdString = new Scanner(System.in);
        ArrayList<Integer> ballar = new ArrayList<>();
        ArrayList<Integer> highBallar = new ArrayList<>();
        String cavab = "";
        int yanlis = 0;
        int cem = 0;
        do {
            System.out.print("Bali daxil edin (0-100 arasi): ");
            int bal = rdInt.nextInt();
            if (bal >= 0 && bal <= 100) {

                ballar.add(bal);
                cem += bal;
            } else {
                System.out.println("Sehv bal secimi yalniz 0-100 arasi!");

                yanlis++;

            }

            do {


                System.out.print("Davam edek? B/X: ");
                cavab = rdString.nextLine();
                if (!cavab.equalsIgnoreCase("B") && !cavab.equalsIgnoreCase("X")) {
                    System.out.println("Sehv secim yalniz B/X!");
                    yanlis++;

                }
            } while (!cavab.equalsIgnoreCase("B") && !cavab.equalsIgnoreCase("X"));
        } while (cavab.equalsIgnoreCase("B"));
        int ortalama = cem / ballar.size();
        System.out.println("Umumi cem: " + cem);
        System.out.println("Umumi ortalama: " + ortalama);
        System.out.println("Umumi balar: " + ballar);
        System.out.println("Yanlis secimler: " + yanlis);
        for (int i = 0; i < ballar.size(); i++) {
            if (ballar.get(i) > ortalama) {
                highBallar.add(ballar.get(i));
                System.out.println((i + 1) + ". telebe kecdi: " + ballar.get(i));
            }
        }
        int highCem = 0;
        for (int integer : highBallar) {
            highCem += integer;
        }

        int highOrtalama = highCem / highBallar.size();
        System.out.println("High ortalama: " + highOrtalama);

        for (int j = 0; j < highBallar.size(); j++) {
            if (highBallar.get(j) > highOrtalama) {
                System.out.println("High Ballar: " + highBallar);
                System.out.println((j + 1) + ". siradaki kecdi: " + highBallar.get(j));
            }
        }


    }
}

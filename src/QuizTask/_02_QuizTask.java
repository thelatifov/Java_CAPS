package QuizTask;

import java.util.ArrayList;
import java.util.Scanner;

// neçe telebe olacaq onu sorusursuz daha sonra  ad ve balini daxil edirsiz sonra umumi
// orta bal hesablanir en yuksek ve en asagi bali tapirsiz
// neticeni ekrana cap edirsiz en sonda ortalamadan daha yuksek neticesi olan
// telebe ve ya telebelerin adini ve balini ekrana cap edirsiz

public class _02_QuizTask {
    static void main() {
        int cem = 0;
        ArrayList<String> adlar = new ArrayList<>();
        ArrayList<Integer> ballar = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nece telebe olacaq: ");
        int telebeSayi = sc.nextInt();

        for (int i = 0; i < telebeSayi; i++) {
            System.out.print((i + 1) + ". Telebenin adi: ");
            adlar.add(sc.next());
            System.out.print((i + 1) + ". Telebenin bali: ");
            int bal = sc.nextInt();
            ballar.add(bal);
            cem += bal;

        }
        int ortalama = cem / telebeSayi;
        int maxBal = Integer.MAX_VALUE;
        int minBal = Integer.MIN_VALUE;
        for (int bal : ballar) {
            if (bal < maxBal) maxBal = bal;
            if (bal > minBal) minBal = bal;
        }
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Max: " + minBal);
        System.out.println("Min: " + maxBal);
        System.out.println("\n********************\n");
        System.out.println("Ortalamani kecenler");
        for (int i = 0; i < ballar.size(); i++) {
            if (ballar.get(i) > ortalama) {
                System.out.println("Ad: " + adlar.get(i) + " Bal: " + ballar.get(i));
            }

        }


        System.out.println("Ortalamani kecmeyenler");

        for (int i = 0; i < ballar.size(); i++) {
            if (ballar.get(i) <= ortalama) {
                System.out.println("Ad: " + adlar.get(i) + " Bal: " + ballar.get(i));
            }

        }

    }
}

package HomeWork;

import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] ededler = new int[5];
        int menfiSay = 0;

        System.out.println("5 eded daxil edin:");
        for (int i = 0; i < ededler.length; i++) {
            System.out.print((i + 1) + "-ci eded: ");
            ededler[i] = scanner.nextInt();
        }

        int enBoyuk = ededler[0];

        System.out.print("Daxil edilen ededler: ");

        for (int eded : ededler) {
            System.out.print(eded + " ");

            if (eded > enBoyuk) {
                enBoyuk = eded;
            }

            if (eded < 0) {
                menfiSay++;
            }
        }

        System.out.println("\n-------------------------");
        System.out.println("Boyuk eded: " + enBoyuk);
        System.out.println("Menfilerinn sayi: " + menfiSay);
    }
}

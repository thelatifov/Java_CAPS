package HomeWork;
import java.util.Scanner;
public class HomeWork6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Telebenin adini daxil edin: ");
        String ad = scanner.nextLine();

        int[] ballar = new int[3];
        int cem = 0;

        for (int i = 0; i < ballar.length; i++) {
            System.out.print((i + 1) + ". imtahan balini daxil edin: ");
            ballar[i] = scanner.nextInt();
            cem += ballar[i];
        }

        int ortalama = cem / ballar.length;

        String netice;
        if (ortalama >= 80) {
            netice = "Ugurlu";
        } else if (ortalama >= 50) {
            netice = "Orta";
        } else {
            netice = "Ugursuz";
        }

        System.out.println("\n--- Telebe Melumatlari---");
        System.out.println("Ad: " + ad);
        System.out.print("Ballar: ");
        for (int bal : ballar) {
            System.out.print(bal + " ");
        }
        System.out.println("\nOrtalama: " + ortalama);
        System.out.println("Netice: " + netice);
        System.out.println("--------------------------");


    }
}

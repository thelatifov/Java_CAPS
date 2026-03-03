package HomeWork;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        Scanner daxilEt = new Scanner(System.in);
        String giris = "";

        System.out.println("Deyandirmaq ucun X bas");

        do {
            System.out.print("Nese yaz: ");
            giris = daxilEt.next();

            if (!giris.equalsIgnoreCase("X")) {
                System.out.println("Senin yazin " + giris);
            }

        } while (!giris.equalsIgnoreCase("X"));

        System.out.println("Program sonlandi.");

        
    }
}

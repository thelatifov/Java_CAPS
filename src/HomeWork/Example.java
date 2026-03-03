package HomeWork;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner daxilEt = new Scanner(System.in);
        int cem = 0;
        int saygac = 0;
        while (saygac < 10) {
            System.out.print("10 dene eded daxil et:");
            int eded = daxilEt.nextInt();
            if (saygac < 10) {
                cem += eded;
            }
            saygac++;
        }
        System.out.println("cem: " + cem);
    }
}

package HomeWork;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner parol = new Scanner(System.in);
        String parolumuz = "java123";
        String parolyaz;

        boolean bl = true;
        while (bl) {
            System.out.print("sifreni yaz: ");
            parolyaz = parol.next();

            if (parolyaz.equals(parolumuz)) {
                System.out.println("giris ugurlu");

                bl = false;
            } else {

                System.out.println("Sehvdir...");
            }
        }


    }
}

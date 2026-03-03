package HomeWork;

import java.util.Scanner;

public class LoginParol {
    public static void main(String[] args) {


        Scanner parol = new Scanner(System.in);
        String username = "java";

        String parolumuz = "java123";
        String parolyaz;
        String useryaz;

        int count = 3;

        boolean bl = true;
        while (bl) {
            System.out.print("Login: ");
            useryaz = parol.next();
            System.out.print("parol: ");

            parolyaz = parol.next();

            if (parolyaz.equals(parolumuz) && useryaz.equals(username)) {
                System.out.println("giris ugurlu");

                bl = false;
            } else if (!parolyaz.equals(parolumuz) || !useryaz.equals(username)) {

                count--;

                System.out.println("Sehvdir... " + count + " cehdiniz qaldi");
            }
            if (count <= 0) {
                System.out.println("Cehdiniz qalmadi");
                break;
            }
        }


    }
}

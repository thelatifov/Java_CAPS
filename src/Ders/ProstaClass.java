package Ders;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProstaClass {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String secim = "1.Toplama \n" +
//                "2.chixma\n" +
//                "3.vurma \n" +
//                "4.bolme";
//        System.out.println("bir islem secin: ");
//        int islem = input.nextInt();

//        switch (islem) {
//            case 1:
//                System.out.println("1 ci ededi sec: ");
//                int a = input.nextInt();
//                System.out.println("2ci ededi sec: ");
//                int b = input.nextInt();
//                System.out.println(a + b);
//                break;
//            case 2:
//                System.out.println("1 ci ededi sec: ");
//                int c = input.nextInt();
//                System.out.println("2ci ededi sec: ");
//                int d = input.nextInt();
//                System.out.println(c - d);
//                break;
//            case 3:
//                System.out.println("1 ci ededi sec: ");
//                int e = input.nextInt();
//                System.out.println("2ci ededi sec: ");
//                int f = input.nextInt();
//                System.out.println(e * f);
//                break;
//            case 4:
//                System.out.println("1 ci ededi sec: ");
//                int g = input.nextInt();
//                System.out.println("2ci ededi sec: ");
//                int h = input.nextInt();
//                System.out.println(g / h);
//                break;
//            default:
//                System.out.println("Bele emeliyyat yoxdur.");
//        }
//------------------------------------------------------

        //1-den 10-a qeder reqemleri konsola cixarmaq
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//
//        }
        //----------------------------------------------

// 1-den 100 e qeder cut ededler
//        for (int i = 2; i <=100 ; i=i+2) {
//            System.out.println(i);
//
//        }
        Scanner input = new Scanner(System.in);
        String name = "Ruslan";
        String password = "ruslan";
        System.out.println("Adinizi daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Parolunuzu daxil edin:");
        String parol = scanner.nextLine();

        while (true) {
            if (!username.equals(name) && parol.equals(password)) {
                System.out.println("Adinizi yeniden daxil edin");
                username = scanner.nextLine();

            } else if (username.equals(name) && !parol.equals(password)) {
                System.out.println("Sifrenizi yeniden daxil edin: ");
                parol = scanner.nextLine();


            } else if (username.equals(name) || parol.equals(password)) {
                System.out.println("Giris tesdiqlendi");
                break;
            } else {
                System.out.println("Giris tesdiqlenmedi");
                break;
            }

        }


    }
}

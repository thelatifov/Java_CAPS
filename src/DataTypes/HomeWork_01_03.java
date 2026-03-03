package DataTypes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork_01_03 {
    static void main() {
        // Canli Luget yaratmaq istenilir (Map istifade edin)
        // Istifadeci ucun asagidaki kimi bir menyu cixmalidir
        // 1 - Elave et (Bu hissede soz ve menasi alinmalidir)
        // 2 - Redakte et (Bu secimde istifadeciden menasini deyismek istenilir)
        // 3 - Siyahini goster (Butun soz ve menalar)
        // 4 - Axtaris (Axtarilan sozun menasi cixmalidir)
        // 5 - Sil
        // 6 - Cixis

        //QEYD : Redakte et ucun -> Eyni key ucun yeni value teyin etmek mumkundur,
        //    yeni value-ni put etmek ucun key oldugu kimi qalir, value-ni ferqli yazsaniz update olacaq

        Scanner rdInt = new Scanner(System.in);
        Scanner rdStr = new Scanner(System.in);

        HashMap<String, String> luget = new HashMap<>();
        int secim;
        do {
            System.out.println("\nCanli Luget Menu");
            System.out.println("1 - Elave et");
            System.out.println("2 - Redakte et");
            System.out.println("3 - Siyahida goster");
            System.out.println("4 - Axtaris");
            System.out.println("5 - Sil");
            System.out.println("6 - Cixis");
            System.out.print("Seciminiz: ");
            //secim = rdInt.nextInt();
            if (rdInt.hasNextInt()) {
                secim = rdInt.nextInt();

                if (secim < 1 || secim > 6) {
                    System.out.println("Sehv secim! Yalniz 1-6 arasi reqem daxil edin.");
                }
            } else {
                System.out.println("Error: Herf ve ya simvol daxil edile bilmez! Sadece reqem yazin.");
                rdInt.next();
                secim = 0;
            }
            switch (secim) {
                case 1:
                    System.out.print("Elave edilecek soz: ");
                    String yeniSoz = rdStr.next();
                    System.out.print("Sozun menasi: ");
                    String mena = rdStr.next();
                    luget.put(yeniSoz, mena);
                    System.out.println("Soz elave edildi");
                    break;

                case 2:
                    System.out.print("Redaketde etmek istediyiniz soz: ");
                    String redakteSoz = rdStr.next();
                    if (luget.containsKey(redakteSoz)) {
                        System.out.print("Yeni menani daxil edin: ");
                        String yeniMena = rdStr.next();
                        luget.put(redakteSoz, yeniMena);
                        System.out.println("Mena yenilendi.");
                    } else {
                        System.out.println("Bu soz lugetde tapilmadi.");
                    }
                    break;
                case 3:
                    System.out.println("\nButun Sozler\n");
                    if (luget.isEmpty()) {
                        System.out.println("Lugetde Soz yoxdur.");
                    } else {
                        for (Map.Entry<String, String> sozler : luget.entrySet()) {
                            System.out.println("Soz: " + sozler.getKey() + " " + "Mena: " + sozler.getValue());
                        }
                    }
                    break;
                case 4:
                    System.out.print("Axtardiginiz Soz: ");
                    String sozAxtar = rdStr.next();
                    if (luget.containsKey(sozAxtar)) {
                        System.out.println("Menasi: " + luget.get(sozAxtar));
                    } else {
                        System.out.println("Soz tapilmadi..");
                    }
                    break;
                case 5:
                    System.out.print("Silmek istediyinz soz: ");
                    String silSoz = rdStr.next();
                    if (luget.remove(silSoz) != null) {
                        System.out.println("Soz lugetden silindi.");
                    } else {
                        System.out.println("Soz tapilmadi..");
                    }
                    break;
                case 6:
                    System.out.println("Proqramdan cixilir........");
                    break;
//                default:
//                    System.out.println("Sehv secim etdiniz 1 ve 6 arasinda secim edin.");

            }
        } while (secim != 6);


    }
}

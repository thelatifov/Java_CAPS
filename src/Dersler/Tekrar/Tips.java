package Dersler.Tekrar;

import java.util.Scanner;

public class Tips {
    static void main() {
//        Online Shopping Calculator
//                Şərt
//
//        Bir online mağaza hesablayıcısı yazın.
//
//                Proqram istifadəçidən aşağıdakı məlumatları alsın:
//
//        Məhsulun adı → String
//
//        Məhsulun qiyməti → double
//
//        Məhsul sayı → int
//
//        Müştərinin premium olub-olmaması → boolean
//
//        Qaydalar:
//
//        Ümumi qiymət = qiymət × say
//
//        Əgər müştəri premium-dursa → 10% endirim
//
//        Nəticədə ekrana çıxarılsın:
//
//        məhsul adı
//
//        ümumi qiymət
//
//        endirimli qiymət

        String mehsulad = "";
        double mehsulqiymet;
        int mehsulsayi;
        boolean premium;

        Scanner input = new Scanner(System.in);
        System.out.print("Mehsulun adi: ");
        mehsulad = input.nextLine();
        System.out.print("Mehsulun qiymeti: ");
        mehsulqiymet = input.nextDouble();
        System.out.print("Mehsulun sayi: ");
        mehsulsayi = input.nextInt();
        System.out.print("SIz premimum musterisiniz: ");
        premium = input.nextBoolean();
        double umumiqiymet = mehsulqiymet * mehsulsayi;
        if (premium) {

            umumiqiymet *= 0.9;
            System.out.println("Mehsulun adi: " + mehsulad);
            System.out.println("Mehsulun qiymeti: " + umumiqiymet);
            System.out.println("Mehsulun sayi: " + mehsulsayi);
            System.out.println("Sizin Mehsulunuza 10% endirim edildi qiymet: "+umumiqiymet);
        } else {
            System.out.println("Sizin mehsulunuzun qiymet: "+umumiqiymet);

        }


    }
}

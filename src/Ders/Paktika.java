package Ders;

import java.util.Scanner;

public class Paktika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ededleri yaziriq nece reqemli oldugunu gosterir
        //Meselen 12345 = 5
        System.out.print("Ededi daxil edin: ");
        int say = 0;
        int eded = input.nextInt();
        do {
            eded /= 10;
            say++;
        } while (eded != 0);
        System.out.println("Say:" + say);


//        while (true) {
//            int eded = input.nextInt();
//
//            if (eded <= 0) {
//                break;
//            }
//
//            cem += eded;
//        }

//        System.out.println("Daxil edilen ededlerin cemi: " + cem);


    }
}

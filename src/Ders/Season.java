package Ders;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int season = input.nextInt();
        switch (season) {
            case 3, 4, 5-> System.out.println("Yaz Fesli");
            case 6,7,8-> System.out.println("Yay Fesli");
            case 9,10,11-> System.out.println("Payiz Fesli");
            case 12,1,2-> System.out.println("Qis Fesli");
            default -> System.out.println("Bele Fesl Yoxdur");
        }

    }
}

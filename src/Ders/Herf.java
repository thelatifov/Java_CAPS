package Ders;

import java.util.Scanner;

public class Herf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char herf = sc.next().charAt(0);
        //char h = sc.next().charAt(0);
        if (herf >= 65 && herf <= 90) {
            System.out.println((char) (herf + 32));
        } else if (herf >= 97 && herf <= 122) {
            System.out.println((char) (herf - 32));
        }


    }
}
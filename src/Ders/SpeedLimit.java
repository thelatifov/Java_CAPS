package Ders;

import java.util.Scanner;

public class SpeedLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed = input.nextInt();
        int limit = 60;
        if (speed >= 0 && speed <= 60) {
            System.out.println("Problem yoxdur");
        } else if (speed >= 61 && speed <= 80) {
            System.out.println("Xeberdarliq");
        } else if (speed >= 81 && speed <= 100) {
            System.out.println("100AZN Cerime");
        } else if (speed >= 100 && speed <= 120) {
            System.out.println("200AZN Cerime");
        } else {
            System.out.println("Hebs");
        }


    }
}

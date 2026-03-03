package Ders;

import java.util.Scanner;

public class Ternoary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String result = age >= 18 ? "Young" : "No Young";
        System.out.println(result);
    }
}

package Ders;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("salam");
//        }
//        for (int i = 10; i > 0; i--) {
//            System.out.printf("salam");
//        }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);

    }
}

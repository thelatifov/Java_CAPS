package Ders;

import java.util.Scanner;

public class ExampleDataType {
    static void main() {
        //main-de daxil edilen iki ededi metod cagiraraq cemleyib ekrana cap edin
        Scanner num = new Scanner(System.in);
        System.out.print("1ci Eded daxil edin:");

        int eded = num.nextInt();
        System.out.print("2ci Eded daxil edin:");
        int eded2 = num.nextInt();

        EdedCagir(eded, eded2);

    }

    public static void EdedCagir(int eded, int eded1) {
        int cem = eded + eded1;
        System.out.println(cem);
    }
}

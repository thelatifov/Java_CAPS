package DataTypes;

import java.util.Scanner;

public class HomeWork2 {
    // Todo : mainde daxil edilen 3 ededin Ededi ortasini -- dustur : (eded1+eded2+eded3)/3
    //  metod vasitesile hesblayib ekrana chap edin
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Birinci eded:");
        int eded1 = sc.nextInt();
        System.out.print("Ikinci eded:");

        int eded2 = sc.nextInt();
        System.out.print("Ucuncu eded:");

        int eded3 = sc.nextInt();
        EdedOrtar(eded1, eded2, eded3);
    }

    public static void EdedOrtar(int eded1, int eded2, int eded3) {

        System.out.println("Ededlerin ortasi:" + (eded1 + eded2 + eded3) / 3);
    }
}

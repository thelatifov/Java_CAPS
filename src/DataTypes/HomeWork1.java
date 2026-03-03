package DataTypes;

import java.util.Scanner;

public class HomeWork1 {
    static void main() {
        // Todo : mainde daxil edilen iki ededden boyuk olanini metod vasitesi ile
        //  tapib ekrana chap edin
        Scanner sc = new Scanner(System.in);
        System.out.print("1ci eded:");
        int eded1 = sc.nextInt();
        System.out.print("2ci eded:");
        int eded2 = sc.nextInt();
        EdedCagir(eded1, eded2);
    }

    public static void EdedCagir(int eded1, int eded2) {
        if (eded1 > eded2) {
            System.out.println("Boyuk olan eded:" +eded1);
        }
        else if (eded1 < eded2) {
            System.out.println("Boyuk olan eded:" +eded2);
        }
        else {
            System.out.println("Ededler beraberdir");
        }
    }

}


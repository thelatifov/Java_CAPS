package HomeWork;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {


        int[][] cedvel = new int[2][5];

        int tekSay = 0;
        int cutSay = 0;

        for (int i = 0; i < cedvel.length; i++) {
            for (int j = 0; j < cedvel[i].length; j++) {

                cedvel[i][j] = (int) (Math.random() * 100);

                System.out.print(cedvel[i][j] + ",");

                if (cedvel[i][j] % 2 == 0) {
                    cutSay++;
                } else {
                    tekSay++;
                }
            }
            System.out.println();
        }

        System.out.println("Cut ededler: " + cutSay);
        System.out.println("Tek ededler: " + tekSay);
    }
}




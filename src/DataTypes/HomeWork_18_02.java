package DataTypes;

import java.util.ArrayList;

public class HomeWork_18_02 {
    static void main() {

        int[] ededler = new int[100];
        ArrayList<Integer> uceBolen = new ArrayList<>();
        for (int i = 0; i < ededler.length; i++) {
            ededler[i] = (int) (Math.random() * (100 - 20) + 20);

        }
            for(int j=0;j<ededler.length;j++){
                if(ededler[j]%3==0){
                    uceBolen.add(ededler[j]);
                }
            }
        System.out.println("Uce bolunenler");
        System.out.println(uceBolen);



    }
}

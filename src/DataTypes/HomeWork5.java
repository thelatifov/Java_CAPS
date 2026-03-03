package DataTypes;

public class HomeWork5 {
    static void main() {

        int[] arr1 = new int[100];
        int cem = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (100 - 20) + 20);
        }
            for (int eded : arr1) {
                if (eded % 3 == 0)
                    cem += eded;

                System.out.println(eded);

                }
        System.out.println("3 e bolunen ededlerin cemi: " + cem);


            }

        }



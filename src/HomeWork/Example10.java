package HomeWork;

public class Example10 {
    static void main() {
        int[] ededler = {1, 2, 3, 4};
        average(ededler);


    }

    public static void average(int[] ededler) {
        double cem = 0;

        for (int i = 0; i < ededler.length; i++) {
            cem += ededler[i];
        }
        double ortalama = cem / ededler.length;
        System.out.println("Ededlerin cemi: " + cem);
        System.out.println("Ortalama: " + ortalama);

    }


}

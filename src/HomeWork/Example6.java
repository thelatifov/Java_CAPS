package HomeWork;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cem = 0;
        char cavab;

        do {
            System.out.print("eded daxil et: ");
            int eded = scanner.nextInt();
            cem += eded;

            System.out.print("davam etsin? b: ");
            cavab = scanner.next().charAt(0);

        } while ((cavab == 'b'));

        System.out.println("-------------------------");
        System.out.println("Daxil edilen ededlerin cemi: " + cem);

    }
}

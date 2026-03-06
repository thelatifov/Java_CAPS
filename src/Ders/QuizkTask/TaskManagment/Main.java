package Ders.QuizkTask.TaskManagment;


//        yeni tapşırıq əlavə edə bilər
//
//        mövcud tapşırıqlara baxa bilər
//
//        tapşırığı silə bilər
//
//        proqramdan çıxa bilər
//
//        Layihə Java dilində yazılıb və 3 class-dan ibarətdir.
//
//
//
//                Layihənin strukturu
//
//        Layihədə 3 fayl var:
//
//        Main.java
//        Task.java
//        TaskManager.java
//
//        Hər class-ın öz vəzifəsi var.
//
//                Class	              Vəzifəsi
//        Task	                tapşırığın məlumatını saxlayır
//        TaskManager         	tapşırıqları idarə edir
//        Main                	proqramı işə salır

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        String choice;

        while (true) {
            System.out.println("\n--- TO-DO APP ---");
            System.out.println("1. Yeni tapşırıq əlavə et");
            System.out.println("2. Tapşırıqlara bax");
            System.out.println("3. Tapşırıq sil");
            System.out.println("4. Çıxış");
            System.out.print("Seçiminiz: ");

            choice = sc.next();
            sc.nextLine(); // Boşluğu təmizləmək üçün

            switch (choice) {
                case "1":
                    System.out.print("Tapşırığın adını daxil edin: ");
                    String title = sc.nextLine();
                    manager.addTask(title);
                    break;
                case "2":
                    manager.showTasks();
                    break;
                case "3":
                    manager.showTasks();
                    System.out.print("Silmək istədiyiniz tapşırığın nömrəsini daxil edin: ");
                    if (sc.hasNextInt()) {
                        int num = sc.nextInt();
                        manager.deleteTask(num - 1);
                    } else {
                        System.out.println("Xəta: Zəhmət olmasa rəqəm daxil edin.");
                        sc.next(); // Səhv girişi təmizləmək üçün
                    }
                    break;
                case "4":
                    System.out.println("Proqramdan çıxılır. Uğurlar!");
                    System.exit(0);
                default:
                    System.out.println("Səhv seçim! Yenidən cəhd edin.");
            }
        }
    }
}


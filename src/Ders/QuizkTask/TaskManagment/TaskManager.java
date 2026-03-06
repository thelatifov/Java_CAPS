package Ders.QuizkTask.TaskManagment;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title) {
        tasks.add(new Task(title));
        System.out.println("Sistem: Tapşırıq uğurla əlavə edildi.");
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Sistem: Hal-hazırda heç bir tapşırıq yoxdur.");
        } else {
            System.out.println("\n--- Mövcud Tapşırıqlar ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getTitle());
            }
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Sistem: '" + tasks.get(index).getTitle() + "' silindi.");
            tasks.remove(index);
        } else {
            System.out.println("Sistem: Səhv nömrə! Belə bir tapşırıq yoxdur.");
        }
    }
}


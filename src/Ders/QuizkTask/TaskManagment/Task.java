package Ders.QuizkTask.TaskManagment;

public class Task {
    private String title;

    public Task(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public String toString() {
        return "Tapşırıq: " + title;
    }
}

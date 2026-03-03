package QuizTask;

public class _01_QuizTask {
    static void main() {
        int[][] arr1 = {
                {5, 10, 10},
                {20, 25, 30}
        };
        int max = arr1[0][0];
        int cem = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                cem += arr1[i][j];
                if (arr1[i][j] > max) {
                    max = arr1[i][j];
                }
            }
        }

        System.out.println("Cem: " + cem);
        System.out.println("Max: " + max);


    }
}

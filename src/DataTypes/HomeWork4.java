package DataTypes;

public class HomeWork4 {
    static void main() {
        int [] arr1 = new int[6];
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random()*(71-65)+65);
        }
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr1.length; i++){
        if (arr1[i] > max){
            max = arr1[i];
        }
            System.out.print(arr1[i]+" ");

        }
        System.out.println();
        System.out.println("En boyuk: " + max);

    }
}

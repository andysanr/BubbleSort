import java.util.Random;

public class SortingAlgorithms {
    public static void bubblesort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j+1]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    public static void fillArray(int[] list) {
        Random rnd = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = rnd.nextInt(100);
        }
    }
    public static void printArray(int[] list) {
        for(int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
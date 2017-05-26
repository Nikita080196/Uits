package lesson6.task2;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[][] mas = {
                {12, 456, 64225,},
                {142, 52, 3},
                {0, 21, 1, 123},
                {1, 66, 3425, 5, 2},
                {3, 865, 2, 123, 5}
        };
        for (int[] arr : mas) {
            System.out.print(Arrays.toString(arr) + " =====> ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void sort(int[] array) {
        boolean stop;
        for (int i = 0; i < array.length; i++) {
            stop = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    stop = true;
                }
            }
            if (!stop) {
                return;
            }
        }
    }
}
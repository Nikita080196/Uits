package lesson6.task6;

import java.util.Arrays;

public class SelectionSort {
        public static void sortarray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int k = i;
                int x = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] < x) {
                        k = j;
                        x = array[j];
                    }
                }
                if (x != array[i]) {
                    array[k] = array[i];
                    array[i] = x;
                }
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 7, 9, 0, 10, 1023, 11, 6};
            System.out.println(Arrays.toString(array));
            sortarray(array);
            System.out.println(Arrays.toString(array));
        }
    }


package lesson6.task4;

import java.util.Arrays;

public class MassiveMaxMin {

    public static final int a = 5;
    public static final int b = 8;

    public static void main(String[] args) {
        int firstArr[][] = {
                {1, 2, 3, 4, 5, 6, 7, 8},
                {9, 10, 11, 12, 13, 14, 15, 16},
                {17, 18, 19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30, 31, 32},
                {33, 34, 35, 36, 37, 38, 39, 40}
        };
        System.out.println(Arrays.deepToString(firstArr));
        minMax(firstArr);
    }

    public static void minMax(int[][] start) {
        int secondArr[][] = new int[a][2];
        for (int i = 0; i < b; i++) {
            int min = start[i][0];
            int max = start[i][0];
            for (int j = 0; j < b; j++) {
                if (start[i][j] < min) {
                    min = start[i][j];
                }
                if (start[i][j] > max) {
                    max = start[i][j];
                }
            }
            secondArr[i][0] = min;
            secondArr[i][1] = max;
        }
        System.out.println(Arrays.deepToString(secondArr));
    }
}
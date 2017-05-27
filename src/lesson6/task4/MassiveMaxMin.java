package lesson6.task4;

import java.util.Arrays;

public class MassiveMaxMin {
    private int[][] array = {
            {5353, 324, 213, 56, 5, 2, 1, 653},
            {5, 53256, 4141, 52, 2523, 145, 9999, 521451},
            {521, 1522, 621, 621, -1, 0, 521, 515},
            {74, 16574, 242, 4252, 4, 4231, 41, 151},
            {424, 63, 41, 52, 562, 163, 53, 63}
    };

    private int[][] arrayMinMax = new int[5][2];

    public void arrayMinMax() {
        for (int i = 0; i < array.length; i++) {
            int min = array[i][0];
            int max = array[i][0];
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            arrayMinMax[i][0] = min;
            arrayMinMax[i][1] = max;
        }
    }

    public void printArr() {
        String a = Arrays.deepToString(array);
        System.out.println(a);
    }

    public void printMassiveMinMax() {
        String b = Arrays.deepToString(arrayMinMax);
        System.out.println(b);
    }

    public static void main(String[] args) {
        MassiveMaxMin massiveMaxMin = new MassiveMaxMin();
        massiveMaxMin.arrayMinMax();
        massiveMaxMin.printArr();
        massiveMaxMin.printMassiveMinMax();
    }
}
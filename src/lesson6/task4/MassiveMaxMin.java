package lesson6.task4;

import java.util.Arrays;

public class MassiveMaxMin {
    private int[][] array = {
            {1, 2, 3, 4, 5, 6, 7, 8},
            {9, 10, 11, 12, 13, 14, 15, 16},
            {17, 18, 19, 20, 21, 22, 23, 24},
            {25, 26, 27, 28, 29, 30, 31, 32},
            {33, 34, 35, 36, 37, 38, 39, 40}};
    private int[][] arrayMinMax = new int[5][2];

    public void ArrayMinMax() {
        for (int i = 0; i < array.length; i++) {
            int min = 0;
            int max = 0;
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
        massiveMaxMin.ArrayMinMax();
        massiveMaxMin.printArr();
        massiveMaxMin.printMassiveMinMax();
    }
}
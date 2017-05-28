package lesson7.task2;

public class Matrix {

    private int matrix[][] = new int[5][5];

    public Matrix(int[][] firstArr) {
    }

    public void matrixSumm(int[][] array1) {
        int array2[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                array1[a][b] = array1[a][b] + array2[a][b];
            }
        }
        System.out.println(array1);
    }
}

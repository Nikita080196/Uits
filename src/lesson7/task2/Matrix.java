package lesson7.task2;

import java.util.Arrays;

public class Matrix {
    private double[][] matrix;
    private int NumOfRows;
    private int NumOfColums;

    public Matrix() {
        this(4, 4);
    }

    public Matrix(int NumOfRows, int NumOfColums) {
        matrix = new double[NumOfRows][NumOfColums];
        this.setRowsNum(NumOfRows);
        this.setColunsNum(NumOfColums);
    }

    public int getNumOfRows() {
        return NumOfRows;
    }

    private void setRowsNum(int NumOfRows) {
        this.NumOfRows = NumOfRows;
    }

    public int getNumOfColums() {
        return NumOfColums;
    }

    private void setColunsNum(int NumOfColums) {
        this.NumOfColums = NumOfColums;
    }

    public void setElement(int row, int column, double value) {
        matrix[row][column] = value;
    }

    public double getElement(int row, int column) {
        return matrix[row][column];
    }

    public void print() {
        for (int i = 0; i < getNumOfRows(); i++) {
            for (int j = 0; j < getNumOfColums(); j++) {
                System.out.print(getElement(i, j) + "\t");
            }
            System.out.println();
        }
    }

    public void sum(Matrix m2) {
        if (this.getNumOfRows() == m2.getNumOfRows() && this.getNumOfColums() == m2.getNumOfColums()) {
            System.out.println("Матрицы имеет одинаковую размерность");
            for (int i = 0; i < getNumOfRows(); i++) {
                for (int j = 0; j < getNumOfColums(); j++) {
                    this.setElement(i, j, this.getElement(i, j) + m2.getElement(i, j));
                }
            }
        } else {
            System.out.println("Матрицы имеют разные размерности");
        }
    }


    public void fillRandomMatrix() {
        for (int i = 0; i < getNumOfRows(); i++) {
            for (int j = 0; j < getNumOfColums(); j++) {
                setElement(i, j, Math.random() * 100);
            }
        }
    }

    public void multiply(double d) {
        for (int i = 0; i < getNumOfRows(); i++) {
            for (int j = 0; j < getNumOfColums(); j++) {
                this.setElement(i, j, this.getElement(i, j) * d);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix1 = (Matrix) o;

        if (NumOfRows != matrix1.NumOfRows) return false;
        if (NumOfColums != matrix1.NumOfColums) return false;
        return Arrays.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrix);
        result = 31 * result + NumOfRows;
        result = 31 * result + NumOfColums;
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", NumOfRows=" + NumOfRows +
                ", NumOfColums=" + NumOfColums +
                '}';
    }
}


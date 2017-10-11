package lesson13.task4.task3;

public class Demo {
    public static void main(String[] args) {
        Integer[] intNumb = new Integer[]{1, -3, 10, 60, -38};
        MinMax<Integer> minMax1 = new MinMax<>(intNumb);
        MinMax<Integer> maxInt = new MinMax<>(intNumb);
        System.out.println("Минимальное значение матрицы равно: " + minMax1.minNumb());
        System.out.println();
        System.out.println("Максимальное значение матрицы равно: " + maxInt.maxNumb());
    }
}
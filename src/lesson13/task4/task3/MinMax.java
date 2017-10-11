package lesson13.task4.task3;

public class MinMax<N extends Number> {
    private N[] arr;

    public MinMax(N[] arr) {
        this.arr = arr;
    }

    public int minNumb() {
        N min = arr[0];
        for (N i : arr) {
            if (i.intValue() < min.intValue()) {
                min = i;
            }
        }
        return min.intValue();
    }

    public int maxNumb() {
        N max = arr[0];
        for (N i : arr) {
            if (i.intValue() > max.intValue()) {
                max = i;
            }
        }
        return max.intValue();
    }
}
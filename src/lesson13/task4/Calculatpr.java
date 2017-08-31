package lesson13.task4;

public class Calculatpr {
    public static <T extends Number, V extends Number> double sum(T a1, V a2) {
        return a1.doubleValue() + a2.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a1, V a2) {
        return a1.doubleValue() * a2.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a1, V a2) {
        if (a2.doubleValue() != 0) {
            return a1.doubleValue() / a2.doubleValue();
        }
        return -1;
    }

    public static <T extends Number, V extends Number> double subtraction(T a1, V a2) {
        return a1.doubleValue() - a2.doubleValue();
    }
}

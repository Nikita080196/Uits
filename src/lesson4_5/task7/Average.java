package lesson4_5.task7;

public class Average {
    public static void main(String[] args) {
        int i = 0;
        double sum = 0;
        double ave;
        for (String m : args) {
            double a = Double.parseDouble(m);
            sum += a;
            i = i + 1;
        }
        ave = sum / i;
        System.out.println("Cреднее знаSчение  чисел равно " + ave);
    }
}
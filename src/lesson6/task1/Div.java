package lesson6.task1;

public class Div {
    public static void main(String[] args) {
        int k = 5;
        int c;
        int i = 1;

        do {
            c = i % k;
            if (c == 0)
                System.out.println(i);
        } while (i++ <= 100);
    }
}
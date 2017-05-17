package lesson6.task3;

import java.util.Random;

/**
 * Created by Валентина on 16.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(10);
        int c = 1;
        System.out.println(a);
        for (int i = a; i > 0; i--) {
            c *= i;
        }
        System.out.println("Факториал числа " + a + " равен " + c);
    }
}

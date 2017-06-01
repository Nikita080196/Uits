package lesson8.task2;

import java.util.Random;

public class Recursion {
    public static String rec(int a, int b) {
        if (a > b) {
            return a + " " + rec(a - 1, b);
        } else if (a == b) {
            return Integer.toString(a);
        }
        return a + " " + rec(a + 1, b);
    }

    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(5);
        int b = random.nextInt(5);
        System.out.println(rec(a, b));
        System.out.println(rec(b, a));
    }
}
package lesson3.task8;

import java.util.Scanner;

public class Summa {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое целое число:");
        int a = getIntValue(scn);
        System.out.println("Введите второе целое число:");
        int b = getIntValue(scn);
        int sum = a + b;
        System.out.println("Сумма двух целыз чисел = " + sum);
    }

    private static int getIntValue(Scanner scn) {
        int i = 0;
        if (scn.hasNextInt()) {
            i = scn.nextInt();
        } else {
            System.out.println("Вы ввели не целое числ!");
            System.exit(0);
        }
        return i;
    }
}
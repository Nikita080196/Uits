package lesson3.task8;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Введите первое целое число:");
            int a = scn.nextInt();
            System.out.println("Введите второе целое число:");
            int b = scn.nextInt();
            int sum = a + b;
            System.out.println("Сумма двух целыз чисел = " + sum);
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число!");
        }
    }
}
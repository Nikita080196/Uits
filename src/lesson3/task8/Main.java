package lesson3.task8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первое целое число:");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int i = scn.nextInt();
            System.out.println("Введите второе целое число :");
            if (scn.hasNextInt()) {
                int k = scn.nextInt();
                System.out.println("Сумма чисел " + i + " и " + k + " равна " + (k + i));
            } //else
                print();
        }
            else
            print();
        }

    public static void print() {
        System.out.println("Вы ввели не целое число");
    }
}
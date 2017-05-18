package lesson3.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста любое целое число");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            if (scn.nextInt() % 2 == 0) {
                System.out.println("Число четное.");
            } else System.out.println("Число не четноее.");
        } else System.out.println(" Вы ввели не целое число");
    }
}
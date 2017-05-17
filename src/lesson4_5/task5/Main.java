package lesson4_5.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите пожалуйста первое число");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextFloat()) {
            float a = Math.abs(scn.nextFloat());
            System.out.println("Введите пожалуйста второе число");
            if (scn.hasNextFloat()) {
                float b = Math.abs(scn.nextFloat());
                System.out.println("Введите пожалуйста третье число");
                if (scn.hasNextFloat()) {
                    float c = Math.abs(scn.nextFloat());
                    a = (a < b && a < c) ? a : b;
                    System.out.println("Число меньшее по модулю : " + a);
                    b = (b < a && b < c) ? b : a;
                    System.out.println("Число меньшее по модулю : " + b);
                    c = (c < b && c < a) ? c : a;
                    System.out.println("Число меньшее  по модулю : " + c);
                } else print();
            } else print();
        } else print();
    }

    public static void print() {
        System.out.println("Вы ввели не вещественное число");
    }

    public static double getFloatValue(Scanner scn) {
        double d = 0;
        if (scn.hasNextFloat()) {
            d = scn.nextFloat();
        } else {
            System.out.println("Вы ввели не вещественное число");
            System.exit(0);
        }
        return d;

    }
}


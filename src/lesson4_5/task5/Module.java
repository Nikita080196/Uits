package lesson4_5.task5;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float c = 0;
        System.out.println("Введите пожалуйста первое число: ");
        a = getFloatValue(scn);
        System.out.println("Введите пожалуйста второе число: ");
        b = getFloatValue(scn);
        System.out.println("Введите пожалуйста третье число: ");
        c = getFloatValue(scn);
        a = (a < b && a < c) ? a : b;
        b = (b < a && b < c) ? b : a;
        c = (c < b && c < a) ? c : a;
        float min1 = Math.min(a, b);
        float min2 = Math.min(min1, c);
        System.out.println("Число меньшее  по модулю : " + min2);
    }

    public static float getFloatValue(Scanner scn) {
        float f = 0;
        if (scn.hasNextFloat()) {
            f = scn.nextFloat();
        } else {
            System.out.println("Вы ввели не вещественное число");
            System.exit(0);
        }
        return f;
    }
}
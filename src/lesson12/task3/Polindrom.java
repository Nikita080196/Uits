package lesson12.task3;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder strb = new StringBuilder(scan.nextLine());
        StringBuilder stringBuilder[] = new StringBuilder[5];
        System.out.println("Введите первое значение : ");
        stringBuilder[0] = strb.append(scan.nextLine());
        System.out.println("Введите второе значение : ");
        stringBuilder[1] = strb.append(scan.nextLine());
        System.out.println("Введите третье значение : ");
        stringBuilder[2] = strb.append(scan.nextLine());
        System.out.println("Введите четвертое значение : ");
        stringBuilder[3] = strb.append(scan.nextLine());
        System.out.println("Введите пятое значение : ");
        stringBuilder[4] = strb.append(scan.nextLine());

        for (StringBuilder str : stringBuilder) {
            if (str == str.reverse()) {
                System.out.println(str);
            }
        }
    }
}
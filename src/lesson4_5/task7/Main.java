package lesson4_5.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        double sum = 0.0;
        double avg, a;
        System.out.print("Cколько вещественных чисел хотите вычеслить: ");
        n = in.nextInt();
        System.out.println("Введите " + n + " чисел.");
        for (int i = 0; i < n; i++) {
            a = in.nextDouble();
            sum += a;
        }
        avg = sum / n;
        System.out.println("Cреднее значение " + n + " чисел равно " + avg);
    }
}
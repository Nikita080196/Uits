package lesson4_5.task6;

import java.util.Random;
import java.util.Scanner;

public class Girlyanda {
    public static void main(String[] args) {

        Random random = new Random();
        int i = random.nextInt(32);
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("Введите что вы хотите сделать с гирляндой");
        System.out.println("Введите 1 если гирлянда будет миигать");
        System.out.println("Введите 2 если гирлядна будет мигать бегущей строкой");
        System.out.println("Введите 3 если будет выясняться включена ли лампочка на первой позиции");
        System.out.println("Введите 4 если хотите распечатать текущее состояние гирлянды");
        int k = check(scanner);
    }

    public static int check(Scanner scanner) {
        int b = 0;
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        }
        if (b < 0) {
            System.exit(0);
        }
        return b;
    }

    public static void light(int i, int b) {
        int c = 1;
        while (c < b) {
            int d = c;
            System.out.println(d);
            i = d;
            c++;
        }

    }
    public static void stroka(int i , int b){
        int e = 1;
        while(e < b){
            int d = e >> 1;
            System.out.println(d);
            i = d;
            e++;
        }
    }
}











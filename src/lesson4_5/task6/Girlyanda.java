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
        if (k > 4 || k < 1) {
            System.exit(0);
        }
    }

    public static int check(Scanner scanner) {
        int count = 0;
        if (scanner.hasNextInt()) {
            count = scanner.nextInt();
        }
        if (count < 0) {
            System.exit(0);
        }
        return count;
    }

    public static void light(int i, int count ) {
        int c = 1;
        while (c < count) {

            System.out.println(i);
            i = ~i;
            c++;
        }

    }

    public static void runString(int i, int count ) {
       int e = 1;
        while (e < count ) {
            i = i >> 1;
            System.out.println(i);
            e++;
        }
    }
}

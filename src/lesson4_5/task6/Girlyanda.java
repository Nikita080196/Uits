package lesson4_5.task6;

import java.util.Random;

public class Girlyanda {

    public void miganie(int girlyanda, int count) {
        for (int i = 0; i < count; i++) {
            girlyanda = ~girlyanda;
            print(girlyanda);
        }
    }

    public void print(int girlyanda) {
        System.out.println("Состояние гирлянды : " + Integer.toBinaryString(girlyanda));
    }

    public void turnONFirstPos(int girlyanda) {
        int res = girlyanda & 1;
        if (res==0){
            System.out.println("Лампочка на первой позиции выключена.");
        } else {
            System.out.println("Лампочка на первой позиции включена.");
        }
    }

    public void run(int girlyanda) {
        for (int i = 0; i < 5; i++) {
            girlyanda <<= i;
            System.out.print(Integer.toBinaryString(girlyanda) + " ");
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Girlyanda girlyanda = new Girlyanda();
        int i = random.nextInt(32);
        System.out.println(i);

        girlyanda.print(random.nextInt());
        girlyanda.turnONFirstPos(i);
        System.out.println("Мигание гирлянды : ");
        girlyanda.miganie(i, 6);
        System.out.println("Режим бегущей строки : ");
        girlyanda.run(i);
    }
}

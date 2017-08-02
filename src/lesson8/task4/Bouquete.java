package lesson8.task4;

/**
 * Created by Валентина on 16.05.2017.
 */
public class Bouquete {
    public static void main(String[] args) {
        Rose rose1 = new Rose("Красная роза", 11);
        Rose rose2 = new Rose("Желтая роза ", 13);
        Rose rose3 = new Rose("Розовая роза ", 7);
        Tulip tulip1 = new Tulip("Красный тюльпан ", 5);
        Tulip tulip2 = new Tulip("Желтый тюльпан ", 4);
        Romashka romashka1 = new Romashka("Большая ромашка ",10);

        System.out.println(" Общая стоимость всех роз: " + Flower.costOfBouquet(rose1, rose2, rose3));
        System.out.println(" Общая стоимость всех тюльпанов: " + Flower.costOfBouquet(tulip1, tulip2));
        System.out.println(" Общая стоимость всех ромазек: " + Flower.costOfBouquet(romashka1));
        System.out.println(" Общая стоимость всех проданых цветов: " + Flower.costOfBouquet(rose1,rose2,rose3,tulip1,tulip2,romashka1));
        System.out.println(" Общее количество проданіх цветов " + Flower.count);
    }
}

package lesson10.task6;

public class FruitDemo {
    public static void main(String[] args) {

        Fruit[] fruits = {
                new Apple(" Антоновка", 13),
                new Apple(" Белый налив", 21.50),
                new Apricot("Полесский", 35),
                new Apricot("Мелитопольский", 36.4),
                new Pear("Ноябрьская", 54.55),
                new Pear("Дюшес", 43.23)};

        System.out.println("Всего продано " + Fruit.getCount() + " фруктов.Стоимость всех фруктов " + totalCost(fruits));
        System.out.println("Всего продано " + Apple.getCount() + " яблок.Стоимость всех яблок " + applesTotalCost(fruits));
        System.out.println("Всего продано " + Apricot.getCount() + " абрикос.Стоимость всех абрикос " + apricotTotalCost(fruits));
        System.out.println("Всего продано " + Pear.getCount() + " груш.Стоимость всех груш " + pearTotalCost(fruits));
    }

    public static double applesTotalCost(Fruit[] fruits) {
        double summa = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) summa += fruit.cost();
        }
        return summa;
    }

    public static double apricotTotalCost(Fruit[] fruits) {
        double summa = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apricot) summa += fruit.cost();
        }
        return summa;
    }

    public static double pearTotalCost(Fruit[] fruits) {
        double summa = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Pear) summa += fruit.cost();
        }
        return summa;
    }

    public static double totalCost(Fruit[] fruits) {
        double summa = 0;
        for (Fruit fruit : fruits) {
            summa += fruit.cost();
        }
        return summa;
    }
}
package lesson10.task6;

public class Apricot extends Fruit {
    public static int count;

    public Apricot(String name, double cost) {
        super(name, cost);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public double cost() {
        return this.getCost();
    }
}
package lesson10.task6;

public class Apple extends Fruit {
    private static int count;

    public Apple(String name, double cost) {
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
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
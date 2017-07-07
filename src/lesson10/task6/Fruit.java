package lesson10.task6;

public abstract class Fruit {
    private String name;
    private static int count;
    private double cost;

    public Fruit(String name, double cost) {
        this.name = name;
        this.cost = cost;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public final void printManufacturerInfo() {
        System.out.println("Madr in Ukraine");
    }

    public abstract double cost();

    public double getCost() {
        return cost;
    }

    public static int getCount() {
        return count;
    }
}
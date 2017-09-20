package lesson19.task6;

/**
 * @author Nikita
 * @version 1
 *          on 20.09.2017.
 */
public abstract class Fruit {
    public String name;
    private static int count;
    public double cost;

    /**
     * @param name
     * @param cost Use constructor for creating for counting
     */
    public Fruit(String name, double cost) {
        this.name = name;
        this.cost = cost;
        count++;
    }

    /**
     * @return name
     * method for getting name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return cost
     * method for getting cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost set cost of fruits
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    public final void printManufacturerInfo() {
        System.out.println("Madr in Ukraine");
    }

    public abstract double cost();


    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        lesson10.task6.Fruit fruit = (lesson10.task6.Fruit) o;

        if (Double.compare(fruit.cost, cost) != 0) return false;
        return name.equals(fruit.name);
    }

    @Override
    public String toString() {
        return "Fruit{" + "name='" + name + '\'' + ", cost=" + cost + '}';
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

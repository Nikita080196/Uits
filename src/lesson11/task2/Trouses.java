package lesson11.task2;

public class Trouses extends Clothing implements MenClothing, WomanClothing {
    public Trouses(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println(" Это Брюки");
    }

    @Override
    public void dressMan() {
        System.out.println(" Это Брюки");

    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public String toString() {
        return "Trousers{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
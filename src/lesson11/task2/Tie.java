package lesson11.task2;

public class Tie extends Clothing implements MenClothing {
    public Tie(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println(" Это Галстук");
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
package lesson11.task2;

public class Skirt extends Clothing implements WomanClothing {
    public Skirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println(" Это Юбка");
    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
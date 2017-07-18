package lesson11.task2;


public class T_short extends Clothing implements MenClothing, WomanClothing {


    public T_short(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println(" Это Футболка");
    }

    @Override
    public void dressWoman() {
        System.out.println(" Это Футболка");
    }

    @Override
    public String toString() {
        return "Tshort{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
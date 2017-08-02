package lesson8.task4;

public class Tulip extends Flower {
    public static final int COST_OF__ROSE = 40;

    public Tulip(String name, int date) {
        super(name, date);
    }
    @Override
    public int price() {
        return COST_OF__ROSE;
    }
}


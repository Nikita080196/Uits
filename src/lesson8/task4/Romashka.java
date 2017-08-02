package lesson8.task4;

public class Romashka extends Flower{
    public static final int COST_OF__ROSE = 123;

    public Romashka(String nameOfFlower, int date) {
        super(nameOfFlower, date);
    }
    @Override
    public int price() {
        return COST_OF__ROSE;
    }
}


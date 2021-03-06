package lesson8.task4;

public class Rose extends Flower {
    public static final int COST_OF__ROSE = 123;

    public Rose(String country, int date) {
        super(country, date);
    }

    @Override
    public int price() {
        return COST_OF__ROSE;
    }

    @Override
    public String toString() {
        return "Rose{} " + super.toString();
    }
}

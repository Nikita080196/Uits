package lesson8.task4;

public class Tulip extends Flower {
    public static final int COST_OF__TULIP = 40;

    public Tulip(String country, int date) {
        super(country, date);
    }

    @Override
    public int price() {
        return COST_OF__TULIP;
    }

    @Override
    public String toString() {
        return "Tulip{} " + super.toString();
    }
}
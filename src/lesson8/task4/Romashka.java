package lesson8.task4;

public class Romashka extends Flower {
    public static final int COST_OF__ROMASHKA = 123;

    public Romashka(String country, int date) {
        super(country, date);
    }

    @Override
    public int price() {
        return COST_OF__ROMASHKA;
    }

    @Override
    public String toString() {
        return "Romashka{} " + super.toString();
    }
}
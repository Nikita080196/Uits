package lesson15.task5;

import java.util.Comparator;

public class ComparePrice implements Comparator<Goods> {
    @Override
    public int compare(Goods first, Goods second) {
        return first.getPrice() - second.getPrice();
    }
}

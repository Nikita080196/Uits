package lesson14.task5;

import java.util.Comparator;

public class GoodsRateComp implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getRating() >= o2.getRating() ? 1 : -1;
    }
}
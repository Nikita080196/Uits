package lesson14.task5;

import java.util.Comparator;

public class GoodsNameComp implements Comparator<Goods> {
    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getName().compareTo(o2.getName()) >= 0 ? 1 : -1;
    }
}
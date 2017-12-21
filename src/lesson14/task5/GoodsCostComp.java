package lesson14.task5;

import java.util.Comparator;

public class GoodsCostComp implements Comparator<Goods> {

    @Override
    public int compare(Goods o1, Goods o2) {
        return o1.getCost().compareTo(o2.getCost());
    }
}

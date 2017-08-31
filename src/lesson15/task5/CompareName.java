package lesson15.task5;

import java.util.Comparator;

public class CompareName implements Comparator<Goods> {
    @Override
    public int compare(Goods first, Goods second) {
        return second.getName().compareTo(first.getName());
    }
}

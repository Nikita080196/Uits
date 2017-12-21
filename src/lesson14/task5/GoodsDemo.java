package lesson14.task5;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class GoodsDemo {
    public static void main(String[] args) {
        GoodsCostComp goodsCostComp = new GoodsCostComp();
        SortedSet<Goods> goods = new TreeSet<>(goodsCostComp);
        GoodsNameComp goodsNameComp = new GoodsNameComp();
        SortedSet<Goods> goods1 = new TreeSet<>(goodsNameComp);
        GoodsRateComp goodsRateComp = new GoodsRateComp();
        SortedSet<Goods> goods2 = new TreeSet<>(goodsRateComp);

        goods.add(new Goods("Галстук", 225.65, 3));
        goods.add(new Goods("Штаны", 640, 3));
        goods.add(new Goods("Джинсы", 1000, 1));
        goods.add(new Goods("Шорты", 620.1, 2));
        goods.add(new Goods("Кепка", 245, 4));
        goods.add(new Goods("Майка", 480.42, 3));
        goods.add(new Goods("Футболка", 623, 1));
        Category clothes = new Category("Одежда", goods);
        printInfo(goods);
        goods1.addAll(goods);
        printInfo(goods1);
        goods2.addAll(goods);
        printInfo(goods2);
    }

    public static void printInfo(Set<Goods> goods) {
        System.out.printf("%-7S    %-7S    %s\n", "Товар", "Цена", "Рейтинг ");
        for (Goods element2 : goods) {
            System.out.printf("%-7s    %-7S    %s\n", element2.getName(), element2.getCost(), element2.getRating());
        }
        System.out.println();
    }
}

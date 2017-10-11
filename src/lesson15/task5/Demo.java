package lesson15.task5;

import java.util.Set;
import java.util.TreeSet;

import static lesson15.task5.Category.printProduct;

public class Demo {
    public static void main(String[] args) {

        CompareName comporatorName = new CompareName();
        ComparePrice comparatorPrice = new ComparePrice();
        Set<Goods> products2 = new TreeSet<>(comporatorName);
        Set<Goods> products1 = new TreeSet<>();
        Set<Goods> products3 = new TreeSet<>(comparatorPrice);
        Goods goods1 = new Goods("Цепочка", 102, 15);
        Goods goods2 = new Goods("Джинсы", 400, 10);
        Goods goods3 = new Goods("Носки", 10, 4);
        products1.add(goods1);
        products1.add(goods2);
        products1.add(goods3);

        products2.add(goods1);
        products2.add(goods2);
        products2.add(goods3);

        products3.add(goods1);
        products3.add(goods2);
        products3.add(goods3);

        Category category1 = new Category("Мужская ", products1);
        Category category2 = new Category("Женская", products2);

        System.out.println("Для мужчин");
        printProduct(products1);
        System.out.println("Для женщин");
        printProduct(products2);
        System.out.println("По цене:");
        printProduct(products3);
    }
}
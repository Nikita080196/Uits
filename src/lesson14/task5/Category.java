package lesson14.task5;

import java.util.SortedSet;
import java.util.TreeSet;

public class Category {
    private String name;
    private SortedSet<Goods> goods;

    public Category(String name) {
        this.name = name;
        goods = new TreeSet<>();
    }

    public Category(String name, SortedSet<Goods> goods) {
        this.name = name;
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Goods> getGoods() {
        return goods;
    }

    public void setGoods(SortedSet<Goods> goods) {
        this.goods = goods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!name.equals(category.name)) return false;
        return goods.equals(category.goods);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + goods.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Category{" + "name='" + name + '\'' + ", goods=" + goods + '}';
    }
}
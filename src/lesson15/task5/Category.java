package lesson15.task5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Category {
    private String name;
    private Set<Goods> products;

    public Category(String name, Set<Goods> set) {
        this.name = name;
        products = set;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Goods> getProducts() {
        return products;
    }

    public void setProducts(Set<Goods> setProduct) {
        this.products = setProduct;
    }

    public static void printProduct(Set s) {
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", setProduct=" + products +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (name != null ? !name.equals(category.name) : category.name != null) return false;
        return products != null ? products.equals(category.products) : category.products == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }
}
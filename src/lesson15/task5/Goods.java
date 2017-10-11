package lesson15.task5;

public class Goods implements Comparable<Goods> {
    private String name;
    private int price;
    private int raiting;

    public Goods(String name, int price, int raiting) {
        this.name = name;
        this.price = price;
        this.raiting = raiting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", raiting=" + raiting +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods product = (Goods) o;

        if (price != product.price) return false;
        if (raiting != product.raiting) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + raiting;
        return result;
    }

    @Override
    public int compareTo(Goods goods) {
        return this.raiting - goods.getRaiting();
    }
}


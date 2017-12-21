package lesson14.task5;

public class Goods {
    private String name;
    private double cost;
    private int rating;

    public Goods(String name, double cost, int rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (Double.compare(goods.cost, cost) != 0) return false;
        if (rating != goods.rating) return false;
        return name.equals(goods.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rating;
        return result;
    }

    @Override
    public String toString() {
        return "Gppds{" + "name='" + name + '\'' + ", cost=" + cost + ", rating=" + rating + '}';
    }
}

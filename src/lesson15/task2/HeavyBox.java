package lesson15.task2;

public class HeavyBox {
    private double weight;

    public HeavyBox(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double heavyBox) {
        this.weight = heavyBox;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeavyBox that = (HeavyBox) o;

        return Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(weight);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "MyHeavyBox2{" + "weight=" + weight + '}';
    }
}

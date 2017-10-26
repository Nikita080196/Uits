package lesson10.task2;

public abstract class Flower {
    private String nameOfFlower;
    private static int count;

    public Flower(String nameOfFlower) {
        this.setName(nameOfFlower);
        count++;
    }

    public String getName() {
        return nameOfFlower;
    }

    public void setName(String nameOfFlower) {
        this.nameOfFlower = nameOfFlower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        return nameOfFlower.equals(flower.nameOfFlower);
    }

    @Override
    public int hashCode() {
        return nameOfFlower.hashCode();
    }

    @Override
    public String toString() {
        return "Flower{" + "nameOfFlower ='" + nameOfFlower + '\'' + '}';
    }

    public static int getCount() {
        return count;
    }

    public abstract double cost();
}

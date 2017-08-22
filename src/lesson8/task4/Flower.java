package lesson8.task4;

abstract class Flower {
    private String nameOfFlower;
    private int date;
    public static int count;

    public Flower(String nameOfFlower, int date) {
        this.nameOfFlower = nameOfFlower;
        this.date = date;
        count++;
    }

    public String getName() {
        return nameOfFlower;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.nameOfFlower = name;
    }

    public void setDate(int date) {
        this.date = date;
    }

    abstract public int price();

    public static int costOfBouquet(Flower... flowers) {
        int sum = 0;
        for (Flower f : flowers) {
            sum += f.price();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (date != flower.date) return false;
        return nameOfFlower != null ? nameOfFlower.equals(flower.nameOfFlower) : flower.nameOfFlower == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfFlower != null ? nameOfFlower.hashCode() : 0;
        result = 31 * result + date;
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "nameOfFlower='" + nameOfFlower + '\'' +
                ", date=" + date +
                '}';
    }
}
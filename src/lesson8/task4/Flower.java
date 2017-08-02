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
}
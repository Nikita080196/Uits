package lesson9.task3;

public class Horse extends Animal {
    private int numberOfTitles;
    private int age;

    public Horse(String food, String location, int numberOfTitles, int age) {
        super(food, location);
        this.numberOfTitles = numberOfTitles;
        this.age = age;
    }

    public int getNumberOfTitles() {
        return numberOfTitles;
    }

    public void setNumberOfTitles(int numberOfTitles) {
        this.numberOfTitles = numberOfTitles;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го-го");
    }

    @Override
    public void eat() {
        System.out.println(getFood());
    }
}

package lesson9.task3;

public class Dog extends Animal {
    private String poroda;
    private String weight;

    public Dog(String food, String location, String poroda, String weight) {
        super(food, location);
        this.poroda = poroda;
        this.weight = weight;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав-гав");
    }

    @Override
    public void eat() {
        System.out.println(getFood());
    }
}
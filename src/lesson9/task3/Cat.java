package lesson9.task3;

public class Cat extends Animal {
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String food, String location, String color, String name) {
        super(food, location);
        this.color = color;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public void eat() {
        System.out.println(getFood());
    }
}

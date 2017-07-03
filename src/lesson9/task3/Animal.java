package lesson9.task3;

public class Animal {
    private String food;
    private String location;

    public void makeNoise() {
        System.out.println("Какой - то странный шум...");
    }

    public void sleep() {
        System.out.println("Животное заснуло");
    }

    public void eat() {
        System.out.println("Животное что - то есть...");
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

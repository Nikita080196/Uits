package lesson18.task4;

public class Demo {
    public static void main(String[] args) {
        Food food = new Food();
        Cookable cookable = new Cookable() {

            @Override
            public void cook() {
                System.out.println("Я готовлю еду.");
            }
        };
        food.prepare(cookable);
    }
}

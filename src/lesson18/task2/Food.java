package lesson18.task2;

public class Food {
    void prepare(Cookable cookable) {
        cookable.cook();
    }
    Food food = new Food();
    food.prepare(new Cookable){

        public void cook(){
            System.out.println("ags");
        }
    }
}

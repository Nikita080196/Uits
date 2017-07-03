package lesson9.task3;

public class Veterinar {
    public static void treatAnimal(Animal animal) {
        System.out.println(animal.getClass().getSimpleName() + " ест " + animal.getFood() + " и живет в/на " + animal.getLocation());
    }
}

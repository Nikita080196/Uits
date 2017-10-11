package lesson19.task4;

public class Demo {
    public static void main(String[] args) {
        Fork[] forks = new Fork[]{
                new Fork(),
                new Fork(),
                new Fork(),
                new Fork(),
                new Fork(),

        };
        Philosof[] philosofers = new Philosof[]{
                new Philosof("Вася", forks[0], forks[1]),
                new Philosof("Петя", forks[1], forks[2]),
                new Philosof("Никита", forks[3], forks[2]),
                new Philosof("Дима", forks[3], forks[4]),
                new Philosof("Витали1й", forks[4], forks[0]),
        };
        for (Philosof philosof : philosofers)
            new Thread(philosof).start();
    }
}
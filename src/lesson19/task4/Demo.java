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
        Phil[] philosofers = new Phil[]{
                new Phil("Вася", forks[0], forks[1]),
                new Phil("Петя", forks[1], forks[2]),
                new Phil("Никита", forks[3], forks[2]),
                new Phil("Дима", forks[3], forks[4]),
                new Phil("Витали1й", forks[4], forks[0]),
        };
        for (Phil philosof : philosofers)
            new Thread(philosof).start();
    }
}
package lesson19.task1;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread one = new Thread(myRunnable);
        one.setName("Первый поток");
        Thread two = new Thread(myRunnable);
        two.setName("Второй поиок");
        Thread three = new Thread(myRunnable);
        three.setName("Третий поток");

        one.start();
        two.start();
        three.start();
    }
}

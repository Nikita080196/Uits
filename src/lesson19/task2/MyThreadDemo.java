package lesson19.task2;

public class MyThreadDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        MyThread myThread1 = new MyThread(stringBuilder);
        MyThread myThread2 = new MyThread(stringBuilder);
        MyThread myThread3 = new MyThread(stringBuilder);
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
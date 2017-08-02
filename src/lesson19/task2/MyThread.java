package lesson19.task2;

public class MyThread extends Thread {
    private StringBuilder a;

    public void run() {
        synchronized (a) {
            for (int i = 0; i < 100; i++) {
                System.out.print(a);
            }
            char letter = a.charAt(0);
            a.setCharAt(0, ++letter);
        }
    }

    MyThread(StringBuilder stringBuilder) {
        a = stringBuilder;
    }
}
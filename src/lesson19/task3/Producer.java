package lesson19.task3;

public class Producer implements Runnable {
    MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (myQueue.size() < 3) {
                System.out.println("Отправлено: " + i++);
                myQueue.put("task " + i);
            }
        }
    }
}

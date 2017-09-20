package lesson19.task3;

public class ProducerDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        Consumer consumer1 = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t3 = new Thread(producer);
        Thread t1 = new Thread(consumer1);
        t1.setName("Никмта");
        Thread t2 = new Thread(consumer2);
        t2.setName("Настя");

        t3.start();
        t2.start();
        t1.start();
    }
}

package lesson14.task2;

import java.util.ArrayDeque;
import java.util.Deque;

public class HeavyBox {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox();
        HeavyBox heavyBox2 = new HeavyBox();
        Deque<HeavyBox> queue = new ArrayDeque<HeavyBox>();
        queue.add(heavyBox1);
        queue.add(heavyBox2);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove() + " ");
        }
    }
}

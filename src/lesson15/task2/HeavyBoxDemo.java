package lesson15.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HeavyBoxDemo {
    public static void main(String[] args) {
        List<HeavyBox> arrayBox = new ArrayList<>();
        arrayBox.add(new HeavyBox(10));
        arrayBox.add(new HeavyBox(220));
        arrayBox.add(new HeavyBox(300));
        arrayBox.add(new HeavyBox(350));
        arrayBox.add(new HeavyBox(605));
        System.out.println(arrayBox);
        System.out.println(getHeavyBoxes(arrayBox));
        System.out.println(arrayBox);
    }

    public static List<HeavyBox> getHeavyBoxes(List<HeavyBox> arrBox) {
        List<HeavyBox> arrayBox2 = new ArrayList<>();
        Iterator<HeavyBox> iterator = arrBox.iterator();
        while (iterator.hasNext()) {
            HeavyBox elem = iterator.next();
            if (elem.getWeight() > 300) {
                arrayBox2.add(elem);
                iterator.remove();
            }
        }
        return arrayBox2;
    }
}

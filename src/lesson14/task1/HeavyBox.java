package lesson14.task1;

import java.util.ArrayList;
import java.util.List;

public class HeavyBox {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox();
        HeavyBox heavyBox2 = new HeavyBox();

        List<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(heavyBox1);
        arrayList.add(heavyBox2);

        for(HeavyBox a : arrayList){
            System.out.println(a);
        }
    }
}
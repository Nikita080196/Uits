package lesson17.task3;

import static lesson17.task3.Horse.deSerialize;
import static lesson17.task3.Horse.serialize;

public class Demo {
    public static void main(String[] args) {
        Horse horse = new Horse();
        serialize(horse);
        horse = deSerialize();
    }
}

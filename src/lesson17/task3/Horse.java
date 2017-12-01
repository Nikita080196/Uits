package lesson17.task3;

import java.io.*;

public class Horse extends Animal implements Serializable {
    private Halter halter;

    public Horse() {
        System.out.println("Horse");
    }

    public static void serialize(Horse horse) {
        try (OutputStream os = new FileOutputStream("src/lesson17/io/ser_output.txt");
             ObjectOutput out = new ObjectOutputStream(os)) {
            out.writeObject(horse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Horse deSerialize() {
        Horse horse = null;
        try (InputStream is = new FileInputStream("src/lesson17/io/ser_output.txt");
             ObjectInput oi = new ObjectInputStream(is)) {
            horse = (Horse) oi.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }
}

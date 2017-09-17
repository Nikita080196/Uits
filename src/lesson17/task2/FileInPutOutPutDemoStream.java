package lesson17.task2;

import java.io.*;

public class FileInPutOutPutDemoStream
{
    public static void main(String args[]) {
        try (OutputStream output = new FileOutputStream("src/lesson17/io/demo.txt");
             InputStream input = new FileInputStream("src/lesson17/io/demo.txt")) {
            char c[] = {'a', 'b', 'c'};
            for (char cha : c) {
                output.write(cha);
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}


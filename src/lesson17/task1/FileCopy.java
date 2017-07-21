package lesson17.task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String args[]) {
        try (FileInputStream fileInputStream = new FileInputStream("src\\lesson17\\task1\\file.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("src\\lesson17\\task1\\newFile.txt")) {
            int a;
            while ((a = fileInputStream.read()) != -1) {
                fileOutputStream.write(a);
            }
        } catch (IOException e) {
            System.out.println("Ошибка копирования файла! ");
        }
    }
}
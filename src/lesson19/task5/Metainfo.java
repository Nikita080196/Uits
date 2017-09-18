package lesson19.task5;

import lesson19.task2.MyThread;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Metainfo {
    public static void main(String[] args) {
        Class myThread = MyThread.class;
        System.out.println("Имя: " + myThread.getName());
        System.out.println();
        System.out.println("Информация : " + Arrays.toString(myThread.getDeclaredClasses()));
        System.out.println();
        System.out.println("Поля : " + Arrays.toString(myThread.getDeclaredFields()));
        System.out.println();
        System.out.println("Конструкторы: " + Arrays.toString(myThread.getDeclaredConstructors()));
        System.out.println();
        System.out.println("Методы : " + Arrays.toString(myThread.getDeclaredMethods()));
    }
}
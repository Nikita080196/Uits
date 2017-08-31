package lesson13.task4;

import static lesson13.task4.Calculatpr.*;

public class Demo {
    public static void main(String[] args) {
        Integer i = 33;
        Float f = 124.0f;
        System.out.println("Sum : " + sum(i, f));
        System.out.println("Multiply : " + multiply(i, f));
        System.out.println("Divide : " + divide(i, f));
        System.out.println("Subtraction : " + subtraction(i, f));
    }
}

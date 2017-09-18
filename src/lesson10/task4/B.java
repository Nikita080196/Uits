package lesson10.task4;

public class B extends A {
    void printInfoB() {
        System.out.println(" A не доступна из B ");
        System.out.println("Печать b: " + b);
        System.out.println("Печать c: " + c);
        System.out.println("Печать d: " + d);
    }
}

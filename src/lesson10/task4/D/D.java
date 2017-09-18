package lesson10.task4.D;

import lesson10.task4.A;

public class D extends A {
    public void printInfoD() {
        System.out.println("A не доступна из D ");
        System.out.println("Печать  b: " + b);
        System.out.println("C не доступна из D ");
        System.out.println("Печать d: " + d);
    }
}
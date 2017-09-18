package lesson10.task4.E;

import lesson10.task4.A;

public class E {
    public void printInfoE() {
        System.out.println("A не доступна из A");
        System.out.println("B не доступна из B");
        System.out.println("C не доступна из C");
        System.out.println("Печать d: " + new A().d);
    }
}

package lesson10.task4;

public class C {
    void printInfoC() {
        System.out.println("A не доступна из  C ");
        System.out.println("Печать b: " + new A().b);
        System.out.println("Печать c: " + new A().c);
        System.out.println("Печать d: " + new A().d);
    }
}
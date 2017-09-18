package lesson10.task4;

public class A {
    private int a;
    protected int b;
    int c;
    public int d;

    void printInfoA(){
        System.out.println("Печать privet a: " + a);
        System.out.println("Печать protected b: " + b);
        System.out.println("Печать default c: " + c);
        System.out.println("Печать public d: " + d);
    }
}
package lesson10.task9;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable[] print = new Printable[2];
        print[0] = new Book();
        print[1] = new Magazine();
        for (Printable print1 : print) {
            print1.print();
        }
    }
}

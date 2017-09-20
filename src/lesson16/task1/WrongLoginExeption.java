package lesson16.task1;

public class WrongLoginExeption extends Exception {
    public WrongLoginExeption() {

    }

    public WrongLoginExeption(String message) {
        super(message);
    }
}

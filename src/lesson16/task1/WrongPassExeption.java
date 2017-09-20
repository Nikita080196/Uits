package lesson16.task1;

public class WrongPassExeption extends Exception {
    public WrongPassExeption() {

    }

    public WrongPassExeption(String message) {
        super(message);
    }
}

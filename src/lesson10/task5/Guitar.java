package lesson10.task5;

public class Guitar implements Tools {
    private int stringNumber;

    public int getStringNumber() {
        return stringNumber;
    }

    public void setStringNumber(int stringNumber) {
        this.stringNumber = stringNumber;
    }

    public void play() {
        System.out.println("Играет " + KEY + " Гитараа");

    }
}
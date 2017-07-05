package lesson10.task5;

public class Baraban implements Tools {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет " + KEY + " Ьарабан.");
    }
}
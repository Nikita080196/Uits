package lesson10.task5;

public class Truba implements Tools {
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Играет " + KEY + " Труба.");
    }
}
package lesson10.task5;

public class Truba implements Tools {
    private int diameter;

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Играет " + KEY + " Труба.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truba truba = (Truba) o;

        return diameter == truba.diameter;
    }

    @Override
    public int hashCode() {
        return diameter;
    }

    @Override
    public String toString() {
        return "Truba{" +
                "diameter=" + diameter +
                '}';
    }
}
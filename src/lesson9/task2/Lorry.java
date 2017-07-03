package lesson9.task2;

import lesson7.task4.com.company.vehicles.Car;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String autoMark, String autoClass, int weight, int carrying) {
        super(autoMark, autoClass, weight);
        this.carrying = carrying;

    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}

package lesson7.task4.com.company.vehicles;

import lesson7.task4.com.company.details.Engine;
import lesson7.task4.com.company.professions.Driver;

public class Car {

    private String autoMark;
    private String autoClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String autoMark, String autoClass, int weight) {
        this.autoMark = autoMark;
        this.autoClass = autoClass;
        this.weight = weight;
    }

    public String getAutoMark() {
        return autoMark;
    }

    public void setAutoMark(String autoMark) {
        this.autoMark = autoMark;
    }

    public String getAutoClass() {
        return autoClass;
    }

    public void setAutoClass(String autoClass) {
        this.autoClass = autoClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Авто начинает движение! ");
    }

    public void stop() {
        System.out.println("Авто останавливается! ");
    }

    public void turnRight() {
        System.out.println("Авто повораичвает направо! ");
    }

    public void turnLeft() {
        System.out.println("Авто поворачивает налево! ");
    }

    public void printInfo() {
        System.out.println("Название авто : " + getAutoMark());
        System.out.println("Класс авто: " + getAutoClass());
        System.out.println("Масса авто : " + getWeight());
        System.out.println("Имя водителя авто : " + driver.getName());
        System.out.println("Стаж вождения водителя : " + driver.getExperience() + " года");
        System.out.println("Двигатель : " + engine.getProducer());
        System.out.println("Мощность двигателя : " + engine.getPower());
    }
}
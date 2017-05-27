package lesson7.task4.com.company.vehicles;

import lesson7.task4.com.company.details.Engine;
import lesson7.task4.com.company.professions.Driver;

public class Car {
    private String autoMark;
    private String autoClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String autoClass,String autoMark, int weight,Driver driver, Engine engine){
        this.autoClass = autoClass;
        this.autoMark = autoMark;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void start(){
        System.out.println("Авто начинает движение! ");
    }
    public void stop(){
        System.out.println("Авто останавливается! ");
    }
    public void turnRight(){
        System.out.println("Авто повораичвает направо! ");
    }
    public void turnLeft(){
        System.out.println("Авто поворачивает налево! ");
    }
    public void printInfo(){
        System.out.println("Название авто : " +autoMark);
        System.out.println("Класс авто: " + autoClass);
        System.out.println("Масса авто : "+weight);
        System.out.println("Имя водителя авто : " +driver.name);
        System.out.println("Стаж вождения водителя : " +driver.experience + " года");
        System.out.println("Двигатель : "+engine.producer);
        System.out.println("Мощность двигателя : " +engine.power);
    }
}
package lesson7.task4.com.company;

import lesson7.task4.com.company.details.Engine;
import lesson7.task4.com.company.professions.Driver;
import lesson7.task4.com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("S","Range Rover",2100,new Driver("Никита",2),new Engine("BMW",1000));

        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        car.printInfo();
    }
}

package lesson7.task4.com.company;

import lesson7.task4.com.company.details.Engine;
import lesson7.task4.com.company.professions.Driver;
import lesson7.task4.com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Range Rover", "S", 2000);
        Engine engine = new Engine("BMW", 749);
        Driver driver = new Driver("Никита", 2);

        car.setDriver(driver);
        System.out.println(driver);
        car.setEngine(engine);
        System.out.println(engine);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        car.printInfo();
    }
}
package lesson7.task4.com.company;

import lesson7.task4.com.company.details.Engine;
import lesson7.task4.com.company.professions.Driver;
import lesson7.task4.com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine engine = new Engine();
        Driver driver = new Driver();

        car.setAutoClass("S");
        car.setAutoMark("Range Rover");
        car.setWeight(2000);
        driver.setExperience(1);
        driver.setName("Никита");
        engine.setProducer("BMW");
        engine.setPower(1200);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
        car.printInfo();
    }
}

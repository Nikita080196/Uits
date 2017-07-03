package lesson9.task2;

import lesson7.task4.com.company.details.Engine;
import lesson7.task4.com.company.professions.Driver;

public class Demo {
    public static void main(String[] args) {
        Lorry lorry  = new Lorry("Mercedes","A",2000,10000);
        SportCar sportCar = new SportCar("Nissan","B",1000,340);
        Driver driver = new Driver(20,"Игорь Антонов",2);
        Driver driver1 = new Driver(19,"Василий Николаев",7);
        Engine engine = new Engine("BMW",300);
        Engine engine1 = new Engine("BMW",500);
        lorry.setDriver(driver);
        lorry.setEngine(engine);
        sportCar.setDriver(driver1);
        sportCar.setEngine(engine1);
        System.out.println(lorry);
        System.out.println(sportCar);
    }
}

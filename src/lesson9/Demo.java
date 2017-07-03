package lesson9;

import lesson9.task3.*;

public class Demo {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("рыба ", "квартира/частный дом ", "Черный ", "Барсик "),
                new Cat("корм ", "квартира/частный дом ", "Белый ", "Марс "),
                new Dog("мясо ", "улица ", "Овчарка ", "60 кг "),
                new Horse("морковка ", "загон ", 2, 5),
        };
        for (Animal animal : animals) {
            Veterinar.treatAnimal(animal);
        }
    }
}

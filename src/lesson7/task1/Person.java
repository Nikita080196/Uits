package lesson7.task1;

public class Person {
    String name = "Нмкита";
    int age = 21;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void talk() {
        System.out.println(name + " ,которому " + age + " разговаривает");
    }

    public void move() {
        System.out.println(name + " ,которому " + age + " дваигается");
    }
}
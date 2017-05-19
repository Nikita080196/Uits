package lesson7.task1;

public class PersonDemo {
    public static void main(String[] args) {

        Person person1 = new Person ("Дмитрий" , 10);
        Person person2 = new Person ();

        person1.talk();
        person2.talk();

        person1.move();
        person2.move();
    }
}
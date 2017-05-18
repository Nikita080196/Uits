package lesson7.task3;

import java.util.Scanner;

public class Book {
    private String name;
    private int age;
    private String faculty;
    private String birth;
    private String phoneNumber;

    public Book(){
        Scanner scn = new Scanner(System.in);
    System.out.println("Введите имя подьзователя : ");
    name=scn.next();
    System.out.println("Введите возраст пользователя: ");
    age=scn.nextInt();
    System.out.println("Введите название факультета пользователя: ");
    faculty=scn.next();
    System.out.println("Введите дату рождения пользователя: ");
    birth=scn.next();
    System.out.println("Введите номер мобильного телефона пользователя: ");
    phoneNumber=scn.next();
    }
    public void takebook(String book){
        System.out.println("Пользователь " +name + " взял книгу.Книга называется " +book);
    }
    public void returnbook(String book) {
        System.out.println("Пользователь " + name + " вернул книгу.Книга называется " + book);
    }
    public void info(){
        System.out.println("Имя пользователя : "+name+"\n" + "Возраст пользователя : " +age + "\n" + "Название факультета пользователя : "+
        faculty +"\n"+ "Дата рождения пользователя : " +birth +"\n"+"Номер мобидьного телефона пользователя :" +phoneNumber);
    }
}

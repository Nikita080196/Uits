package lesson7.task3;

public class LibraryUser {
    private String name;
    private int age;
    private String faculty;
    private String birth;
    private String phoneNumber;
    private int readerNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setReaderNumber(int readerNumber) {
        this.readerNumber = readerNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirth() {
        return birth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getReaderNumber() {
        return readerNumber;
    }

    public void takeBook(String book) {
        System.out.println("Пользователь " + name + " взял книгу.Книга называется " + book);
    }

    public void returnBook(String book) {
        System.out.println("Пользователь " + name + " вернул книгу.Книга называется " + book);
    }

    public void info() {
        System.out.println("Имя пользователя : " + name + "\n" + "Возраст пользователя : " + age + "\n" + "Название факультета пользователя : " +
                faculty + "\n" + "Дата рождения пользователя : " + birth + "\n" + "Номер мобидьного телефона пользователя :" + phoneNumber);
    }
}
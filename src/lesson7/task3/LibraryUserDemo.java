package lesson7.task3;

public class LibraryUserDemo {
    public static void main(String[] args) {
        LibraryUser user1 = new LibraryUser();
        LibraryUser user2 = new LibraryUser();

        user1.setName("Никита");
        user1.setAge(21);
        user1.setBirth("08.01.1996");
        user1.setFaculty("КИТ");
        user1.setPhoneNumber("098936753");
        user1.setReaderNumber(2465);
        System.out.println("Студент : " + user1.getName() + " вошел в систему!");
        System.out.println();

        user2.setName("Толя");
        user2.setAge(24);
        user2.setBirth("08.01.1991");
        user2.setFaculty("АП");
        user2.setPhoneNumber("098953753");
        user2.setReaderNumber(2421);
        System.out.println("Студент : " + user2.getName() + " вошел в систему!");
        System.out.println();

        user1.takeBook("Жизнь взаймы");
        user1.returnBook("Мастер и Маргарита");
        System.out.println();

        user2.takeBook("Маленький принцы");
        user2.returnBook("Бойцовский клуб");
        System.out.println();

        user1.info();
        System.out.println();
        user2.info();
    }
}
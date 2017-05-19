package lesson7.task3;

/**
 * Created by Валентина on 16.05.2017.
 */
public class BookDemo {
    public static void main(String[] args) {
            Book user1 = new Book();
            Book user2 = new Book();

            user1.takebook("Мастер и Маргарита");
            user2.takebook("Жизнь взаймы");

            user1.returnbook("Маленький принц");
            user2.returnbook("Триумфальная арка");

            user1.info();
            user2.info();
    }
}

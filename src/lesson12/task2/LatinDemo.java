package lesson12.task2;

public class LatinDemo {
    public static void main(String[] args) {
        Latin latin = new Latin();
        String s = "Hello,how ваши дела? ";
        System.out.println("Число латинских слов : " + latin.countWords(s));
    }
}

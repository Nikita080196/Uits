package lesson11;

public class Run {
    public static void main(String[] args) {
        Season season = Season.SUMMER;

        switch (season) {
            case WINTER: {
                System.out.println("Очень холодно.Идет снег");
                break;
            }
            case SPRING: {
                System.out.println("Снег после зимы тает.Потепление");
                break;
            }
            case SUMMER: {
                System.out.println("Очень жарко.Нужно ехать на море");
                break;
            }
            case AUTUMN: {
                System.out.println("Начало учебы.Похолодание.Скоро Зима и Ноаый ГОД!УРА!");
                break;
            }
        }

        for (Season s : Season.values()) {
            System.out.println();
            System.out.println(s + " " + s.getTemp());
            s.getSeasonDescription();
        }
        System.out.println();
        season = Season.valueOf("SUMMER");
        System.out.println("Я люблю " + season + " потому что тепло!");
    }
}
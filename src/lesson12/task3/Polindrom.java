package lesson12.task3;

public class Polindrom {
    public static void main(String[] args) {
        String str = "Если есть хвосты по дз начните с 1 не сданного задания. 123 324 111 2552";
        str = getNumb(str).trim();
        System.out.println(str);
        String[] numb = str.split("\\s+");
        for (String number : numb) {
            StringBuilder sb = new StringBuilder(number);
            sb.reverse();
            if (number.equals(sb.toString())) {
                System.out.println("Минимальньое значение различных символов : " + number);
            }
        }
    }

    public static String getNumb(String str) {
        String s = str.replaceAll("[A-Za-zА-Яа-я,.]", "");
        return s;
    }
}
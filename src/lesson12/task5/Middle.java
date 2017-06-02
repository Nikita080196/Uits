package lesson12.task5;

public class Middle {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("string");
        StringBuilder stringBuilder2 = new StringBuilder("code");
        StringBuilder stringBuilder3 = new StringBuilder("Practice");
        getMiddleLetters(stringBuilder1);
        getMiddleLetters(stringBuilder2);
        getMiddleLetters(stringBuilder3);
    }

    private static void getMiddleLetters(StringBuilder sb) {
        System.out.println(sb);
        StringBuilder mid = sb.delete(0, (sb.length() / 2 - 1));
        mid.setLength(2);
        System.out.println(mid);
        System.out.println();
    }
}
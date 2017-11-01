package lesson12.task1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinString {
    public static void main(String[] args) {
        String string1 = "Привет,меня зовут Никита.Учусь в ХПИ.";
        Matcher matcher = Pattern.compile("[A-Za-zА-Яа-я0-9]+").matcher(string1);
        Set<String> words = new LinkedHashSet<>();
        while (matcher.find()) {
            words.add(string1.substring(matcher.start(), matcher.end()));
        }
        System.out.println(getWord(words));
    }

    public static int getNumbChar(String word) {
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }
        return letters.size();
    }

    public static String getWord(Set<String> words) {
        String res = " ";
        int charNumb = Integer.MAX_VALUE;
        for (String word : words) {
            int j = getNumbChar(word);
            if (j < charNumb) {
                charNumb = j;
                res = word;
            }
        }
        return res;
    }
}

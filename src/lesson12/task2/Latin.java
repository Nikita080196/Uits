package lesson12.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Latin {
    public int countWords(String s) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+\\s?");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}


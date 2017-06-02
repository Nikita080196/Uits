package lesson12.task1;

public class Rename {
    public static void main(String[] args) {
        String text = "Object oriented programming (OOP) is a programming paradigm based on the concept of objects.";
        String regex = "(?i)object\\s*oriented\\s*programming";
        text = text.replaceAll(regex, "OOP");
        System.out.println(text);
    }

    }


package lesson16.task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnicNumber {
    public static void main(String[] args) {
        System.out.println("Введите набор чисел: ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> set = new HashSet();
        set.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(set);
    }
}
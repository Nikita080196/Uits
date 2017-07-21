package lesson14.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Union {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 7, 1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(7, 10, 1, 6, 8));
        Set<Integer> union = Stream.concat(set1.stream(), set2.stream()).collect(Collectors.toSet());
        Set<Integer> intersect = set1.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println("Значение Set1 : " + set1);
        System.out.println("Значение Set2 : " + set2);
        System.out.println();
        System.out.println("Объединение : " + union);
        System.out.println("Пересичение : " + intersect);
    }
}

package lesson18.task3;

import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(3);
        set1.add(6);
        set2.add(6);
        set2.add(5);
        set2.add(4);
        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
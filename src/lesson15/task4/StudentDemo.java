package lesson15.task4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StudentDemo {
    public static void main(String[] args) {
        Map<String, Integer> mark1 = new HashMap<>();
        mark1.put("Физика", 3);
        mark1.put("Математика", 5);
        mark1.put("Биология", 5);
        Map<String, Integer> mark2 = new HashMap<>();
        mark2.put("Музыка", 3);
        mark2.put("Геометрия", 2);
        mark2.put("История", 3);
        Student student1 = new Student("Ваня", "KIT 23а", 5, mark1);
        Student student2 = new Student("Василий", "KIT 23а", 5, mark2);
        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        System.out.println("Студенты до отчисления: ");
        Student.printStudent(students, 5);
        Student.passOrNot(students);
        System.out.println("Студенты,которые сдали сессию и перешли на след.курс: ");
        Student.printStudent(students, 6);
    }
}
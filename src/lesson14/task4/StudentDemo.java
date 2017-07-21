package lesson14.task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student(3, "Вася"));
        list.add(new Student(2, "Никита"));
        list.add(new Student(4, "Петя"));
        list.add(new Student(2, "Екатерина"));
        list.add(new Student(5, "Антон"));
        list.add(new Student(1, "Денис"));
        list.add(new Student(5, "Евгения"));

        int course = 1;
        printStudents(list, course);
        course = 2;
        printStudents(list, course);
        course = 3;
        printStudents(list, course);
        course = 4;
        printStudents(list, course);
        course = 5;
        printStudents(list, course);
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты " + course + " курса:");

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}

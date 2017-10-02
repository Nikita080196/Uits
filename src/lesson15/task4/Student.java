package lesson15.task4;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String name;
    private String group;
    private int course;
    private Map<String, Integer> mark;

    public Student(String name, String group, int course, Map<String, Integer> mark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Map<String, Integer> getMark() {
        return mark;
    }

    public void setMark(Map<String, Integer> mark) {
        this.mark = mark;
    }

    public static void passOrNot(List<Student> students) {
        for (Student student : students) {
            if (averageMark(student) >= 3) {
                student.setCourse(student.getCourse() + 1);
            } else {
                students.remove(student);
            }
        }
    }

    public static int averageMark(Student student) {
        int sum = 0;
        Map<String, Integer> mark = student.getMark();
        Set<Map.Entry<String, Integer>> set = mark.entrySet();
        for (Map.Entry<String, Integer> map : set) {
            String key = map.getKey();
            sum += mark.get(key);
        }
        return sum / mark.size();
    }

    public static void printStudent(List<Student> students, int cource) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == cource) {
                System.out.println(student.getName());
            }
        }
    }
}

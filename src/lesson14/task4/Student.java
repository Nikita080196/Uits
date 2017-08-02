package lesson14.task4;

public class Student {
    private int course;
    private String name;

    public Student(int course, String name) {
        this.course = course;
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + course;
        return result;
    }

    @Override
    public String toString() {
        return "Студент {" + "Имя = '" + name + '\'' + ", Курс = " + course + '}';
    }
}
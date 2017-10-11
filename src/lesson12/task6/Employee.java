package lesson12.task6;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class Employee {
    private String fullName;
    private double salary;
    public static Date salaryDate;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee("Никита", 13033.5252);
        employee[1] = new Employee("Вася", 50045.22425);
        employee[2] = new Employee("Петя", 10420.521);
        FullReport.generateFullReport(employee);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.salary, salary) != 0) return false;
        return fullName != null ? fullName.equals(employee.fullName) : employee.fullName == null;
    }

    @Override
    public int hashCode() {
        int result;
        result = fullName != null ? fullName.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
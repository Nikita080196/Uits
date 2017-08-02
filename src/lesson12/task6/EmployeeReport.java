package lesson12.task6;

public class EmployeeReport {
    public static void generateReport(Employee[] employee) {
        for (Employee e : employee) {
            System.out.format("%-90s%.2f%n", e.getFullName(), e.getSalary());
        }
    }
}
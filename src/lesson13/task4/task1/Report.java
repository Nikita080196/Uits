package lesson13.task4.task1;

import java.util.Date;

public class Report {
    public static void generateReport(Emlpoyee[] employees) {
        System.out.printf("%-30s    %-10s    %s\n", "Имя", "зарплата", "дата ");
        for (Emlpoyee employee : employees) {
            System.out.printf("%-30s    %-10s    %s %4$tB %4$td, %4$tY\n", employee.getFullName(), employee.getSalary(), "Дата:", new Date());
        }
    }
}

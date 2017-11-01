package lesson13.task4.task1;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class EmployeeDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Emlpoyee[] employees = {
                new Emlpoyee("Никита", 10000.0 / 21, new Date()),
                new Emlpoyee("Вася", 12300.0 / 21, new Date()),
                new Emlpoyee("Дима", 15265.0 / 21, new Date())};
        FullReport.generateReport(employees, " ", " ");
        System.out.println();
        FullReport.generateReport(employees, "US", "US");
        System.out.println();
        FullReport.generateReport(employees, "UA", "UA");
    }
}

package lesson12.task6;

public class Employee {
        private String fullName;
        private double salary;

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

        public static void main(String[] args) {
            Employee[] employee = new Employee[3];
            employee[0] = new Employee("Никита", 13033.5252);
            employee[1] = new Employee("Вася", 50045.22425);
            employee[2] = new Employee("Петя", 10420.521);
            EmployeeReport.generateReport(employee);
        }
    }
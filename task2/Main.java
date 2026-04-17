import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Kanan", "Hajiyev", 50000.0));
        employees.add(new Employee("Mirze", "Mirzeyev", 60000.0));
        employees.add(new Employee("Random", "Person", 55000.0));

        Function<Employee, String> formatCard = emp -> "Name: " + emp.getLastName() + ", " + emp.getFirstName() + " - Salary: $" + emp.getSalary();
        Function<Employee, Double> salaryPicker = Employee::getSalary;

        for (Employee emp : employees) {
            System.out.println(formatCard.apply(emp));
            System.out.println("Salary: $" + salaryPicker.apply(emp));
        }
    }
}

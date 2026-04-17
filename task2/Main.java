// Define a class Employee:
// ○ Fields: String firstName, String lastName, and double salary.
// ○ Define getters for all fields.
// 2. In your main method:
// ○ Create a List<Employee>.
// ○ Define a Function<Employee, String> formatCard using a single-statement
// lambda that transforms an Employee into a string: "Name: [LastName, FirstName]
// - Salary: $[salary]".
// ○ Create a second Function<Employee, Double> salaryPicker using a Method
// Reference (e.g., Employee::getSalary).
// ○ Iterate through the list and print the result of applying these functions to each
// employee
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

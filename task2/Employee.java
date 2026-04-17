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

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }
}
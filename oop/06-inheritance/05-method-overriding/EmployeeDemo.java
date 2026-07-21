/**
 * =============================================================
 * Program Name : EmployeeDemo
 * Author       : Aradhya Thakur
 * Language     : Java
 * Topic        : Inheritance & Method Overriding
 *
 * Description:
 * Demonstrates inheritance using an Employee superclass
 * and a Developer subclass.
 *
 * The Developer class extends Employee by:
 * - Reusing common employee information
 * - Calling the parent constructor using super()
 * - Overriding the work() method
 * - Adding developer-specific behavior
 *
 * Concepts Covered:
 * - Inheritance
 * - Constructor Chaining
 * - Method Overriding
 * - super Keyword
 * - Encapsulation
 * - Getters
 * - Input Validation
 *
 * Execution Order:
 * 1. Employee constructor executes.
 * 2. Developer constructor executes.
 * 3. Employee details are displayed.
 * 4. Overridden work() method executes.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * =============================================================
 */

/**
 * Represents a generic employee.
 */
class Employee {

    /** Employee name. */
    private String name;

    /** Unique employee ID. */
    private String employeeId;

    /** Employee salary. */
    private double salary;

    /**
     * Constructs an Employee object.
     *
     * @param name Employee name
     * @param employeeId Employee ID
     * @param salary Employee salary
     */
    Employee(String name, String employeeId, double salary) {

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid name. Default value assigned.");
        }

        if (employeeId != null && !employeeId.isBlank()) {
            this.employeeId = employeeId;
        } else {
            this.employeeId = "Unknown";
            System.out.println("Invalid employee ID. Default value assigned.");
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
            System.out.println("Invalid salary. Default value assigned.");
        }

        System.out.println("Employee constructor executed for " + getName() + ".\n");
    }

    /**
     * Returns the employee name.
     *
     * @return employee name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the employee ID.
     *
     * @return employee ID
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Returns the employee salary.
     *
     * @return employee salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Displays the generic work performed by an employee.
     */
    public void work() {

        System.out.println("Employee is working.");
    }

    /**
     * Displays employee details.
     */
    public void displayEmployeeDetails() {

        System.out.println("----- Employee Details -----");
        System.out.println("Name   : " + getName());
        System.out.println("ID     : " + getEmployeeId());
        System.out.printf("Salary : ₹%.2f%n", getSalary());
        System.out.println();
    }
}

/**
 * Represents a developer.
 *
 * Developer inherits common employee information
 * from Employee and adds a programming language.
 */
class Developer extends Employee {

    /** Primary programming language used by the developer. */
    private String programmingLanguage;

    /**
     * Constructs a Developer object.
     *
     * @param name Employee name
     * @param employeeId Employee ID
     * @param salary Employee salary
     * @param programmingLanguage Programming language
     */
    Developer(String name,
              String employeeId,
              double salary,
              String programmingLanguage) {

        super(name, employeeId, salary);

        if (programmingLanguage != null &&
                !programmingLanguage.isBlank()) {

            this.programmingLanguage = programmingLanguage;

        } else {

            this.programmingLanguage = "Unknown";
            System.out.println("Invalid programming language. Default value assigned.");
        }

        System.out.println("Developer constructor executed for " + getName() + ".\n");
    }

    /**
     * Returns the programming language.
     *
     * @return programming language
     */
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    /**
     * Displays the work performed by a developer.
     *
     * Overrides the work() method of Employee and
     * extends its behavior using super.work().
     */
    @Override
    public void work() {

        super.work();
        System.out.println("Developer is writing Java code.");
    }

    /**
     * Displays complete developer details.
     */
    public void displayDeveloperDetails() {

        displayEmployeeDetails();
        System.out.println("Programming Language : " + getProgrammingLanguage());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Developer d1 = new Developer(
                "Rajendra",
                "E101",
                85000.0,
                "Java"
        );

        Developer d2 = new Developer(
                "Ansh",
                "E102",
                78000.0,
                "Python"
        );

        System.out.println("========== DEVELOPER 1 ==========\n");

        d1.displayDeveloperDetails();
        d1.work();

        System.out.println();

        System.out.println("========== DEVELOPER 2 ==========\n");

        d2.displayDeveloperDetails();
        d2.work();
    }
}

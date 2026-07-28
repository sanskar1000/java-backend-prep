/**
 * ------------------------------------------------------------
 * Program Name : EmployeeDemo
 * Topic        : Abstract Class in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates abstraction using an abstract
 * Employee class. Different employee roles (Developer and
 * Tester) provide their own implementation of the work()
 * method while sharing common employee information.
 *
 * Concepts Covered:
 * - Abstract Class
 * - Abstract Method
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism
 * - Encapsulation
 * - Constructors
 * - Input Validation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Represents a generic employee.
 *
 * Every employee has an ID, name, and salary.
 * Each employee must define its own work() behavior.
 */
abstract class Employee {

    /** Employee ID */
    private String id;

    /** Employee name */
    private String name;

    /** Employee salary */
    private double salary;

    /**
     * Constructs an Employee object.
     *
     * @param id Employee ID
     * @param name Employee name
     * @param salary Employee salary
     */
    public Employee(String id, String name, double salary) {

        if (id != null && !id.isBlank()) {
            this.id = id;
        } else {
            this.id = "Unknown";
            System.out.println("Invalid ID. Default value assigned.");
        }

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid name. Default value assigned.");
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
            System.out.println("Invalid salary. Default value assigned.");
        }

        System.out.println("Employee constructor executed.\n");
    }

    /**
     * Returns the employee ID.
     *
     * @return employee ID
     */
    public String getId() {
        return id;
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
     * Returns the employee salary.
     *
     * @return employee salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Defines the work performed by an employee.
     *
     * Each subclass provides its own implementation.
     */
    public abstract void work();

    /**
     * Displays common employee details.
     */
    public void displayDetails() {

        System.out.println("------- Employee Details -------");
        System.out.println("ID      : " + getId());
        System.out.println("Name    : " + getName());
        System.out.printf("Salary  : ₹%,.2f%n", getSalary());
    }
}

/**
 * Represents a software developer.
 *
 * A Developer specializes in writing software using
 * a specific programming language.
 */
class Developer extends Employee {

    /** Programming language used by the developer */
    private String programmingLanguage;

    /**
     * Constructs a Developer object.
     *
     * @param id Employee ID
     * @param name Employee name
     * @param salary Employee salary
     * @param programmingLanguage Programming language
     */
    public Developer(String id,
                     String name,
                     double salary,
                     String programmingLanguage) {

        super(id, name, salary);

        if (programmingLanguage != null && !programmingLanguage.isBlank()) {
            this.programmingLanguage = programmingLanguage;
        } else {
            this.programmingLanguage = "Unknown";
            System.out.println("Invalid programming language. Default value assigned.");
        }

        System.out.println("Developer constructor executed.\n");
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
     * Performs the developer's work.
     */
    @Override
    public void work() {
        System.out.println("Developing software using " + getProgrammingLanguage() + ".");
    }

    /**
     * Displays complete developer details.
     */
    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("Programming Language : " + getProgrammingLanguage());
        System.out.println();
    }
}

/**
 * Represents a software tester.
 *
 * A Tester verifies software quality using
 * a specific testing tool.
 */
class Tester extends Employee {

    /** Testing tool used by the tester */
    private String testingTool;

    /**
     * Constructs a Tester object.
     *
     * @param id Employee ID
     * @param name Employee name
     * @param salary Employee salary
     * @param testingTool Testing tool
     */
    public Tester(String id,
                  String name,
                  double salary,
                  String testingTool) {

        super(id, name, salary);

        if (testingTool != null && !testingTool.isBlank()) {
            this.testingTool = testingTool;
        } else {
            this.testingTool = "Unknown";
            System.out.println("Invalid testing tool. Default value assigned.");
        }

        System.out.println("Tester constructor executed.\n");
    }

    /**
     * Returns the testing tool.
     *
     * @return testing tool
     */
    public String getTestingTool() {
        return testingTool;
    }

    /**
     * Performs the tester's work.
     */
    @Override
    public void work() {
        System.out.println("Testing software using " + getTestingTool() + ".");
    }

    /**
     * Displays complete tester details.
     */
    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("Testing Tool : " + getTestingTool());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 *
 * Demonstrates abstraction and runtime polymorphism
 * by storing Developer and Tester objects using
 * Employee references.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Employee employee1 =
                new Developer("E101", "Aradhya", 70000.0, "Java");

        Employee employee2 =
                new Tester("E102", "Yasir", 60000.0, "Selenium");

        System.out.println("========== DEVELOPER ==========\n");

        employee1.displayDetails();
        employee1.work();

        System.out.println();

        System.out.println("=========== TESTER ============\n");

        employee2.displayDetails();
        employee2.work();
    }
}

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * ============================================================================
 * Project      : Employee Functional Interface Practice
 * File Name    : EmployeeProcessorDemo.java
 * Author       : Aradhya Thakur
 * Language     : Java
 * Year         : 2026
 *
 * Description
 * ----------------------------------------------------------------------------
 * This program demonstrates how Java functional interfaces can be combined
 * with OOP concepts to process Employee objects.
 *
 * Concepts Demonstrated
 * ----------------------------------------------------------------------------
 * • Encapsulation
 * • Constructor validation
 * • Getters
 * • Functional interfaces
 * • Predicate<T>
 * • Function<T, R>
 * • Consumer<T>
 * • Lambda expressions
 * • Interface-based programming
 * • Runtime behavior through functional interfaces
 *
 * Processing Flow
 * ----------------------------------------------------------------------------
 * Employee
 *    ↓
 * Predicate<Employee>
 *    ↓
 * salary >= 50000?
 *    ↓
 * Function<Employee, String>
 *    ↓
 * Employee → Employee name
 *    ↓
 * Consumer<Employee>
 *    ↓
 * Display employee information
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ============================================================================
 */

/**
 * Represents an employee in the organization.
 */
class Employee {

    private String id;
    private String name;
    private double salary;

    /**
     * Constructs an Employee object with validation.
     *
     * @param id employee ID
     * @param name employee name
     * @param salary employee salary
     */
    public Employee(String id, String name, double salary) {

        if (id != null && !id.isBlank()) {
            this.id = id;
        } else {
            this.id = "Unknown";
            System.out.println(
                    "Invalid ID, default value assigned."
            );
        }

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println(
                    "Invalid name, default value assigned."
            );
        }

        if (salary >= 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
            System.out.println(
                    "Invalid salary, default value assigned."
            );
        }
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
}

/**
 * Driver class demonstrating functional interfaces with Employee objects.
 */
public class EmployeeProcessorDemo {

    public static void main(String[] args) {

        Employee employee1 =
                new Employee("E101", "Aradhya", 70000);

        Employee employee2 =
                new Employee("E102", "Uday", 40000);

        Employee employee3 =
                new Employee("E103", "Rahul", 65000);

        /*
         * Predicate:
         * Checks whether an employee earns at least ₹50,000.
         */
        Predicate<Employee> isEligible =
                employee -> employee.getSalary() >= 50000;

        /*
         * Function:
         * Converts an Employee object into the employee's name.
         */
        Function<Employee, String> getEmployeeName =
                employee -> employee.getName();

        /*
         * Consumer:
         * Performs an action on an Employee object.
         */
        Consumer<Employee> displayEmployee =
                employee -> {

                    System.out.println(
                            "------------------------------"
                    );

                    System.out.println(
                            "Employee ID : " + employee.getId()
                    );

                    System.out.println(
                            "Name        : " + employee.getName()
                    );

                    System.out.printf(
                            "Salary      : ₹%,.2f%n",
                            employee.getSalary()
                    );
                };

        System.out.println(
                "===== Eligible Employees ====="
        );

        processEmployee(
                employee1,
                isEligible,
                getEmployeeName,
                displayEmployee
        );

        processEmployee(
                employee2,
                isEligible,
                getEmployeeName,
                displayEmployee
        );

        processEmployee(
                employee3,
                isEligible,
                getEmployeeName,
                displayEmployee
        );
    }

    /**
     * Processes an employee using Predicate, Function and Consumer.
     *
     * @param employee employee to process
     * @param eligibilityCheck predicate used for validation
     * @param nameConverter function used to extract employee name
     * @param displayAction consumer used to display employee details
     */
    public static void processEmployee(
            Employee employee,
            Predicate<Employee> eligibilityCheck,
            Function<Employee, String> nameConverter,
            Consumer<Employee> displayAction) {

        if (employee == null) {
            System.out.println("Invalid employee.");
            return;
        }

        if (!eligibilityCheck.test(employee)) {
            return;
        }

        String employeeName =
                nameConverter.apply(employee);

        System.out.println(
                "Processing employee: " + employeeName
        );

        displayAction.accept(employee);
    }
}

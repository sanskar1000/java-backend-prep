package oop.statickeyword;

/**
 * ------------------------------------------------------------
 * Program Name : EmployeeCounter
 * Topic        : Static Keyword and Encapsulation
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of:
 * - Static variables
 * - Encapsulation
 * - Constructors
 * - Validation
 * - Getter methods
 *
 * Only valid employees are counted.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Employee {

    // Instance variables
    private String name;
    private double salary;

    // Static variable shared by all objects
    private static int employeeCount;

    /**
     * Creates a new Employee.
     *
     * @param name employee name
     * @param salary employee salary
     */
    Employee(String name, double salary) {

        boolean valid = true;

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            valid = false;
            System.out.println("Invalid name.");
        }

        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
            valid = false;
            System.out.println("Invalid salary.");
        }

        if (valid) {
            employeeCount++;
        }
    }

    /**
     * Returns employee name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns employee salary.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Returns total valid employees.
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }

    /**
     * Displays employee details.
     */
    public void displayEmployee() {

        System.out.println("------- Employee Details -------");
        System.out.println("Name   : " + name);
        System.out.printf("Salary : %.2f%n", salary);
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e1 =
                new Employee(
                        "Aman",
                        50000.89
                );

        Employee e2 =
                new Employee(
                        "Raj",
                        43000.00
                );

        Employee e3 =
                new Employee(
                        "Simran",
                        80000.00
                );

        Employee e4 =
                new Employee(
                        "",
                        -1000.00
                );

        e1.displayEmployee();
        e2.displayEmployee();
        e3.displayEmployee();
        e4.displayEmployee();

        System.out.println(
                "Total Valid Employees : "
                        + Employee.getEmployeeCount()
        );
    }
}

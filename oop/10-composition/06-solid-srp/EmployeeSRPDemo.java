package solid.srp;

/**
 * ------------------------------------------------------------
 * Program Name : EmployeeSRPDemo
 * Topic        : Single Responsibility Principle (SRP)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the Single Responsibility
 * Principle (SRP).
 *
 * SRP states that a class should have one clear
 * responsibility and one reason to change.
 *
 * Responsibilities in this program:
 *
 * Employee
 *     -> Stores employee information.
 *
 * SalaryCalculator
 *     -> Calculates annual salary.
 *
 * EmployeePrinter
 *     -> Displays employee information.
 *
 * Main
 *     -> Creates objects and coordinates the operations.
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Private Fields
 * - Getter Methods
 * - Object Interaction
 * - Single Responsibility Principle
 * - Validation
 *
 * ------------------------------------------------------------
 */


/**
 * Represents an employee.
 *
 * Responsibility:
 * Store employee-related information.
 */
class Employee {

    private String employeeId;
    private String name;
    private double salary;

    /**
     * Creates an Employee object.
     *
     * @param employeeId unique employee ID
     * @param name employee name
     * @param salary monthly salary
     */
    public Employee(
            String employeeId,
            String name,
            double salary
    ) {

        if (employeeId != null && !employeeId.isBlank()) {

            this.employeeId = employeeId;

        } else {

            this.employeeId = "Unknown";

            System.out.println(
                    "Invalid employee ID. Default value assigned.\n"
            );
        }

        if (name != null && !name.isBlank()) {

            this.name = name;

        } else {

            this.name = "Unknown";

            System.out.println(
                    "Invalid name. Default value assigned.\n"
            );
        }

        if (salary > 0) {

            this.salary = salary;

        } else {

            this.salary = 0;

            System.out.println(
                    "Invalid salary. Default value assigned.\n"
            );
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}


/**
 * Calculates employee salary.
 *
 * Responsibility:
 * Perform salary-related calculations.
 */
class SalaryCalculator {

    /**
     * Calculates annual salary from monthly salary.
     *
     * @param employee employee whose salary is calculated
     * @return annual salary
     * @throws IllegalArgumentException if employee is null
     */
    public double calculateAnnualSalary(Employee employee) {

        if (employee == null) {

            throw new IllegalArgumentException(
                    "Employee cannot be null."
            );
        }

        return employee.getSalary() * 12;
    }
}


/**
 * Prints employee information.
 *
 * Responsibility:
 * Display employee-related information.
 */
class EmployeePrinter {

    /**
     * Prints employee details.
     *
     * @param employee employee whose details are displayed
     * @throws IllegalArgumentException if employee is null
     */
    public void printEmployee(Employee employee) {

        if (employee == null) {

            throw new IllegalArgumentException(
                    "Employee cannot be null."
            );
        }

        System.out.println(
                "------- Employee Details -------"
        );

        System.out.println(
                "Employee ID   : "
                        + employee.getEmployeeId()
        );

        System.out.println(
                "Name          : "
                        + employee.getName()
        );

        System.out.printf(
                "Monthly Salary: ₹%,.2f%n",
                employee.getSalary()
        );
    }
}


/**
 * Demonstrates the Single Responsibility Principle.
 */
public class EmployeeSRPDemo {

    public static void main(String[] args) {

        // Create employee object
        Employee employee =
                new Employee(
                        "E101",
                        "Aradhya",
                        50000.0
                );

        // Create service objects
        SalaryCalculator calculator =
                new SalaryCalculator();

        EmployeePrinter printer =
                new EmployeePrinter();

        // Calculate annual salary
        double annualSalary =
                calculator.calculateAnnualSalary(employee);

        // Display employee information
        printer.printEmployee(employee);

        System.out.printf(
                "Annual Salary : ₹%,.2f%n",
                annualSalary
        );
    }
}

/**
 * ------------------------------------------------------------
 * Program Name : EmployeeSalaryOCPDemo
 * Topic        : Open/Closed Principle (OCP)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the Open/Closed Principle (OCP).
 *
 * OCP states:
 *
 * "Software entities should be open for extension,
 * but closed for modification."
 *
 * The SalaryCalculator interface defines a common contract
 * for calculating employee salaries.
 *
 * Different salary calculation rules are implemented through
 * separate classes:
 *
 * - FullTimeSalaryCalculator
 * - ContractSalaryCalculator
 * - InternSalaryCalculator
 *
 * SalaryProcessor works with the SalaryCalculator interface,
 * so it does not need to be modified when a new salary
 * calculation type is added.
 *
 * Concepts Used:
 * - Interface
 * - Abstraction
 * - Polymorphism
 * - Method Overriding
 * - Encapsulation
 * - Object Interaction
 * - Open/Closed Principle
 *
 * ------------------------------------------------------------
 */


/**
 * Represents an employee.
 *
 * Responsibility:
 * Store employee information.
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
                    "Invalid employee ID. Default value assigned."
            );
        }

        if (name != null && !name.isBlank()) {

            this.name = name;

        } else {

            this.name = "Unknown";

            System.out.println(
                    "Invalid name. Default value assigned."
            );
        }

        if (salary > 0) {

            this.salary = salary;

        } else {

            this.salary = 0;

            System.out.println(
                    "Invalid salary. Default value assigned."
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
 * Defines the contract for salary calculation.
 *
 * New salary calculation rules can be added by implementing
 * this interface without modifying existing classes.
 */
interface SalaryCalculator {

    /**
     * Calculates salary according to a specific rule.
     *
     * @param employee employee whose salary is calculated
     * @return calculated salary
     */
    double calculate(Employee employee);
}


/**
 * Calculates salary for a full-time employee.
 */
class FullTimeSalaryCalculator
        implements SalaryCalculator {

    @Override
    public double calculate(Employee employee) {

        validateEmployee(employee);

        return employee.getSalary() * 12;
    }

    private void validateEmployee(Employee employee) {

        if (employee == null) {
            throw new IllegalArgumentException(
                    "Employee cannot be null."
            );
        }
    }
}


/**
 * Calculates salary for a contract employee.
 */
class ContractSalaryCalculator
        implements SalaryCalculator {

    @Override
    public double calculate(Employee employee) {

        validateEmployee(employee);

        return employee.getSalary() * 6;
    }

    private void validateEmployee(Employee employee) {

        if (employee == null) {
            throw new IllegalArgumentException(
                    "Employee cannot be null."
            );
        }
    }
}


/**
 * Calculates salary for an intern.
 */
class InternSalaryCalculator
        implements SalaryCalculator {

    @Override
    public double calculate(Employee employee) {

        validateEmployee(employee);

        return employee.getSalary() * 3;
    }

    private void validateEmployee(Employee employee) {

        if (employee == null) {
            throw new IllegalArgumentException(
                    "Employee cannot be null."
            );
        }
    }
}


/**
 * Processes salary calculations using the SalaryCalculator
 * abstraction.
 *
 * This class does not depend on a specific salary type.
 */
class SalaryProcessor {

    private final SalaryCalculator calculator;

    /**
     * Creates a SalaryProcessor.
     *
     * @param calculator salary calculation strategy
     */
    public SalaryProcessor(SalaryCalculator calculator) {

        if (calculator == null) {

            throw new IllegalArgumentException(
                    "Salary calculator cannot be null."
            );
        }

        this.calculator = calculator;
    }

    /**
     * Processes salary calculation.
     *
     * @param employee employee whose salary is calculated
     * @return calculated salary
     */
    public double process(Employee employee) {

        if (employee == null) {

            throw new IllegalArgumentException(
                    "Employee cannot be null."
            );
        }

        return calculator.calculate(employee);
    }
}


/**
 * Displays employee information.
 */
class EmployeePrinter {

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
 * Demonstrates the Open/Closed Principle.
 */
public class EmployeeSalaryOCPDemo {

    public static void main(String[] args) {

        Employee employee =
                new Employee(
                        "E101",
                        "Aradhya",
                        50000.0
                );

        // Different implementations of SalaryCalculator
        SalaryCalculator fullTime =
                new FullTimeSalaryCalculator();

        SalaryCalculator contract =
                new ContractSalaryCalculator();

        SalaryCalculator intern =
                new InternSalaryCalculator();

        // Process each salary calculation
        SalaryProcessor fullTimeProcessor =
                new SalaryProcessor(fullTime);

        SalaryProcessor contractProcessor =
                new SalaryProcessor(contract);

        SalaryProcessor internProcessor =
                new SalaryProcessor(intern);

        // Display employee information
        EmployeePrinter printer =
                new EmployeePrinter();

        printer.printEmployee(employee);

        // Calculate salaries
        System.out.printf(
                "Full Time Annual Salary : ₹%,.2f%n",
                fullTimeProcessor.process(employee)
        );

        System.out.printf(
                "Contract Salary          : ₹%,.2f%n",
                contractProcessor.process(employee)
        );

        System.out.printf(
                "Intern Salary            : ₹%,.2f%n",
                internProcessor.process(employee)
        );
    }
}

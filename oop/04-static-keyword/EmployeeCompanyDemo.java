package oop.statickeyword;
/**
 * ------------------------------------------------------------
 * Program Name : EmployeeCompanyDemo
 * Topic        : Static Variables and Static Methods
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of static
 * variables and static methods in Java.
 *
 * Every Employee object has its own name and
 * salary, while the company name is shared
 * among all employees using a static constant.
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Static Variable
 * - Static Method
 * - Getter Methods
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */
class Employee {

    // Instance variables
    private String name;
    private double salary;

    // Class variable
    private static final String COMPANY = "OpenAI Technologies";

    /**
     * Constructs an Employee object.
     *
     * @param name   Employee name
     * @param salary Employee salary
     */
    Employee(String name, double salary) {

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
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static String getCompany() {
        return COMPANY;
    }

    // Instance method
    public void displayEmployee() {

        System.out.println("----- Employee Details -----");
        System.out.println("Name    : " + name);
        System.out.printf("Salary  : ₹%.2f%n", salary);
        System.out.println();
    }

    // Static method
    public static void displayCompany() {

        System.out.println("Company : " + COMPANY);
    }
}

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Dhirendra Thakur", 450_000.00);
        Employee e2 = new Employee("Yasir Khan", 700_000.00);

        e1.displayEmployee();
        e2.displayEmployee();

        Employee.displayCompany();
    }
}

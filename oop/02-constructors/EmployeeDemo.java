package oops.constructors;
/**
 * ------------------------------------------------------------
 * Class Name : Employee
 * Topic      : Constructors in Java
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - default constructor
 * - automatic initialization
 * - instance variables
 * - object methods
 * ------------------------------------------------------------
 */

class Employee {

    String name;
    double salary;
    String department;

    /**
     * Default constructor.
     * Automatically runs during object creation.
     */
    Employee() {

        System.out.println("Constructor called.");

        name = "Unknown";
        salary = 0;
        department = "Not Assigned";
    }

    /**
     * Displays employee details.
     */
    void displayEmployee() {

        System.out.println("Name       : " + name);
        System.out.println("Salary     : ₹" + salary);
        System.out.println("Department : " + department);

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object creation
        Employee e1 = new Employee();

        // Display details
        e1.displayEmployee();
    }
}

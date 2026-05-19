package oops.classobject;

/**
 * ------------------------------------------------------------
 * Program Name : EmployeeDemo
 * Topic        : Class and Object (OOP Basics)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - class creation
 * - object creation
 * - instance variables
 * - object methods
 * - independent object state
 *
 * Multiple Employee objects are created
 * to show that each object stores
 * its own separate data.
 *
 * Concepts Used:
 * - classes
 * - objects
 * - instance variables
 * - methods
 * - dot operator
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Employee {

    // 🔹 Instance variables
    String name;

    int salary;

    /**
     * Displays employee details.
     */
    void displayEmployee() {

        System.out.println("Name   : " + name);

        System.out.println("Salary : ₹" + salary);

        System.out.println();
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        // 🔹 Object creation
        Employee e1 = new Employee();

        Employee e2 = new Employee();

        Employee e3 = new Employee();

        // 🔹 Assign values to object 1
        e1.name = "Sankar";
        e1.salary = 50000;

        // 🔹 Assign values to object 2
        e2.name = "Yasir";
        e2.salary = 70000;

        // 🔹 Assign values to object 3
        e3.name = "Imran";
        e3.salary = 400000;

        // 🔹 Display details
        e1.displayEmployee();

        e2.displayEmployee();

        e3.displayEmployee();
    }
}

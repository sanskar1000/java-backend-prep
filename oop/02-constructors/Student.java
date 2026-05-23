package oops.constructors;
/**
 * ------------------------------------------------------------
 * Class Name : Student
 * Topic      : Constructors in Java
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - default constructor
 * - object initialization
 * - multiple objects
 * - instance variables
 * - object methods
 * ------------------------------------------------------------
 */

class Student {

    String name;
    int rollNumber;
    int marks;

    /**
     * Default constructor.
     * Automatically initializes object values.
     */
    Student() {

        System.out.println("Constructor called");

        name = "Unknown";
        rollNumber = 0;
        marks = 0;
    }

    /**
     * Displays student details.
     */
    void displayStudent() {

        System.out.println("----- Student Details -----");

        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();
        Student s2 = new Student();

        // Display details
        s1.displayStudent();
        s2.displayStudent();
    }
}

package oops.constructors;
/**
 * ------------------------------------------------------------
 * Class Name : Students
 * Topic      : Parameterized Constructor
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - parameterized constructors
 * - object initialization
 * - multiple objects
 * - instance variables
 * - object methods
 * ------------------------------------------------------------
 */

class Students {

    String name;
    int rollNumber;
    int marks;

    /**
     * Parameterized constructor.
     *
     * @param n student name
     * @param r roll number
     * @param m student marks
     */
    Students(String n, int r, int m) {

        name = n;
        rollNumber = r;
        marks = m;
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
        Students s1 = new Students("Aradhya", 101, 95);

        Students s2 = new Students("Rahul", 102, 88);

        // Display details
        s1.displayStudent();

        s2.displayStudent();
    }
}

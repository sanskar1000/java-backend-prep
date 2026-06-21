package oops.classobject;
/**
 * ------------------------------------------------------------
 * Program Name : StudentClassDemo
 * Topic        : Object-Oriented Programming (Class & Object)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic concept of Class and Object in Java.
 *
 * • A class is a blueprint for creating objects.
 * • An object is an instance of a class representing a real-world entity.
 *
 * In this program:
 * • A Student class is defined with attributes (id, name, marks)
 * • A constructor is used to initialize object data
 * • A method is used to display student details
 *
 * Example:
 * Output:
 * Student ID   : 101
 * Student Name : Aradhya
 * Marks        : 88.5
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Class representing a Student entity
 */
class Student {

    // ------------------------------------------------------------
    // Fields (Instance Variables)
    // ------------------------------------------------------------
    int id;         // Unique student ID
    String name;    // Student name
    double marks;   // Marks obtained

    // ------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------

    /**
     * Parameterized constructor to initialize Student object
     *
     * @param id    unique identifier of the student
     * @param name  name of the student
     * @param marks marks obtained by the student
     */
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // ------------------------------------------------------------
    // Method
    // ------------------------------------------------------------

    /**
     * Displays the details of the student
     */
    void displayDetails() {
        System.out.println("Student ID   : " + id);
        System.out.println("Student Name : " + name);
        System.out.println("Marks        : " + marks);
    }
}

/**
 * Main class to demonstrate object creation and method calling
 */
public class StudentClassDemo {

    public static void main(String[] args) {

        // ------------------------------------------------------------
        // Object Creation
        // ------------------------------------------------------------

        Student s1 = new Student(101, "Aradhya", 88.5);

        // ------------------------------------------------------------
        // Method Call
        // ------------------------------------------------------------

        s1.displayDetails();
    }
}

package oops.practice
/**
 * ------------------------------------------------------------
 * Program Name : StudentManagementSystem
 * Topic        : Constructor Overloading & Constructor Chaining
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 *
 * - default constructor
 * - parameterized constructor
 * - constructor overloading
 * - constructor chaining using this()
 * - object initialization
 * - instance variables
 * - validation methods
 * - object behavior
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - this keyword
 * - Method creation
 * - Object state management
 * - Validation logic
 *
 * ------------------------------------------------------------
 */

class Student {
    
    // Instance Variables
    String name;
    int rollNumber;
    String course;
    double marks;

    /**
     * Default Constructor
     */
    Student() {

        this("Unknown", 0, "Unknown", 0.0);
    }

    /**
     * One Parameter Constructor
     *
     * @param name student name
     */
    Student(String name) {

        this(name, 0, "Unknown", 0.0);
    }

    /**
     * Main Parameterized Constructor
     *
     * @param name student name
     * @param rollNumber student roll number
     * @param course student course
     * @param marks student marks
     */
    Student(String name,
            int rollNumber,
            String course,
            double marks) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            this.marks = 0.0;
        }
    }

    /**
     * Displays student details.
     */
    void displayStudentDetails() {

        System.out.println("Name        : " + name);

        System.out.println("Roll Number : " + rollNumber);

        System.out.println("Course      : " + course);

        System.out.printf("Marks       : %.1f%n", marks);

        if (marks >= 40) {
            System.out.println("Result      : PASS");
        } else {
            System.out.println("Result      : FAIL");
        }

        System.out.println();
    }

    /**
     * Updates student marks.
     *
     * @param marks updated marks
     */
    void updateMarks(double marks) {

        if (marks >= 0 && marks <= 100) {

            this.marks = marks;

            System.out.println("Marks updated successfully.");

        } else {

            System.out.println("Invalid marks.");
        }

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        // Object using one parameter constructor
        Student s2 = new Student("Chandan");

        // Object using parameterized constructor
        Student s3 =
                new Student(
                        "Aradhya",
                        18,
                        "Java",
                        87.8
                );

        System.out.println(
                "----- Student 1 -----"
        );

        s1.displayStudentDetails();

        System.out.println(
                "----- Student 2 -----"
        );

        s2.displayStudentDetails();

        System.out.println(
                "----- Student 3 -----"
        );

        s3.displayStudentDetails();

        // Updating marks
        System.out.println(
                "Updating Marks..."
        );

        System.out.println();

        s3.updateMarks(95);

        s3.displayStudentDetails();
    }

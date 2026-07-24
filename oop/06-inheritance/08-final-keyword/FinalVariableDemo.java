/**
 * ------------------------------------------------------------
 * Program Name : FinalKeywordDemo
 * Topic        : Final Keyword in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of the final keyword in Java.
 *
 * The program shows:
 * - Final local variables
 * - Final object references
 * - Object mutability through a final reference
 *
 * A final variable cannot be reassigned once initialized.
 * However, if a final variable stores an object reference,
 * the object's state can still be modified.
 *
 * Concepts Covered:
 * - final Keyword
 * - Final Variables
 * - Final Object References
 * - Encapsulation
 * - Getters and Setters
 * - Constructor Validation
 *
 * Expected Output:
 *
 * Institute Name : Indian Institutes of Technology
 * Maximum Students : 100
 *
 * ----- Student Details -----
 * Name   : Yasir
 * Course : Java
 *
 * ----- Student Details -----
 * Name   : Yasir
 * Course : Java Backend Developer
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Represents a student.
 */
class Student {

    /** Student name */
    private String name;

    /** Student course */
    private String course;

    /**
     * Constructs a Student object.
     *
     * @param name   Student name
     * @param course Student course
     */
    Student(String name, String course) {

        if (name != null && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Unknown";
            System.out.println("Invalid name. Default value assigned.");
        }

        if (course != null && !course.isBlank()) {
            this.course = course;
        } else {
            this.course = "Unknown";
            System.out.println("Invalid course. Default value assigned.");
        }
    }

    /**
     * Returns the student's name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the student's course.
     *
     * @return student course
     */
    public String getCourse() {
        return course;
    }

    /**
     * Updates the student's course.
     *
     * @param course new course
     */
    public void setCourse(String course) {

        if (course != null && !course.isBlank()) {
            this.course = course;
        } else {
            System.out.println("Invalid course.");
        }
    }

    /**
     * Displays student details.
     */
    public void displayStudentDetails() {

        System.out.println("----- Student Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Course : " + course);
        System.out.println();
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * Demonstrates:
     * - final local variables
     * - final object references
     * - modifying an object's state through a final reference
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Final constant
        final String INSTITUTE_NAME = "Indian Institutes of Technology";

        // Final constant
        final int MAX_STUDENTS = 100;

        System.out.println("Institute Name : " + INSTITUTE_NAME);
        System.out.println("Maximum Students : " + MAX_STUDENTS);
        System.out.println();

        // Final object reference
        final Student s1 = new Student("Yasir", "Java");

        // Not allowed:
        // s1 = new Student("Aradhya", "Python");
        // Compile-time Error:
        // Cannot assign a value to final variable 's1'

        s1.displayStudentDetails();

        // Allowed because the object itself is mutable.
        s1.setCourse("Java Backend Developer");

        s1.displayStudentDetails();
    }
}

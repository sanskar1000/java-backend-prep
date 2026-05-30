package oops.practice;

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
 * - validation methods
 * - object behavior
 * - object comparison
 * - object-to-object interaction
 * - average marks calculation
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Constructor Chaining
 * - this keyword
 * - Instance Variables
 * - Methods
 * - Validation Logic
 * - Object Communication
 * - Reference Variables
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Student {

    // Constant
    static final int PASS_MARKS = 40;

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
     * @param name       student name
     * @param rollNumber student roll number
     * @param course     student course
     * @param marks      student marks
     */
    Student(String name,
            int rollNumber,
            String course,
            double marks) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;

        // Validation
        if (marks >= 0 && marks <= 100) {

            this.marks = marks;

        } else {

            System.out.println(
                    "Invalid marks entered. Default marks assigned."
            );

            this.marks = 0.0;
        }
    }

    /**
     * Displays student details.
     */
    void displayStudentDetails() {

        System.out.println(
                "----- Student Details -----"
        );

        System.out.println(
                "Name        : " + name
        );

        System.out.println(
                "Roll Number : " + rollNumber
        );

        System.out.println(
                "Course      : " + course
        );

        System.out.printf(
                "Marks       : %.1f%n",
                marks
        );

        if (marks >= PASS_MARKS) {

            System.out.println(
                    "Result      : PASS"
            );

        } else {

            System.out.println(
                    "Result      : FAIL"
            );
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

            System.out.println(
                    "Marks updated successfully."
            );

        } else {

            System.out.println(
                    "Invalid marks."
            );
        }

        System.out.println();
    }

    /**
     * Compares marks between two students.
     *
     * @param other another student object
     */
    void compareMarks(Student other) {

        if (this.marks > other.marks) {

            System.out.println(
                    this.name +
                            " has higher marks than " +
                            other.name
            );

        } else if (this.marks < other.marks) {

            System.out.println(
                    other.name +
                            " has higher marks than " +
                            this.name
            );

        } else {

            System.out.println(
                    this.name +
                            " and " +
                            other.name +
                            " have equal marks"
            );
        }

        System.out.println();
    }

    /**
     * Calculates average marks
     * between two students.
     *
     * @param other another student object
     * @return average marks
     */
    double calculateAverage(Student other) {

        return (this.marks + other.marks) / 2.0;
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

        // Display Student 1
        System.out.println(
                "===== Student 1 ====="
        );

        s1.displayStudentDetails();

        // Display Student 2
        System.out.println(
                "===== Student 2 ====="
        );

        s2.displayStudentDetails();

        // Display Student 3
        System.out.println(
                "===== Student 3 ====="
        );

        s3.displayStudentDetails();

        // Update marks of Student 2
        System.out.println(
                "Updating Marks of Student 2..."
        );

        System.out.println();

        s2.updateMarks(70.7);

        s2.displayStudentDetails();

        // Update marks of Student 3
        System.out.println(
                "Updating Marks of Student 3..."
        );

        System.out.println();

        s3.updateMarks(95);

        s3.displayStudentDetails();

        // Compare marks
        System.out.println(
                "===== Marks Comparison ====="
        );

        s2.compareMarks(s3);

        // Calculate average
        System.out.println(
                "===== Average Marks ====="
        );

        double avg = s2.calculateAverage(s3);

        System.out.printf(
                "Average of %s and %s : %.2f%n",
                s2.name,
                s3.name,
                avg
        );
    }
}

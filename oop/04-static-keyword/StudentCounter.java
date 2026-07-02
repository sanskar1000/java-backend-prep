package oop.statickeyword;
/**
 * ------------------------------------------------------------
 * Program Name : StudentCounter
 * Topic        : Static Keyword in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of the
 * static keyword in Java.
 *
 * A static variable belongs to the class
 * instead of individual objects. Here,
 * studentCount keeps track of the total
 * number of Student objects created.
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Static Variables
 * - Instance Methods
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Student {

    // Instance variable
    private String name;

    // Static variable shared by all objects
    private static int studentCount = 0;

    /**
     * Parameterized constructor.
     *
     * @param name student name
     */
    Student(String name) {

        this.name = name;
        studentCount++;
    }

    /**
     * Displays student details.
     */
    void displayStudent() {

        System.out.println("Student Name : " + name);
    }

    /**
     * Returns total number of students.
     *
     * @return student count
     */
    static int getStudentCount() {

        return studentCount;
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Aradhya");
        Student s2 = new Student("Yasir");
        Student s3 = new Student("Rahul");

        s1.displayStudent();
        s2.displayStudent();
        s3.displayStudent();

        System.out.println();

        System.out.println(
                "Total Students : "
                        + Student.getStudentCount()
        );
    }
}

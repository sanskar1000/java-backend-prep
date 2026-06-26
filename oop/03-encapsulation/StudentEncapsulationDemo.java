package oops.encapsulation;
/**
 * ------------------------------------------------------------
 * Program Name : StudentEncapsulationDemo
 * Topic        : Encapsulation using Getters and Setters
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 *
 * - Encapsulation
 * - Private instance variables
 * - Constructor initialization
 * - Getter methods
 * - Setter methods
 * - Validation logic
 *
 * Concepts Used:
 * - Classes and Objects
 * - Constructors
 * - Encapsulation
 * - Getters and Setters
 * - Data Validation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Student {

    // Private instance variables
    private String name;
    private int marks;

    /**
     * Parameterized constructor.
     *
     * @param name student name
     * @param marks student marks
     */
    Student(
            String name,
            int marks
    ) {

        this.name = name;
        setMarks(marks);
    }

    /**
     * Returns student name.
     *
     * @return student name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns student marks.
     *
     * @return student marks
     */
    public int getMarks() {
        return marks;
    }

    /**
     * Updates student marks.
     *
     * Marks must be between 0 and 100.
     *
     * @param marks new marks
     */
    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println(
                    "Invalid marks. Marks must be between 0 and 100."
            );
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 =
                new Student(
                        "Yasir",
                        58
                );

        s1.setMarks(89);

        System.out.println(
                "Student : " +
                s1.getName()
        );

        System.out.println(
                "Marks : " +
                s1.getMarks()
        );
    }
}

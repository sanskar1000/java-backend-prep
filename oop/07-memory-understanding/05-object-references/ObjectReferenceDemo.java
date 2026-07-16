package memory.objectreferences;

/**
 * ------------------------------------------------------------
 * Program Name : ObjectReferenceDemo
 * Topic        : Object References in Java
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates:
 * - object creation
 * - reference variables
 * - reference assignment
 * - object aliasing
 * - shared object state
 *
 * Concepts Used:
 * - class
 * - object
 * - heap memory
 * - stack memory
 * - reference variables
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Student {

    String name;

    void display() {
        System.out.println("Student Name : " + name);
    }
}

public class ObjectReferenceDemo {

    public static void main(String[] args) {

        // Object creation
        Student s1 = new Student();

        // Assign value
        s1.name = "Aradhya";

        // Reference assignment
        Student s2 = s1;

        System.out.println("Before Modification:");
        s1.display();
        s2.display();

        // Modify object using second reference
        s2.name = "Yasir";

        System.out.println("\nAfter Modification:");
        s1.display();
        s2.display();

        System.out.println("\nReference Comparison:");
        System.out.println("s1 == s2 : " + (s1 == s2));
    }
}

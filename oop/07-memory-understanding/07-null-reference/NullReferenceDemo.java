package memory.nullreference;

/**
 * ------------------------------------------------------------
 * Program Name : NullReferenceDemo
 * Topic        : Null Reference in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates:
 * - null reference
 * - checking for null
 * - preventing NullPointerException
 * ------------------------------------------------------------
 */

class Student {

    String name = "Aradhya";
}

public class NullReferenceDemo {

    public static void main(String[] args) {

        // Reference initialized with null
        Student s = null;

        // Print the reference
        System.out.println("Student Reference : " + s);

        // Safe null check
        if (s == null) {
            System.out.println("Student object has not been created.");
        } else {
            System.out.println("Student Name : " + s.name);
        }
    }
}

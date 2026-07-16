/**
 * ------------------------------------------------------------
 * Program Name : GarbageCollectionDemo
 * Topic        : Garbage Collection in Java
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates:
 * - Object creation
 * - Reference reassignment
 * - Object eligibility for Garbage Collection
 * - System.gc() request
 * ------------------------------------------------------------
 */

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        // Creating two objects
        Student s1 = new Student("Aradhya");
        Student s2 = new Student("Rahul");

        // Object referenced by s1 becomes unreachable
        s1 = s2;

        // Request Garbage Collection
        System.gc();

        System.out.println("Garbage Collection Requested.");
    }
}

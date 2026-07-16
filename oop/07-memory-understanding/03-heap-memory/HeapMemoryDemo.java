package memory.heap;

/**
 * ------------------------------------------------------------
 * Program Name : HeapMemoryDemo
 * Topic        : Heap Memory in Java
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates how objects are created in Heap Memory
 * and how reference variables stored in Stack Memory
 * point to those objects.
 *
 * Concepts Used:
 * - Heap Memory
 * - Stack Memory
 * - Object Creation
 * - Reference Variables
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void displayStudent() {
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
        System.out.println();
    }
}

public class HeapMemoryDemo {

    public static void main(String[] args) {

        // Reference variable stored in Stack
        // Student object created in Heap
        Student s1 = new Student("Aradhya", 95);

        // Another reference and another Heap object
        Student s2 = new Student("Yasir", 88);

        s1.displayStudent();
        s2.displayStudent();
    }
}

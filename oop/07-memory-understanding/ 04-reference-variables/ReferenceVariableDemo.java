package memory.referencevariables;

/**
 * ------------------------------------------------------------
 * Program Name : ReferenceVariableDemo
 * Topic        : Reference Variables
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates:
 * - object creation
 * - reference variables
 * - stack memory
 * - heap memory
 * - accessing object using a reference
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Student {

    String name;
    int marks;

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Marks : " + marks);
    }
}

public class ReferenceVariableDemo {

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Aradhya";
        s.marks = 95;

        s.display();
    }
}

package memory.objectcreationprocess;

/**
 * ------------------------------------------------------------
 * Program Name : ObjectCreationProcessDemo
 * Topic        : Object Creation Process in Java
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the complete object creation process:
 * 1. Class Loading
 * 2. Static Variable Initialization
 * 3. Static Block Execution
 * 4. Heap Memory Allocation
 * 5. Default Initialization
 * 6. Instance Variable Initialization
 * 7. Instance Initializer Block Execution
 * 8. Constructor Execution
 * 9. Reference Returned
 * 10. Reference Assigned
 * ------------------------------------------------------------
 */

class Student {

    // Static variable
    static String schoolName = "OpenAI Public School";

    // Static block
    static {
        System.out.println("1. Static Block Executed");
    }

    // Instance variable initialization
    String name = initializeName();

    // Instance initializer block
    {
        System.out.println("3. Instance Initializer Block Executed");
    }

    // Constructor
    Student() {
        System.out.println("4. Constructor Executed");
    }

    // Helper method for field initialization
    private String initializeName() {
        System.out.println("2. Instance Variable Initialized");
        return "Aradhya";
    }
}

public class ObjectCreationProcessDemo {

    public static void main(String[] args) {

        System.out.println("Creating First Object...\n");

        Student s1 = new Student();

        System.out.println("\nReference assigned to s1");

        System.out.println("\n----------------------------\n");

        System.out.println("Creating Second Object...\n");

        Student s2 = new Student();

        System.out.println("\nReference assigned to s2");
    }
}

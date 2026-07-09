package oop.statickeywords;

/**
 * ------------------------------------------------------------
 * Program Name : LibraryDemo
 * Topic        : Static Block in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the execution order
 * of static variables, static blocks,
 * constructors, and the main() method.
 *
 * Concepts Covered:
 * - Static Variable
 * - Static Block
 * - Constructor
 * - Class Loading
 * - Object Creation
 *
 * Execution Order:
 * 1. Static variable initialization
 * 2. Static block execution (only once)
 * 3. main() method execution
 * 4. Constructor execution (for each object)
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Library {

    // Shared by all Library objects
    static String libraryName = "Central Library";

    /*
     * Static block executes only once
     * when the class is loaded into memory.
     */
    static {

        System.out.println("========================================");
        System.out.println("Loading Library Class...");
        System.out.println("Library Management System Starting...");
        System.out.println("Library Name : " + libraryName);
        System.out.println("Library Initialized Successfully.");
        System.out.println("========================================\n");
    }

    /**
     * Constructor
     * Executes every time an object is created.
     */
    Library() {

        System.out.println("New Library Object Created.");
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        System.out.println("Main Method Started\n");

        Library library1 = new Library();
        Library library2 = new Library();
        Library library3 = new Library();

        System.out.println();

        System.out.println("Total Objects Created : 3");
        System.out.println("Library Name : " + Library.libraryName);
    }
}

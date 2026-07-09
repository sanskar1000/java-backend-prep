package oops.statickeyword;

/**
 * ------------------------------------------------------------
 * Program Name : MobileDemo
 * Topic        : Instance Initialization Block (IIB)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the execution order of:
 * - Static Variable
 * - Static Block
 * - Instance Initialization Block
 * - Constructor
 *
 * Concepts Covered:
 * - Static Variable
 * - Static Block
 * - Instance Initialization Block (IIB)
 * - Constructor
 * - Object Creation
 *
 * Execution Order:
 * 1. Static variable initialization
 * 2. Static block execution (once)
 * 3. main() method execution
 * 4. Instance Initialization Block (every object)
 * 5. Constructor execution (every object)
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class Mobile {

    // Shared by all objects
    static String company = "Samsung";

    /*
     * Executes only once when the class
     * is loaded into memory.
     */
    static {
        System.out.println("Loading Mobile Class...");
    }

    // Instance variable
    String model = "Unknown";

    /*
     * Executes before the constructor
     * whenever an object is created.
     */
    {
        System.out.println("Initializing Mobile Object...");
    }

    /**
     * Default Constructor
     */
    Mobile() {

        System.out.println("Constructor Executed.");
        System.out.println("Model : " + model);
        System.out.println();
    }
}

public class MobileDemo {

    public static void main(String[] args) {

        System.out.println("Main Method Started\n");

        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();

        System.out.println("Company : " + Mobile.company);
    }
}

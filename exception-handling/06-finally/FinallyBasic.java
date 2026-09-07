/**
 * ------------------------------------------------------------
 * Program Name : FinallyBasic
 * Topic        : finally Block
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic use of the finally
 * block in Java exception handling.
 *
 * The try block executes normally without producing an
 * exception. Therefore, the catch block is skipped.
 *
 * The finally block executes after the try-catch structure,
 * demonstrating that finally is used for code that should
 * execute regardless of whether an exception occurs.
 *
 * Concepts Used:
 * - try block
 * - catch block
 * - finally block
 * - ArithmeticException
 * - Exception handling
 * - Program flow
 *
 * Expected Output:
 * Try executed
 * Finally executed
 * Program finished
 *
 * ------------------------------------------------------------
 */

public class FinallyBasic {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        try {

            // Try block executes normally
            System.out.println("Try executed");

        } catch (ArithmeticException e) {

            // This block is skipped because no exception occurs
            System.out.println("Exception");

        } finally {

            // Finally executes whether an exception occurs or not
            System.out.println("Finally executed");
        }

        // Executes after the finally block
        System.out.println("Program finished");
    }
}

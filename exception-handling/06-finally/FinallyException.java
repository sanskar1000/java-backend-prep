/**
 * ------------------------------------------------------------
 * Program Name : FinallyException
 * Topic        : try-catch-finally
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the execution flow of a
 * try-catch-finally structure when an exception occurs.
 *
 * The program intentionally performs division by zero,
 * which causes an ArithmeticException.
 *
 * The exception is handled by the catch block, and the
 * finally block executes afterward.
 *
 * The program then continues normally after the
 * try-catch-finally structure.
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
 * Exception occurred
 * Exception handled
 * Finally executed
 * Program finished
 *
 * ------------------------------------------------------------
 */

public class FinallyException.java {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        try {

            // Division by zero causes ArithmeticException
            int result = 100 / 0;

            // This line is skipped because the exception
            // occurs on the previous line
            System.out.println(result);

        } catch (ArithmeticException e) {

            // Handle the arithmetic exception
            System.out.println("Exception occurred");

        } finally {

            // Finally executes after try-catch
            // whether an exception occurs or not
            System.out.println("Exception handled");
            System.out.println("Finally executed");
        }

        // Program continues after finally
        System.out.println("Program finished");
    }
}

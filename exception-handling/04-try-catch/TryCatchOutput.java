/**
 * ------------------------------------------------------------
 * Program Name : TryCatchOutput
 * Topic        : Exception Handling - Program Flow
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the flow of execution when an
 * exception occurs inside a try block.
 *
 * The program intentionally performs division by zero,
 * which causes an ArithmeticException.
 *
 * When the exception occurs, the remaining statements inside
 * the try block are skipped, and execution moves directly
 * to the matching catch block.
 *
 * Concepts Used:
 * - try-catch
 * - ArithmeticException
 * - Exception flow
 * - Program control flow
 * - Skipping statements after an exception
 *
 * Expected Output:
 * Start
 * Inside try
 * Exception caught
 * End
 *
 * ------------------------------------------------------------
 */

public class TryCatchOutput {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Executes before entering the try block
        System.out.println("Start");

        try {

            // Executes normally
            System.out.println("Inside try");

            // Causes ArithmeticException
            int x = 10 / 0;

            // This statement is skipped because
            // an exception occurred on the previous line
            System.out.println("After division");

        } catch (ArithmeticException e) {

            // Handles the division-by-zero exception
            System.out.println("Exception caught");
        }

        // Executes after the try-catch block
        System.out.println("End");
    }
}

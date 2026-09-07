/**
 * ------------------------------------------------------------
 * Program Name : FinallyUncaught
 * Topic        : Uncaught Exception with finally
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates that the finally block executes
 * even when an exception is not caught.
 *
 * The program intentionally performs division by zero,
 * which causes an ArithmeticException.
 *
 * There is no catch block to handle the exception.
 * However, the finally block still executes before the
 * uncaught exception terminates the program.
 *
 * The statement after the try-finally structure does not
 * execute because the exception remains uncaught.
 *
 * Concepts Used:
 * - try block
 * - finally block
 * - Uncaught exception
 * - ArithmeticException
 * - Exception propagation
 * - Program termination
 *
 * Expected Behavior:
 * Cleanup completed
 * ArithmeticException stack trace
 *
 * "Program finished" is NOT printed.
 *
 * ------------------------------------------------------------
 */

public class FinallyUncaught {

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

        } finally {

            // Finally executes even though there is
            // no catch block
            System.out.println("Cleanup completed");
        }

        // This line is never reached because the
        // ArithmeticException remains uncaught
        System.out.println("Program finished");
    }
}

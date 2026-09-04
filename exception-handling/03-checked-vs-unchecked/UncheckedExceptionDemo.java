/**
 * ------------------------------------------------------------
 * Program Name : UncheckedExceptionDemo
 * Topic        : Unchecked Exceptions
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates how Java handles an unchecked exception
 * using a try-catch block.
 *
 * The program attempts to divide an integer by zero,
 * which causes an ArithmeticException.
 *
 * The exception is handled, allowing the program to
 * continue executing normally.
 *
 * Concepts Used:
 * - Unchecked Exception
 * - RuntimeException
 * - ArithmeticException
 * - try-catch
 * - Program continuation
 *
 * ------------------------------------------------------------
 */

public class UncheckedExceptionDemo {

    public static void main(String[] args) {

        try {

            // Integer division by zero causes ArithmeticException
            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            // Handle the unchecked exception
            System.out.println("Cannot divide by zero");

        }

        // Execution continues after the exception is handled
        System.out.println("Program continues");
    }
}

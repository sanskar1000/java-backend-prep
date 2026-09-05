import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TryCatchPractice
 * Topic        : Exception Handling - try-catch
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how to handle an
 * ArithmeticException using a try-catch block.
 *
 * The user enters two integers, and the program
 * performs integer division.
 *
 * If the second number is zero, Java throws an
 * ArithmeticException. The exception is caught and
 * handled using the catch block.
 *
 * The program then continues its execution normally.
 *
 * Concepts Used:
 * - Scanner
 * - User Input
 * - try-catch
 * - ArithmeticException
 * - Exception Object
 * - getMessage()
 * - Program Continuation
 *
 * Exception Handled:
 * - ArithmeticException
 *
 * ------------------------------------------------------------
 */

public class TryCatchPractice {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object for taking user input
        Scanner scanner = new Scanner(System.in);

        // Take the first number from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        // Take the second number from the user
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        try {

            // Perform integer division
            // If num2 is 0, ArithmeticException will occur
            int result = num1 / num2;

            // Display the division result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handle division by zero
            System.out.println("Cannot divide by zero.");

            // Display the exception message
            System.out.println("Exception message: " + e.getMessage());
        }

        // This statement executes after the exception is handled
        System.out.println("Program continues...");

        // Close the Scanner
        scanner.close();
    }
}

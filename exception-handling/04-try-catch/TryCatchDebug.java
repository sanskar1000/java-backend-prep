import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TryCatchDebug
 * Topic        : Debugging try-catch
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how to debug and correctly
 * structure a try-catch block.
 *
 * The program divides 100 by a number entered by the user.
 * If the user enters zero, an ArithmeticException occurs
 * and is handled by the catch block.
 *
 * The program also demonstrates that execution continues
 * after the exception has been handled.
 *
 * Concepts Used:
 * - Scanner
 * - try-catch
 * - ArithmeticException
 * - Exception Handling
 * - Debugging
 * - Program Flow
 *
 * ------------------------------------------------------------
 */

public class TryCatchDebug {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        try {

            // Attempt to divide 100 by the entered number
            // If number is 0, ArithmeticException occurs
            int result = 100 / number;

            // Display the result if no exception occurs
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handle division by zero
            System.out.println("Cannot divide by zero");
        }

        // Executes after try-catch completes
        System.out.println("Program continues");

        // Close Scanner
        scanner.close();
    }
}

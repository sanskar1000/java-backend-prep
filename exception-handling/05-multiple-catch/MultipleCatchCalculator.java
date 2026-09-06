import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MultipleCatchCalculator
 * Topic        : Multiple Exception Handling
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program implements a simple calculator using a switch
 * statement and demonstrates multiple catch blocks.
 *
 * The user enters two integers and selects an arithmetic
 * operation: +, -, *, or /.
 *
 * The program handles different types of exceptions separately:
 *
 * 1. ArithmeticException
 *    Occurs when division by zero is attempted.
 *
 * 2. IllegalArgumentException
 *    Occurs when an unsupported operation is entered.
 *
 * 3. Exception
 *    Handles unexpected exceptions such as invalid input.
 *
 * Concepts Used:
 * - Scanner
 * - User Input
 * - switch statement
 * - Arithmetic operations
 * - try-catch
 * - Multiple catch blocks
 * - ArithmeticException
 * - IllegalArgumentException
 * - Exception hierarchy
 *
 * ------------------------------------------------------------
 */

public class MultipleCatchCalculator {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        try {

            // Take first number
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            // Take second number
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Take arithmetic operation
            System.out.print("Enter operation (+, -, *, /): ");
            char operation = sc.next().charAt(0);

            // Perform the selected operation
            switch (operation) {

                case '+':

                    System.out.println(
                            "Sum: " + (num1 + num2)
                    );
                    break;

                case '-':

                    System.out.println(
                            "Difference: " + (num1 - num2)
                    );
                    break;

                case '*':

                    System.out.println(
                            "Multiplication: " + (num1 * num2)
                    );
                    break;

                case '/':

                    // Division by zero causes ArithmeticException
                    int result = num1 / num2;

                    System.out.println(
                            "Division: " + result
                    );
                    break;

                default:

                    // Handle unsupported operations
                    throw new IllegalArgumentException(
                            "Unsupported operation '" + operation + "'."
                    );
            }

        } catch (ArithmeticException e) {

            // Handles division by zero
            System.out.println(
                    "Arithmetic problem: Cannot divide by zero."
            );

        } catch (IllegalArgumentException e) {

            // Handles invalid operations
            System.out.println(
                    "Invalid operation: " + e.getMessage()
            );

        } catch (Exception e) {

            // Handles unexpected exceptions such as
            // invalid input entered through Scanner
            System.out.println(
                    "Unexpected problem: " + e.getMessage()
            );
        }

        // Executes after the exception handling
        System.out.println("Program continues.");

        // Close Scanner
        sc.close();
    }
}

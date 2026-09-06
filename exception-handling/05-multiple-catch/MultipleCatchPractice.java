import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MultipleCatchPractice
 * Topic        : Multiple Catch Blocks
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of multiple catch blocks
 * to handle different types of exceptions.
 *
 * The program contains an integer array and asks the user
 * to enter an index. If the index is outside the valid range,
 * an ArrayIndexOutOfBoundsException is thrown and handled.
 *
 * A general Exception catch block is also included to handle
 * any other unexpected exception.
 *
 * Concepts Used:
 * - Arrays
 * - Scanner
 * - try-catch
 * - Multiple catch blocks
 * - ArrayIndexOutOfBoundsException
 * - Exception hierarchy
 * - Exception handling
 *
 * ------------------------------------------------------------
 */

public class MultipleCatchPractice {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an integer array
        int[] arr = {1, 2, 3, 4, 5};

        // Ask the user to enter an array index
        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        try {

            // Access and display the array element
            System.out.println("Element: " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handles an invalid array index
            System.out.println("Invalid index.");

        } catch (Exception e) {

            // Handles any other unexpected exception
            System.out.println("Exception occurred.");
        }

        // Executes after the try-catch block
        System.out.println("Program continues.");

        // Close Scanner
        scanner.close();
    }
}

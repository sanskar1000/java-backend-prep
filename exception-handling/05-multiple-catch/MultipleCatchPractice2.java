/**
 * ------------------------------------------------------------
 * Program Name : MultipleCatchPractice2
 * Topic        : Multiple Exception Handling
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how different types of exceptions
 * can be handled separately using multiple try-catch blocks.
 *
 * The program demonstrates three common unchecked exceptions:
 *
 * 1. ArithmeticException
 *    Occurs when an arithmetic operation is invalid,
 *    such as integer division by zero.
 *
 * 2. ArrayIndexOutOfBoundsException
 *    Occurs when an array is accessed using an invalid index.
 *
 * 3. NullPointerException
 *    Occurs when an operation is performed on a null reference.
 *
 * Each exception is handled by its own specific catch block.
 *
 * Concepts Used:
 * - try-catch
 * - Multiple try-catch blocks
 * - ArithmeticException
 * - ArrayIndexOutOfBoundsException
 * - NullPointerException
 * - Unchecked Exceptions
 * - Exception Handling
 * - Program Flow
 *
 * ------------------------------------------------------------
 */

public class MultipleCatchPractice2 {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // -----------------------------------------------------
        // 1. ArithmeticException
        // -----------------------------------------------------

        try {

            // Division by zero causes ArithmeticException
            int result = 100 / 0;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handle division-by-zero exception
            System.out.println("Arithmetic problem.");
        }


        // -----------------------------------------------------
        // 2. ArrayIndexOutOfBoundsException
        // -----------------------------------------------------

        try {

            // Create an integer array
            int[] arr = {1, 2, 3};

            // Valid indexes are 0, 1 and 2.
            // Index 4 causes ArrayIndexOutOfBoundsException.
            System.out.println("Array element: " + arr[4]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handle invalid array index
            System.out.println("Array problem.");
        }


        // -----------------------------------------------------
        // 3. NullPointerException
        // -----------------------------------------------------

        try {

            // Create a null String reference
            String text = null;

            // Calling length() on null causes
            // NullPointerException.
            System.out.println("String length: " + text.length());

        } catch (NullPointerException e) {

            // Handle null reference exception
            System.out.println("Null problem.");
        }


        // -----------------------------------------------------
        // Program continues after all exceptions are handled
        // -----------------------------------------------------

        System.out.println("Program continues.");
    }
}

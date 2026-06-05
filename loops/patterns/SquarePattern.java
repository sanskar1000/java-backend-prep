
package loops.patterns;

/**
 * ------------------------------------------------------------
 * Program Name : SquarePattern
 * Topic        : Nested Loops
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a square star (*) pattern
 * using nested loops.
 *
 * Pattern Output:
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 *
 * Concepts Used:
 * - Nested Loops
 * - for loop
 * - Pattern Programming
 * - Rows and Columns
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SquarePattern {

    public static void main(String[] args) {

        // Number of rows and columns
        int size = 5;

        // Outer loop -> rows
        for (int i = 1; i <= size; i++) {

            // Inner loop -> columns
            for (int j = 1; j <= size; j++) {

                System.out.print("* ");
            }

            // Move to next line
            System.out.println();
        }
    }
}

package loops.patterns;

/**
 * ------------------------------------------------------------
 * Program Name : IncreasingNumberTriangle
 * Topic        : Pattern Printing (Numbers / Nested Loops)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a triangle pattern where each row
 * contains increasing numbers starting from 1 up to the
 * current row index.
 *
 * Example:
 * Input  : rows = 5
 * Output :
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 *
 * Logic:
 * - Outer loop controls the number of rows.
 * - Inner loop prints numbers from 1 to i for each row i.
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class IncreasingNumberTriangle {

    public static void main(String[] args) {

        // 🔹 Number of rows
        int rows = 5;

        // 🔹 Outer loop → handles rows
        for (int i = 1; i <= rows; i++) {

            // 🔹 Inner loop → prints numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // 🔹 Move to next line after each row
            System.out.println();
        }
    }
}

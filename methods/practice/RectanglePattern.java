package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : RectanglePattern
 * Topic        : Methods & Nested Loops
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a rectangular star (*) pattern
 * using rows and columns.
 *
 * Example Output (2 rows, 3 columns):
 * * * *
 * * * *
 *
 * Logic:
 * - Outer loop controls rows
 * - Inner loop controls columns
 *
 * Time Complexity  : O(rows × cols)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RectanglePattern {

    /**
     * Prints a rectangle star pattern.
     *
     * @param rows number of rows
     * @param cols number of columns
     */
    static void rectangle(int rows, int cols) {

        // 🔹 Validation
        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid dimensions");
            return;
        }

        // 🔹 Pattern printing
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        rectangle(2, 3);
    }
}

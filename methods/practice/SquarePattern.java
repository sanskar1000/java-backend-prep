package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : SquarePattern
 * Topic        : Methods
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a square star (*) pattern
 * using a user-defined method.
 *
 * Example Output (size = 5):
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 *
 * Logic:
 * - Outer loop controls rows
 * - Inner loop controls columns
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SquarePattern {

    /**
     * Prints a square pattern of given size.
     *
     * @param size number of rows and columns
     */
    static void printSquare(int size) {

        // 🔹 Input validation
        if (size <= 0) {
            System.out.println("Invalid size");
            return;
        }

        // 🔹 Pattern printing
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        printSquare(5);
    }
}

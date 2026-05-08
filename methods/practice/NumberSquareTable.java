package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : NumberSquareTable
 * Topic        : Methods & Loops
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a table containing numbers
 * and their squares.
 *
 * Example Output:
 * Number     Square
 * 1          1
 * 2          4
 * 3          9
 * 4          16
 * 5          25
 *
 * Logic:
 * - A separate method prints the table header
 * - A loop generates numbers and their squares
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class NumberSquareTable {

    /**
     * Prints the table header.
     */
    static void header() {
        System.out.printf("%-10s %-10s%n", "Number", "Square");
    }

    public static void main(String[] args) {

        // 🔹 Print heading
        header();

        // 🔹 Print numbers and squares
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%-10d %-10d%n", i, (i * i));
        }
    }
}

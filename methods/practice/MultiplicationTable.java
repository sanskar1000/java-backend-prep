package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : MultiplicationTable
 * Topic        : Methods & Loops
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints the multiplication table
 * of a given number using a method and loop.
 *
 * Example Output (n = 7):
 * 7 x 1 = 7
 * 7 x 2 = 14
 * ...
 * 7 x 10 = 70
 *
 * Logic:
 * - A loop runs from 1 to 10
 * - Each iteration multiplies the number by loop counter
 *
 * Time Complexity  : O(10) → O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MultiplicationTable {

    /**
     * Prints multiplication table of given number.
     *
     * @param n number whose table is printed
     */
    static void table(int n) {

        // 🔹 Validation
        if (n <= 0) {
            System.out.println("Invalid number");
            return;
        }

        // 🔹 Print multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", n, i, (n * i));
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        table(7);
    }
}

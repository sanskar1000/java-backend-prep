package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : MaximumOfThreeNumbers
 * Topic        : Methods & Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the largest
 * among three numbers using a method.
 *
 * Example:
 * Input  : 2, 3, 4
 * Output : Greater number : 4
 *
 * Logic:
 * - Compare all three numbers
 * - Return the maximum value
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MaximumOfThreeNumbers {

    /**
     * Returns the maximum among three integers.
     *
     * @param a first number
     * @param b second number
     * @param c third number
     * @return largest value
     */
    static int max(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;

        } else if (b >= a && b >= c) {
            return b;

        } else {
            return c;
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        int result = max(2, 3, 4);

        // 🔹 Output
        System.out.println("Greater number : " + result);
    }
}

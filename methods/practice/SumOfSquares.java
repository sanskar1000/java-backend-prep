package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : SumOfSquares
 * Topic        : Method Reuse & Method Calling
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates
 * method reuse in Java.
 *
 * A square() method is created
 * and reused inside another method
 * sumOfSquares().
 *
 * Example:
 * Input  : 3, 4
 * Output : 25
 *
 * Logic:
 * square(3) = 9
 * square(4) = 16
 * sum = 9 + 16 = 25
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SumOfSquares {

    /**
     * Returns square of a number.
     *
     * @param n number to square
     * @return square of n
     */
    static int square(int n) {
        return n * n;
    }

    /**
     * Returns sum of squares of two numbers.
     *
     * @param a first number
     * @param b second number
     * @return sum of squares
     */
    static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }

    public static void main(String[] args) {

        // 🔹 Method call
        int result = sumOfSquares(3, 4);

        // 🔹 Output
        System.out.println("Result : " + result);
    }
}

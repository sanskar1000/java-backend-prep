package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : SquareMethodDemo
 * Topic        : Methods with Return Values
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates a method
 * that calculates and returns
 * the square of a number.
 *
 * Example:
 * Input  : 5
 * Output : 25
 *
 * Logic:
 * - Multiply the number by itself
 * - Return the result
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SquareMethodDemo {

    /**
     * Returns the square of a number.
     *
     * @param n number to square
     * @return square of n
     */
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        // 🔹 Method call
        int result = square(5);

        // 🔹 Output
        System.out.println("Square of number : " + result);
    }
}

package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : EvenOddChecker
 * Topic        : Boolean Methods
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether
 * a number is even or odd
 * using a boolean method.
 *
 * Logic:
 * - If number is divisible by 2,
 *   it is even
 * - Otherwise, it is odd
 *
 * Example:
 * Input  : 7
 * Output : Odd number
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class EvenOddChecker {

    /**
     * Checks whether a number is even.
     *
     * @param n number to check
     * @return true if even, otherwise false
     */
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        // 🔹 Method call
        if (isEven(7)) {
            System.out.println("Even number");

        } else {
            System.out.println("Odd number");
        }
    }
}

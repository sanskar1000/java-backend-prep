package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : PerfectNumberChecker
 * Topic        : Perfect Numbers & Helper Methods
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether
 * a number is a perfect number.
 *
 * A perfect number is equal to
 * the sum of its proper factors.
 *
 * Example:
 * 6 = 1 + 2 + 3
 *
 * Concepts Used:
 * - helper methods
 * - loops
 * - factors
 * - boolean methods
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PerfectNumberChecker {

    /**
     * Returns sum of proper factors of a number.
     *
     * @param n input number
     * @return sum of factors
     */
    static int sumOfFactors(int n) {

        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    /**
     * Checks whether a number is perfect.
     *
     * @param n input number
     * @return true if perfect, otherwise false
     */
    static boolean isPerfect(int n) {

        if (n <= 0) {
            return false;
        }

        return n == sumOfFactors(n);
    }

    public static void main(String[] args) {

        // 🔹 Method call
        if (isPerfect(6)) {
            System.out.println("This number is Perfect");

        } else {
            System.out.println("This number is not Perfect");
        }
    }
}

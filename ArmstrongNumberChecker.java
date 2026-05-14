package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : ArmstrongNumberChecker
 * Topic        : Armstrong Numbers & Helper Methods
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether
 * a number is an Armstrong number.
 *
 * An Armstrong number is equal to:
 * sum of its digits raised to the
 * power of total number of digits.
 *
 * Example:
 * 153 = 1³ + 5³ + 3³ = 153
 *
 * Concepts Used:
 * - helper methods
 * - loops
 * - digit extraction
 * - Math.pow()
 * - boolean methods
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * where d = number of digits
 * ------------------------------------------------------------
 */

public class ArmstrongNumberChecker {

    /**
     * Counts total digits in a number.
     *
     * @param n input number
     * @return digit count
     */
    static int countDigits(int n) {

        if (n == 0) {
            return 1;
        }

        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    /**
     * Returns Armstrong power sum.
     *
     * @param n input number
     * @return sum of powered digits
     */
    static int power(int n) {

        int pow = countDigits(n);
        int sum = 0;

        while (n != 0) {

            int digit = n % 10;

            sum += (int) Math.pow(digit, pow);

            n /= 10;
        }

        return sum;
    }

    /**
     * Checks whether a number is Armstrong.
     *
     * @param n input number
     * @return true if Armstrong, otherwise false
     */
    static boolean isArmstrong(int n) {

        if (n <= 0) {
            return false;
        }

        return n == power(n);
    }

    public static void main(String[] args) {

        // 🔹 Method call
        if (isArmstrong(153)) {

            System.out.println("Armstrong Number");

        } else {

            System.out.println("Not Armstrong Number");
        }
    }
}

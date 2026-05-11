package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : PrimeNumberChecker
 * Topic        : Boolean Methods & Prime Numbers
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether
 * a number is prime or not
 * using a boolean method.
 *
 * A prime number:
 * - has exactly two factors
 * - 1 and itself
 *
 * Logic:
 * - Numbers <= 1 are not prime
 * - Check divisibility from 2 to √n
 * - If divisible, return false
 * - Otherwise, return true
 *
 * Example:
 * Input  : 5
 * Output : Prime number
 *
 * Time Complexity  : O(√n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrimeNumberChecker {

    /**
     * Checks whether a number is prime.
     *
     * @param n number to check
     * @return true if prime, otherwise false
     */
    static boolean isPrime(int n) {

        // 🔹 Numbers <= 1 are not prime
        if (n <= 1) {
            return false;
        }

        // 🔹 Check divisibility till square root of n
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // 🔹 Method call
        if (isPrime(5)) {
            System.out.println("Prime number");

        } else {
            System.out.println("Not Prime number");
        }
    }
}

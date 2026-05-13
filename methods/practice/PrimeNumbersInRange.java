package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : 
 * Topic        : Prime Numbers & Method Reuse
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints all prime numbers
 * within a given range.
 *
 * Concepts Used:
 * - boolean methods
 * - method reuse
 * - loops
 * - prime number logic
 *
 * Logic:
 * - A number is prime if it has
 *   exactly two factors:
 *   1 and itself.
 *
 * - Check divisibility only till √n
 *   for optimization.
 *
 * Example:
 * Input  : 1 to 10
 * Output : 2 3 5 7
 *
 * Time Complexity  : O((end - start) × √n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrimeNumbersInRange {

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

        // 🔹 Check divisibility till square root
        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Prints all prime numbers in a range.
     *
     * @param start starting number
     * @param end ending number
     */
    static void printPrimes(int start, int end) {

        // 🔹 Range validation
        if (start > end) {
            System.out.println("Invalid range");
            return;
        }

        System.out.println("Prime numbers:");

        for (int i = start; i <= end; i++) {

            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        // 🔹 Method call
        printPrimes(1, 10);
    }
}

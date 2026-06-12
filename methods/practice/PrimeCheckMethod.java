package methods.practice;

/**
 * ------------------------------------------------------------
 * Program Name : PrimeCheckMethod
 * Topic        : Methods in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number
 * is prime or not using a method.
 *
 * A prime number is divisible only by:
 * - 1
 * - itself
 *
 * Examples:
 * 2, 3, 5, 7, 11, 13 ...
 *
 * Concepts Used:
 * - Methods
 * - Boolean Return Type
 * - Loops
 * - Conditional Statements
 * - Mathematical Optimization
 *
 * Time Complexity  : O(√n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrimeCheckMethod {

    /**
     * Checks whether a number is prime.
     *
     * @param number number to check
     * @return true if prime, otherwise false
     */
    static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int divisor = 2;
             divisor * divisor <= number;
             divisor++) {

            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int number = 11;

        if (isPrime(number)) {

            System.out.println(
                    number + " is a prime number."
            );

        } else {

            System.out.println(
                    number + " is not a prime number."
            );
        }
    }
}

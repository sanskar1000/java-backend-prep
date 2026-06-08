package methods.practice;

/**
 * ------------------------------------------------------------
 * Program Name : FactorialMethod
 * Topic        : Methods in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - method creation
 * - method calling
 * - returning values from methods
 * - factorial calculation using a loop
 *
 * Concepts Used:
 * - Methods
 * - Return Type
 * - Parameters
 * - Loops (for loop)
 * - Arithmetic Operations
 *
 * Formula:
 * n! = n × (n - 1) × (n - 2) × ... × 1
 *
 * Example:
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class FactorialMethod {

    /**
     * Calculates the factorial of a number.
     *
     * @param n number whose factorial is to be calculated
     * @return factorial of n
     */
    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int number = 5;

        int result = factorial(number);

        System.out.println(
                "Factorial of " + number +
                " = " + result
        );
    }
}

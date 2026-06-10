package methods.practice;

/**
 * ------------------------------------------------------------
 * Program Name : CheckEvenOdd
 * Topic        : Methods in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - method creation
 * - method calling
 * - conditional statements
 * - checking even and odd numbers
 *
 * Concepts Used:
 * - Methods
 * - Parameters
 * - Return Values
 * - if-else
 * - Modulus Operator (%)
 *
 * Logic:
 * A number is even if it is divisible by 2.
 * Otherwise, it is odd.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CheckEvenOdd {

    /**
     * Checks whether a number is even.
     *
     * @param number number to check
     * @return true if even, false otherwise
     */
    static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static void main(String[] args) {

        int number = 7;

        if (isEven(number)) {

            System.out.println(number + " is Even");

        } else {

            System.out.println(number + " is Odd");
        }
    }
}

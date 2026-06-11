package methods.practice;

/**
 * ------------------------------------------------------------
 * Program Name : PalindromeMethod
 * Topic        : Methods in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number
 * is a palindrome or not.
 *
 * A palindrome number remains the same when
 * its digits are reversed.
 *
 * Examples:
 * 121   → Palindrome
 * 1331  → Palindrome
 * 123   → Not Palindrome
 *
 * Concepts Used:
 * - Methods
 * - Return Type
 * - While Loop
 * - Arithmetic Operations
 * - Number Reversal
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 *
 * where d = number of digits
 * ------------------------------------------------------------
 */

public class PalindromeMethod {

    /**
     * Checks whether a number is palindrome.
     *
     * @param number number to check
     * @return true if palindrome, otherwise false
     */
    static boolean isPalindrome(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        int reverse = 0;

        while (number > 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int number = 121;

        if (isPalindrome(number)) {

            System.out.println(
                    number + " is a palindrome number."
            );

        } else {

            System.out.println(
                    number + " is not a palindrome number."
            );
        }
    }
}

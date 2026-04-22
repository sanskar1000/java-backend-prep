package loops.practice;

/**
 * ------------------------------------------------------------
 * Program Name : ReverseNumber
 * Topic        : While Loop / Number Manipulation
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program reverses a given integer using a while loop.
 *
 * The logic works by:
 * - Extracting the last digit using modulus (% 10)
 * - Appending it to the reversed number
 * - Removing the last digit using division (/ 10)
 *
 * This process continues until the number becomes 0.
 *
 * Example:
 * Input  : 12345
 * Output :
 * Original number = 12345
 * Reversed number = 54321
 *
 * Formula:
 * digit   = number % 10
 * reverse = reverse * 10 + digit
 * number  = number / 10
 *
 * Time Complexity  : O(d)   [d = number of digits]
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ReverseNumber {

    public static void main(String[] args) {

        // 🔹 Input number
        int number = 12345;

        // 🔹 Preserve original value
        int originalNumber = number;

        // 🔹 Variable to store reversed number
        int reverse = 0;

        // 🔹 Loop until number becomes 0
        while (number > 0) {

            // Extract last digit
            int digit = number % 10;

            // Build reversed number
            reverse = reverse * 10 + digit;

            // Remove last digit
            number = number / 10;
        }

        // 🔹 Output results
        System.out.println("Original number = " + originalNumber);
        System.out.println("Reversed number = " + reverse);
    }
}

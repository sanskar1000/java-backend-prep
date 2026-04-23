package loops.practice;

/**
 * ------------------------------------------------------------
 * Program Name : CountDigits
 * Topic        : While Loop / Number Manipulation
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts the total number of digits in a given integer.
 *
 * The logic works by:
 * - Repeatedly dividing the number by 10
 * - Each division removes the last digit
 * - A counter keeps track of how many times this happens
 *
 * The loop continues until the number becomes 0.
 *
 * Example:
 * Input  : 12345
 * Output :
 * Number = 12345
 * Total digits = 5
 *
 * Formula:
 * number = number / 10
 * count++
 *
 * Time Complexity  : O(d)   [d = number of digits]
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CountDigits {

    public static void main(String[] args) {

        // 🔹 Input number
        int number = 12345;

        // 🔹 Preserve original value
        int originalNumber = number;

        // 🔹 Counter for digits
        int count = 0;

        // 🔹 Handle edge case: number = 0
        if (number == 0) {
            count = 1;
        } else {

            // 🔹 Loop until number becomes 0
            while (number > 0) {
                number = number / 10;  // remove last digit
                count++;
            }
        }

        // 🔹 Output result
        System.out.println("Number = " + originalNumber);
        System.out.println("Total digits = " + count);
    }
}

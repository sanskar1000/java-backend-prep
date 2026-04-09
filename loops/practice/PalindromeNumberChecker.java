package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PalindromeNumberChecker
 * Topic        : Loops (while loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number
 * is a palindrome.
 *
 * A palindrome number reads the same forward
 * and backward.
 *
 * Examples:
 * • 121 → Palindrome
 * • 123 → Not Palindrome
 *
 * Edge Cases:
 * • Negative numbers → Not palindrome
 * • 0 → Palindrome
 *
 * Time Complexity  : O(log₁₀ n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PalindromeNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("❌ Negative numbers are not palindrome");
            sc.close();
            return;
        }

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (original == reverse) {
            System.out.println("✔ " + original + " is a palindrome");
        } else {
            System.out.println("❌ " + original + " is not a palindrome");
        }

        sc.close();
    }
}

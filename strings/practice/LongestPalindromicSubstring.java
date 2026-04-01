package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LongestPalindromicSubstring
 * Topic        : String Algorithms
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the longest palindromic substring
 * in a given string using the "Expand Around Center" approach.
 *
 * A palindrome is a string that reads the same forward and backward.
 *
 * Approach:
 * • Treat each character as a center
 * • Expand outward for:
 *      - Odd length palindrome (center = i)
 *      - Even length palindrome (center = i, i+1)
 * • Track the longest substring found
 *
 * Example:
 * Input  : babad
 * Output : bab (or aba)
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 *
 * Why this approach?
 * • More efficient than brute force (O(n³))
 * • No extra memory required
 * ------------------------------------------------------------
 */

public class LongestPalindromicSubstring {

    /**
     * Expands around the given center and returns the longest palindrome.
     *
     * @param str   Input string
     * @param left  Left index of center
     * @param right Right index of center
     * @return Longest palindromic substring from this center
     */
    public static String expand(String str, int left, int right) {

        // Expand while characters match and indices are valid
        while (left >= 0 && right < str.length()
                && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        // Return valid palindrome substring
        return str.substring(left + 1, right);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter string: ");
        String str = sc.nextLine().trim();

        // Validation
        if (str.isEmpty()) {
            System.out.println("Invalid string ❌");
            return;
        }

        String longest = "";

        // Iterate through each character
        for (int i = 0; i < str.length(); i++) {

            // Case 1: Odd length palindrome
            String odd = expand(str, i, i);

            // Case 2: Even length palindrome
            String even = expand(str, i, i + 1);

            // Select longer palindrome
            String current = (odd.length() > even.length()) ? odd : even;

            // Update result if longer found
            if (current.length() > longest.length()) {
                longest = current;
            }
        }

        // Output
        System.out.println("Longest Palindromic Substring: " + longest);
        System.out.println("Length: " + longest.length());

        sc.close();
    }
}

package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PalindromeStringChecker
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given string is a palindrome.
 * A palindrome is a word or sequence that reads the same
 * forward and backward.
 *
 * Key Concepts:
 * • User input using Scanner
 * • String length() method
 * • charAt() method
 * • String comparison using equals()
 *
 * Approach:
 * 1. Read a string from the user.
 * 2. Reverse the string using a loop.
 * 3. Compare the original string with the reversed string.
 * 4. If both are equal → the string is a palindrome.
 *
 * Example:
 * Input  : madam
 * Output : String is palindrome
 *
 * Input  : java
 * Output : String is not palindrome
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class PalindromeStringChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String originalString = sc.nextLine();

        String reversed = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversed += originalString.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        if (originalString.equals(reversed)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }

        sc.close();
    }
}

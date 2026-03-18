package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FirstNonRepeatingCharacter
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the first non-repeating character
 * in a given string.
 *
 * It uses a frequency array to count occurrences of each
 * character, then finds the first character with count = 1.
 *
 * Key Concepts:
 * • Frequency counting
 * • String traversal
 * • Two-pass algorithm
 *
 * Example:
 * Input  : programming
 * Output : p
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int[] freq = new int[256];

        // Step 1: Count frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Step 2: Find first non-repeating character
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != ' ') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}

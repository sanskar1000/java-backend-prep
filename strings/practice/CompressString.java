package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CompressString
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program compresses a string using run-length encoding.
 * Consecutive repeated characters are replaced with the
 * character followed by its count.
 *
 * Example:
 * Input  : aaabb
 * Output : a3b2
 *
 * Key Concepts:
 * • String traversal
 * • Character comparison
 * • StringBuilder for efficiency
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class CompressString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // handle last group
        result.append(str.charAt(str.length() - 1)).append(count);

        System.out.println("Compressed string: " + result);

        sc.close();
    }
}

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AlphabetsOnlyExtractor
 * Topic        : Java Strings
 * Level        : Beginner / Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program extracts only alphabetic characters
 * from a given string and removes all digits,
 * symbols, and special characters.
 *
 * Key Concepts:
 * • Character.isLetter()
 * • StringBuilder for efficient string handling
 *
 * Example:
 * Input  : Hello123@World!
 * Output : HelloWorld
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class AlphabetsOnlyExtractor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                result.append(ch);
            }
        }

        System.out.println("Extracted alphabets: " + result);

        sc.close();
    }
}

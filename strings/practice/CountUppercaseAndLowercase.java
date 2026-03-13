package strings.practice;

/**
 * ------------------------------------------------------------
 * Program Name : CountUppercaseAndLowercase
 * Topic        : Java Strings
 * Level        : Beginner
 *
 * Problem:
 * Count the number of uppercase and lowercase letters in a string.
 *
 * Logic:
 * 1. Take a string input from the user.
 * 2. Traverse each character using a loop.
 * 3. If character is between 'a' and 'z', increment lowercase counter.
 * 4. If character is between 'A' and 'Z', increment uppercase counter.
 *
 * Example Input:
 * JavaProgramming
 *
 * Output:
 * Uppercase characters : 2
 * Lowercase characters : 13
 *
 * Time Complexity:
 * O(n) — each character of the string is checked once.
 *
 * Space Complexity:
 * O(1) — only two counters are used.
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class CountUppercaseAndLowercase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int lowercaseCount = 0;
        int uppercaseCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                lowercaseCount++;
            }

            if (ch >= 'A' && ch <= 'Z') {
                uppercaseCount++;
            }
        }

        System.out.println("Uppercase characters: " + uppercaseCount);
        System.out.println("Lowercase characters: " + lowercaseCount);

        sc.close();
    }
}

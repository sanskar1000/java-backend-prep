package strings.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CountWordsInSentence
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts the number of words in a sentence.
 *
 * A word is defined as a sequence of characters separated
 * by whitespace. The program detects word boundaries using
 * character conditions.
 *
 * Key Concepts:
 * • String traversal
 * • Word boundary detection
 * • Conditional logic
 *
 * Example:
 * Input  : Hello   world Java
 * Output : 3
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CountWordsInSentence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isWhitespace(ch) &&
               (i == 0 || Character.isWhitespace(str.charAt(i - 1)))) {
                count++;
            }
        }

        System.out.println("Total words in sentence: " + count);

        sc.close();
    }
}

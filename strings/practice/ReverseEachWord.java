package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReverseEachWord
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program reverses each word in a sentence while
 * keeping the word order unchanged.
 *
 * It splits the sentence into words, reverses each word,
 * and joins them back into a new string.
 *
 * Key Concepts:
 * • trim() and split("\\s+") for input handling
 * • StringBuilder for efficient string manipulation
 * • reverse() method
 *
 * Example:
 * Input  : Hello World Java
 * Output : olleH dlroW avaJ
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ReverseEachWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("No words found");
            return;
        }

        String[] words = str.split("\\s+");

        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            reversedSentence.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println("Output: " + reversedSentence.toString().trim());

        sc.close();
    }
}

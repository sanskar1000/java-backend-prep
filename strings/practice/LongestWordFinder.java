package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LongestWordFinder
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the longest word in a sentence
 * and prints its length.
 *
 * It trims the input string and splits it using
 * regular expression to handle multiple spaces.
 *
 * Key Concepts:
 * • trim() method
 * • split("\\s+") for multiple spaces
 * • String traversal
 *
 * Example:
 * Input  : Java is very powerful
 * Output :
 * Longest word: powerful
 * Length: 8
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class LongestWordFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("No words found.");
            return;
        }

        String[] words = str.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length: " + maxLength);

        sc.close();
    }
}

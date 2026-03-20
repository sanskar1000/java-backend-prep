package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ShortestWordFinder
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the shortest word in a sentence
 * and prints its length.
 *
 * If multiple words have the same minimum length,
 * the first occurrence is returned.
 *
 * Key Concepts:
 * • trim() method
 * • split("\\s+") for handling multiple spaces
 * • String traversal
 *
 * Example:
 * Input  : Java is very powerful
 * Output :
 * Shortest word: is
 * Length: 2
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ShortestWordFinder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        if (str.trim().isEmpty()) {
            System.out.println("No words found");
            return;
        }

        String[] words = str.trim().split("\\s+");

        int minLength = Integer.MAX_VALUE;
        String shortest = "";

        for (String word : words) {
            if (word.length() < minLength) {
                minLength = word.length();
                shortest = word;
            }
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Length: " + minLength);

        sc.close();
    }
}

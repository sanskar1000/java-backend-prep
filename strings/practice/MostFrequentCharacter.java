package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MostFrequentCharacter
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the most frequent character
 * in a given string.
 *
 * It uses a frequency array to count occurrences
 * of each character and determines the maximum.
 *
 * Key Concepts:
 * • Frequency counting
 * • String traversal
 *
 * Example:
 * Input  : programming
 * Output : r (2 times)
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MostFrequentCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().toLowerCase().trim();

        if (str.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int maxCount = 0;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (freq[ch] > maxCount) {
                maxCount = freq[ch];
                result = ch;
            }
        }

        System.out.println("Most frequent character: " + result);
        System.out.println("Frequency: " + maxCount);

        sc.close();
    }
}

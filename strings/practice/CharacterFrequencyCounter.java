package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CharacterFrequencyCounter
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts how many times a specific character
 * appears in a given string.
 *
 * The user enters a string and the character to search.
 * The program traverses the string and counts occurrences
 * using the charAt() method.
 *
 * Key Concepts:
 * • String traversal
 * • charAt() method
 * • Character comparison
 * • Loops and conditions
 *
 * Example:
 * Input String : banana
 * Character    : a
 *
 * Output:
 * Frequency of 'a' = 3
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CharacterFrequencyCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to search: ");
        char target = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                count++;
            }

        }

        System.out.println("Frequency of '" + target + "' = " + count);

        sc.close();
    }
}

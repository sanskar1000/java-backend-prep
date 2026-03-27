package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SubstringOccurrenceCounter
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts the number of occurrences
 * of a substring within a given string using
 * manual pattern matching.
 *
 * Key Concepts:
 * • Nested loops
 * • String comparison
 * • Pattern matching (naive approach)
 *
 * Example:
 * Input  : banana, ana
 * Output : 2
 *
 * Time Complexity  : O(n * m)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SubstringOccurrenceCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().trim();

        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        if (sub.isEmpty() || str.length() < sub.length()) {
            System.out.println("Occurrences: 0");
            return;
        }

        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {

            boolean isMatch = true;

            for (int j = 0; j < sub.length(); j++) {

                if (str.charAt(i + j) != sub.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);

        sc.close();
    }
}

package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : IsomorphicStrings
 * Topic        : String Algorithms
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether two strings are isomorphic.
 *
 * Two strings are isomorphic if characters in one string
 * can be replaced to get the other string, preserving order.
 *
 * Approach:
 * • Convert each string into a pattern representation
 * • Compare both patterns
 *
 * Example:
 * egg → 122
 * add → 122 → Isomorphic
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class IsomorphicStrings {

    public static String encodePattern(String str) {

        int[] map = new int[256];
        int count = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map[ch] == 0) {
                map[ch] = count++;
            }

            result.append(map[ch]);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine().trim();

        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine().trim();

        if (s1.length() != s2.length()) {
            System.out.println("Not Isomorphic ❌");
            return;
        }

        if (encodePattern(s1).equals(encodePattern(s2))) {
            System.out.println("Isomorphic ✔");
        } else {
            System.out.println("Not Isomorphic ❌");
        }

        sc.close();
    }
}

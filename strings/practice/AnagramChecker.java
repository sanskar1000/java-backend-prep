package strings.practice;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AnagramChecker
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether two strings are anagrams.
 * Two strings are anagrams if they contain the same
 * characters in any order.
 *
 * The program normalizes input, sorts both strings,
 * and compares them.
 *
 * Key Concepts:
 * • String normalization
 * • toCharArray()
 * • Arrays.sort()
 * • Character comparison
 *
 * Example:
 * Input  : listen, silent
 * Output : Strings are anagrams
 *
 * Time Complexity  : O(n log n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class AnagramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().trim().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().trim().toLowerCase();

        // Remove spaces (optional enhancement)
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }

        sc.close();
    }
}

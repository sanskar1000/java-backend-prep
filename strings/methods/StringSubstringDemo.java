package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringSubstringDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of substring() method to extract
 * a portion of a string using index positions.
 *
 * Key Concept:
 * • substring(startIndex)
 * • substring(startIndex, endIndex)
 * • startIndex is inclusive
 * • endIndex is exclusive
 *
 * Example:
 * Input String : JavaBackend
 * Start Index  : 4
 * End Index    : 11
 * Output       : Backend
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringSubstringDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        if (start >= 0 && end <= str.length() && start < end) {
            String result = str.substring(start, end);
            System.out.println("Extracted substring: " + result);
        } else {
            System.out.println("Invalid index values!");
        }

        sc.close();
    }
}

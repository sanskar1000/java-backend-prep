package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringTrimDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of trim() method to remove
 * leading and trailing whitespace.
 *
 * Key Concept:
 * • trim() removes spaces only from the beginning and end.
 * • It does NOT remove spaces between words.
 * • Returns a new String (immutability).
 *
 * Example:
 * Input  : "   Java Backend   "
 * Output : "Java Backend"
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringTrimDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String str = sc.nextLine();

        String trimmedString = str.trim();

        System.out.println("After trim(): '" + trimmedString + "'");

        sc.close();
    }
}

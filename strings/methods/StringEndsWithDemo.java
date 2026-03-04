package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringEndsWithDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of endsWith() method to check
 * whether a string ends with a specified suffix.
 *
 * Key Concept:
 * • endsWith(String suffix)
 * • Returns boolean (true/false)
 * • Case-sensitive
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringEndsWithDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter suffix to check: ");
        String suffix = sc.nextLine();

        boolean result = str.endsWith(suffix);

        System.out.println("Ends with \"" + suffix + "\" ? " + result);

        sc.close();
    }
}

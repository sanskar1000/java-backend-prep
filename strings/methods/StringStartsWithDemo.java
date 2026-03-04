package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringStartsWithDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of startsWith() method to check
 * whether a string begins with a specified prefix.
 *
 * Key Concept:
 * • startsWith(String prefix)
 * • Returns boolean (true/false)
 * • Case-sensitive
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringStartsWithDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter prefix to check: ");
        String prefix = sc.nextLine();

        boolean result = str.startsWith(prefix);

        System.out.println("Starts with \"" + prefix + "\" ? " + result);

        sc.close();
    }
}

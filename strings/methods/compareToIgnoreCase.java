package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringCompareToIgnoreCaseDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates compareToIgnoreCase() method to compare
 * two strings lexicographically without considering case.
 *
 * Key Concept:
 * • compareTo() → Case-sensitive
 * • compareToIgnoreCase() → Case-insensitive
 *
 * Returns:
 * 0  → Strings are equal
 * <0 → First string comes before second
 * >0 → First string comes after second
 *
 * Example:
 * Input 1 : apple
 * Input 2 : Banana
 * Output  : apple comes before Banana
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringCompareToIgnoreCaseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = str1.compareToIgnoreCase(str2);

        if (result == 0) {
            System.out.println("Strings are equal");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }

        sc.close();
    }
}

package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringCompareToDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of the String compareTo()
 * method to compare two strings lexicographically.
 *
 * Key Concept:
 * • Returns 0  → if both strings are equal
 * • Returns <0 → if first string is lexicographically smaller
 * • Returns >0 → if first string is lexicographically greater
 *
 * Comparison is based on Unicode values of characters.
 *
 * Example:
 * Input 1 : Apple
 * Input 2 : Banana
 * Output  : Apple comes before Banana
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringCompareToDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int result = str1.compareTo(str2);

        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println(str1 + " comes before " + str2);
        } else {
            System.out.println(str1 + " comes after " + str2);
        }

        sc.close();
    }
}

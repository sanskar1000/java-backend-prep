package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringContainsDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of the String contains() method
 * to check whether a string contains a specific substring.
 *
 * Key Concept:
 * • contains() returns true if substring exists.
 * • It is case-sensitive.
 *
 * Example:
 * Input String : Java Backend Developer
 * Search Word  : Backend
 * Output       : Substring found
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringContainsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring to search: ");
        String subStr = sc.nextLine();

        if (mainStr.contains(subStr)) {
            System.out.println("Substring found");
        } else {
            System.out.println("Substring not found");
        }

        sc.close();
    }
}

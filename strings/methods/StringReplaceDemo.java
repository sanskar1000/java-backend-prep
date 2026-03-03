package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringReplaceDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of replace() method to replace
 * characters or substrings in a string.
 *
 * Key Concept:
 * • replace(oldChar, newChar)
 * • replace(oldString, newString)
 * • Returns a new String (immutability).
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringReplaceDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter word/character to replace: ");
        String oldValue = sc.nextLine();

        System.out.print("Enter new value: ");
        String newValue = sc.nextLine();

        String result = str.replace(oldValue, newValue);

        System.out.println("After replace(): " + result);

        sc.close();
    }
}

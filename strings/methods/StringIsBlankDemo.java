package strings.basics;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringIsBlankDemo
 * Topic        : Java Strings (Java 11+)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of isBlank() method to check
 * whether a string is empty or contains only whitespace.
 *
 * Key Concept:
 * • isBlank() returns true if string is empty OR only whitespace
 * • Available from Java 11
 * • Returns boolean
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringIsBlankDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.isBlank()) {
            System.out.println("String is blank");
        } else {
            System.out.println("String is NOT blank");
        }

        sc.close();
    }
}

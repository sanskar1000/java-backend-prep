package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringIsEmptyDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of isEmpty() method to check
 * whether a string is empty.
 *
 * Key Concept:
 * • isEmpty() returns true if length == 0
 * • It does NOT check for spaces
 * • Returns boolean
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringIsEmptyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (str.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is NOT empty");
        }

        sc.close();
    }
}

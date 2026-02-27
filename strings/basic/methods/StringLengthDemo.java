package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringLengthDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of the built-in String
 * method length() to calculate the number of characters in
 * a user-input string.
 *
 * Notes:
 * • Spaces and special characters are also counted.
 * • The length() method returns an integer value.
 *
 * Example:
 * Input  : Java Backend
 * Output : Length of string = 12
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringLengthDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int length = input.length();

        System.out.println("Length of string = " + length);

        sc.close();
    }
}

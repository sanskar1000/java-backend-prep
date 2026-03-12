package strings.practice;

/**
 * ------------------------------------------------------------
 * Program Name : FindStringLengthWithoutLengthMethod
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Problem:
 * Find the length of a string without using the length() method.
 *
 * Logic:
 * 1. Convert the string into a character array.
 * 2. Traverse each character using a loop.
 * 3. Increment a counter for every character.
 *
 * Example Input:
 * Java
 *
 * Output:
 * Length of String : 4
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(n) because a character array is created.
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class StringLengthWithoutLengthMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char[] chars = str.toCharArray();

        int count = 0;

        for (char c : chars) {
            count++;
        }

        System.out.println("Length of String: " + count);

        sc.close();
    }
}

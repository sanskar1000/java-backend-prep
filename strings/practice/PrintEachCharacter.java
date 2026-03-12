package strings.practice;
/**
 * ------------------------------------------------------------
 * Program Name : PrintEachCharacter
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Problem:
 * Print each character of a given string.
 *
 * Logic:
 * 1. Take string input from the user.
 * 2. Loop from index 0 to length-1.
 * 3. Use charAt(i) to access each character.
 * 4. Print the character.
 *
 * Example Input:
 * Java
 *
 * Output:
 * J
 * a
 * v
 * a
 *
 * Time Complexity:
 * O(n)
 * Because the loop runs once for every character in the string.
 *
 * Space Complexity:
 * O(1)
 * No extra memory is used except a single variable (ch).
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class PrintEachCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Each character of the string:");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        sc.close();
    }
}

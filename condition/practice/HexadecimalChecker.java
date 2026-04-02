package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : HexadecimalChecker
 * Topic        : Conditional Statements
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given character
 * is a valid hexadecimal digit.
 *
 * Hexadecimal digits include:
 * • 0–9
 * • a–f
 * • A–F
 *
 * Approach:
 * Uses built-in method Character.digit(ch, 16)
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class HexadecimalChecker {

    public static boolean isHex(char ch) {
        return Character.digit(ch, 16) != -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (isHex(ch)) {
            System.out.println("✔ Character is a hexadecimal digit");
        } else {
            System.out.println("❌ Character is NOT a hexadecimal digit");
        }

        sc.close();
    }
}

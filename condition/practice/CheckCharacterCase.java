// Practice Program : Check Character Case

package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CheckCharacterCase
 * Topic        : If-Else Condition in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether the entered character is:
 * - Uppercase letter
 * - Lowercase letter
 * - Not an alphabet character
 *
 * Concepts Used:
 * - Scanner Class
 * - User Input
 * - if-else-if ladder
 * - Character comparison
 * - Logical AND operator (&&)
 *
 * ------------------------------------------------------------
 */

public class CheckCharacterCase {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take character input
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        // Check uppercase
        if (ch >= 'A' && ch <= 'Z') {

            System.out.println("Uppercase Letter");

        }

        // Check lowercase
        else if (ch >= 'a' && ch <= 'z') {

            System.out.println("Lowercase Letter");

        }

        // Not an alphabet
        else {

            System.out.println("Not an Alphabet Character");
        }

        // Close Scanner
        sc.close();
    }
}

package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CharacterTypeChecker
 * Topic        : Conditional Statements / Characters
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks the type of a character entered by the user.
 * It determines whether the character is:
 * • Uppercase letter
 * • Lowercase letter
 * • Digit
 * • Special symbol
 *
 * Key Concepts:
 * • Character comparison
 * • ASCII value ranges
 * • Conditional statements (if-else)
 *
 * ASCII Ranges:
 * 'A'–'Z' → Uppercase letters
 * 'a'–'z' → Lowercase letters
 * '0'–'9' → Digits
 *
 * Example:
 * Input  : A
 * Output : Uppercase Letter
 *
 * Input  : 7
 * Output : Digit
 *
 * Input  : #
 * Output : Special Symbol
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CharacterTypeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        } 
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } 
        else {
            System.out.println("Special Symbol");
        }

        sc.close();
    }
}

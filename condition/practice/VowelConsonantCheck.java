package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : VowelConsonantChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given character entered by
 * the user is a vowel or a consonant.
 *
 * The program first verifies if the character is an alphabet.
 * If it is an alphabet, it converts the character to lowercase
 * and then checks whether it belongs to the set of vowels
 * (a, e, i, o, u).
 *
 * Key Concepts:
 * • Character input using Scanner
 * • ASCII / Unicode character comparison
 * • Logical operators (&&, ||)
 * • Nested if statements
 * • Character utility methods
 *
 * Example:
 * Input  : a
 * Output : Character is vowel.
 *
 * Input  : b
 * Output : Character is consonant.
 *
 * Input  : 7
 * Output : Not an alphabet character.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class VowelConsonantChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Check if character is alphabet
        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {

            // Convert to lowercase
            ch = Character.toLowerCase(ch);

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Character is vowel.");
            } else {
                System.out.println("Character is consonant.");
            }

        } else {
            System.out.println("Not an alphabet character.");
        }

        sc.close();
    }
}

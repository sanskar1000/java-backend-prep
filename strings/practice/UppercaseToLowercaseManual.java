package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : UppercaseToLowercaseManual
 * Topic        : Java Strings / ASCII Manipulation
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program converts uppercase characters of a string
 * into lowercase manually without using built-in methods
 * like toLowerCase().
 *
 * ASCII Concept:
 * 'A' → 65
 * 'a' → 97
 * Difference = 32
 *
 * Logic:
 * If a character lies between 'A' and 'Z',
 * add 32 to convert it into lowercase.
 *
 * Key Concepts:
 * • String traversal using loop
 * • charAt() method
 * • ASCII character manipulation
 * • Conditional statements
 *
 * Example:
 * Input  : JAVA Code
 * Output : java code
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class UppercaseToLowercaseManual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Converted string: ");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

            System.out.print(ch);
        }

        sc.close();
    }
}

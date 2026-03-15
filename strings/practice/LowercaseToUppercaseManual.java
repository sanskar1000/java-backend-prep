package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LowercaseToUppercaseManual
 * Topic        : Java Strings / ASCII Manipulation
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program converts lowercase characters of a string
 * into uppercase manually without using built-in methods
 * like toUpperCase().
 *
 * The conversion is done using ASCII values:
 * 'a' → 97 and 'A' → 65
 * Difference = 32
 *
 * Logic:
 * If character is between 'a' and 'z'
 * subtract 32 to convert it to uppercase.
 *
 * Key Concepts:
 * • String traversal using loop
 * • charAt() method
 * • ASCII character manipulation
 * • Conditional statements
 *
 * Example:
 * Input  : java code
 * Output : JAVA CODE
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LowercaseToUppercaseManual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Converted string: ");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            System.out.print(ch);
        }

        sc.close();
    }
}

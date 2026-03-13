package codition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PasswordLengthValidator
 * Topic        : Strings / Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether the length of a password entered
 * by the user is valid. A password is considered valid if its
 * length is exactly 4 characters.
 *
 * Key Concepts:
 * • User input using Scanner
 * • String length() method
 * • Conditional statements (if-else)
 *
 * Example:
 * Input  : abcd
 * Output : Password length is valid
 *
 * Input  : abcdef
 * Output : Password length is invalid
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PasswordLengthValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (pass.length() == 4) {
            System.out.println("Password length is valid");
        } else {
            System.out.println("Password length is invalid");
        }

        sc.close();
    }
}

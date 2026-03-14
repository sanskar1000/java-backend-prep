package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReverseString
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program reverses a string entered by the user.
 * The program reads a string from the console and prints
 * the characters in reverse order.
 *
 * Key Concepts:
 * • User input using Scanner
 * • String length() method
 * • charAt() method
 * • for loop iteration
 *
 * Approach:
 * Start from the last character of the string and print
 * each character until the first character is reached.
 *
 * Example:
 * Input  : Java
 * Output : avaJ
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Reversed string: ");

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        sc.close();
    }
}

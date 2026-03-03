package strings.basics;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringToUpperCaseDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of toUpperCase() method to convert
 * all characters of a string into uppercase.
 *
 * Key Concept:
 * • toUpperCase() returns a new string.
 * • Original string remains unchanged.
 *
 * Example:
 * Input  : java backend
 * Output : JAVA BACKEND
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringToUpperCaseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String upperCaseString = str.toUpperCase();

        System.out.println("Uppercase string: " + upperCaseString);

        sc.close();
    }
}

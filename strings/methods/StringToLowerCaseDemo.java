package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringToLowerCaseDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of toLowerCase() method to convert
 * all characters of a string into lowercase.
 *
 * Key Concept:
 * • toLowerCase() returns a new string.
 * • Original string remains unchanged (immutability).
 *
 * Example:
 * Input  : JAVA Backend
 * Output : java backend
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringToLowerCaseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String lowerCaseString = str.toLowerCase();

        System.out.println("Lowercase string: " + lowerCaseString);

        sc.close();
    }
}

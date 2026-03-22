Package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringRotationChecker
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether one string is a rotation
 * of another string.
 *
 * Logic:
 * If str2 is a substring of (str1 + str1), then it is
 * a rotation of str1.
 *
 * Key Concepts:
 * • String concatenation
 * • contains() method
 * • String length comparison
 *
 * Example:
 * Input  : abcd, cdab
 * Output : Strings are rotations
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringRotationChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().trim();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().trim();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotations");
            return;
        }

        String combined = str1 + str1;

        if (combined.contains(str2)) {
            System.out.println("Strings are rotations");
        } else {
            System.out.println("Strings are not rotations");
        }

        sc.close();
    }
}

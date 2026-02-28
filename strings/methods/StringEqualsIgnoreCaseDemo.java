package strings.method;

 import java.util.Scanner;

 /**
 * ------------------------------------------------------------
 * Program Name : StringEqualsIgnoreCaseDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrate the use of the String
 * equalsIgnoreCase() method to compare two strings
 * without considering letter case.
 *
 * Key Concept:
 * • equals() → Case-sensitive comparison
 * • equalsIgnoreCase() → Case-insensitive comparison
 *
 * Example:
 * Input 1 : Java
 * Input 2 : java
 * Output  : Strings are equal (ignoring case)
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringEqualsIgnoreCaseDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings are equal (ignoring case)");
        } else {
            System.out.println("Strings are not equal");
        }

        sc.close();
    }
}

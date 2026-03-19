package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReplaceSpacesWithHyphen
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program replaces all spaces in a string with
 * a hyphen (-).
 *
 * It traverses each character and replaces spaces
 * while building a new string.
 *
 * Key Concepts:
 * • String traversal
 * • Character replacement
 * • StringBuilder (efficient concatenation)
 *
 * Example:
 * Input  : Hello World Java
 * Output : Hello-World-Java
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ReplaceSpacesWithHyphen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                result.append(ch);
            } else {
                result.append('-');
            }
        }

        System.out.println("After replacement: " + result);

        sc.close();
    }
}

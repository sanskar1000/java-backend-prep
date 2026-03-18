package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RemoveSpaces
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program removes all whitespace characters from
 * a given string.
 *
 * It iterates through each character and builds a new
 * string excluding spaces.
 *
 * Key Concepts:
 * • String traversal
 * • Character filtering
 * • String concatenation
 *
 * Example:
 * Input  : Hello World
 * Output : HelloWorld
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("After removing spaces: " + result);

        sc.close();
    }
}

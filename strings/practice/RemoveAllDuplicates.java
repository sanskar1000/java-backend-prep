package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RemoveAllDuplicates
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program removes duplicate characters from a string
 * while keeping the first occurrence of each character.
 *
 *
 * Key Concepts:
 * • String traversal
 * • Frequency array
 * • Efficient string building (StringBuilder)
 *
 * Example:
 * Input  : programming
 * Output : progamin
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RemoveAllDuplicates {

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}

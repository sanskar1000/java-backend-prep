package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RemoveDuplicates
 * Topic        : Java Strings
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program removes duplicate characters from a string
 * while keeping the first occurrence of each character.
 *
 * It uses a boolean array as a frequency map to track
 * already seen characters, making the solution efficient.
 *
 * Key Concepts:
 * • String traversal
 * • Frequency array (boolean[])
 * • ASCII/Unicode handling
 * • Efficient duplicate removal
 *
 * Example:
 * Input  : programming
 * Output : progamin
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1) (constant size array)
 * ------------------------------------------------------------
 */

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        boolean[] seen = new boolean[65536]; // supports full Unicode

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!seen[ch]) {
                seen[ch] = true;
                result += ch;
            }
        }

        System.out.println("After removing duplicates: " + result);

        sc.close();
    }
}

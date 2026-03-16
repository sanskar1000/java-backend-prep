package strings.practice
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CharacterFrequency
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts the frequency of each character
 * in a given string.
 *
 * The string is converted to a character array and
 * nested loops are used to count occurrences.
 *
 * To avoid recounting characters, a special marker '*'
 * is used to mark already counted characters.
 *
 * Key Concepts:
 * • String → char array conversion
 * • Nested loops
 * • Character comparison
 * • Frequency counting
 *
 * Example:
 * Input  : banana
 * Output :
 * b = 1
 * a = 3
 * n = 2
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class CharacterFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            int count = 1;

            if (arr[i] == '*')
                continue;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '*';
                }
            }

            System.out.println(arr[i] + " = " + count);
        }

        sc.close();
    }
}

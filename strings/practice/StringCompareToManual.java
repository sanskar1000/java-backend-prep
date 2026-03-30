package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringCompareToManual
 * Topic        : String Algorithms
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program manually implements String.compareTo()
 * using lexicographical comparison.
 *
 * Rules:
 * • Compare characters using Unicode values
 * • First mismatch determines result
 * • If equal → shorter string is smaller
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringCompareToManual {

    public static int compare(String str1, String str2) {

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }

        return str1.length() - str2.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string1: ");
        String str1 = sc.nextLine().trim();

        System.out.print("Enter string2: ");
        String str2 = sc.nextLine().trim();

        int result = compare(str1, str2);

        System.out.println("Result: " + result);

        if (result < 0) {
            System.out.println("String1 comes before String2");
        } else if (result > 0) {
            System.out.println("String1 comes after String2");
        } else {
            System.out.println("Both strings are equal");
        }

        sc.close();
    }
}

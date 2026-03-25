package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DigitOnlyChecker
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given string contains
 * only digit characters (0–9).
 *
 * It iterates through each character and verifies
 * using Character.isDigit().
 *
 * Key Concepts:
 * • String traversal
 * • Character validation
 *
 * Example:
 * Input  : 12345
 * Output : String contains only digits
 *
 * Input  : 12a45
 * Output : String contains non-digit characters
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DigitOnlyChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty()) {
            System.out.println("Empty string");
            return;
        }

        boolean isDigitOnly = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                isDigitOnly = false;
                break;
            }
        }

        if (isDigitOnly) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String contains non-digit characters");
        }

        sc.close();
    }
}

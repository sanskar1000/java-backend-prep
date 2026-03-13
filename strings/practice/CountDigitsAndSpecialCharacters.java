package strings.practice;
/**
 * ------------------------------------------------------------
 * Program Name : CountDigitsAndSpecialCharacters
 * Topic        : Java Strings
 *
 * Problem:
 * Count the number of digits and special characters in a string.
 *
 * Logic:
 * 1. Take string input from the user.
 * 2. Traverse each character using a loop.
 * 3. If character is between '0' and '9', increase digit counter.
 * 4. If character is not a letter, digit, or space, count it as a special character.
 *
 * Example Input:
 * Java@123!
 *
 * Output:
 * Digits : 3
 * Special Characters : 2
 *
 * Time Complexity:
 * O(n)
 *
 * Space Complexity:
 * O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class CountDigitsAndSpecialCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int digitCount = 0;
        int specialCharacterCount = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
            else if (!Character.isLetterOrDigit(ch) && ch != ' ') {
                specialCharacterCount++;
            }
        }

        System.out.println("Digits: " + digitCount);
        System.out.println("Special Characters: " + specialCharacterCount);

        sc.close();
    }
}

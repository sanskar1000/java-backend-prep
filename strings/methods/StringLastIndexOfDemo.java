package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringLastIndexOfDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of lastIndexOf() method to find the
 * last occurrence of a character or substring in a string.
 *
 * Key Concept:
 * • Returns last index position if found.
 * • Returns -1 if not found.
 * • Index starts from 0.
 *
 * Example:
 * Input String : Java Programming Java
 * Search Word  : Java
 * Output       : Last occurrence at index 17
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringLastIndexOfDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring to search: ");
        String subStr = sc.nextLine();

        int index = mainStr.lastIndexOf(subStr);

        if (index != -1) {
            System.out.println("Last occurrence at index: " + index);
        } else {
            System.out.println("Substring not found");
        }

        sc.close();
    }
}

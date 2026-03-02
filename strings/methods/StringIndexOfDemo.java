package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringIndexOfDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of indexOf() method to find the
 * first occurrence of a character or substring in a string.
 *
 * Key Concept:
 * • Returns index position if found.
 * • Returns -1 if not found.
 * • Index starts from 0.
 *
 * Example:
 * Input String : Java Backend
 * Search Word  : Back
 * Output       : Found at index 5
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StringIndexOfDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring to search: ");
        String subStr = sc.nextLine();

        int index = mainStr.indexOf(subStr);

        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }

        sc.close();
    }
}

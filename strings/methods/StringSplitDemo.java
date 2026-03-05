package strings.methods;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringSplitDemo
 * Topic        : Java Strings
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the use of split() method to divide
 * a string into multiple parts using a delimiter.
 *
 * Key Concept:
 * • split(String regex)
 * • Returns an array of strings
 * • Common delimiters: space, comma, colon, dash
 *
 * Example:
 * Input  : Java,Python,C++
 * Output :
 * Java
 * Python
 * C++
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter words separated by comma: ");
        String input = sc.nextLine();

        // Splitting string using comma delimiter
        String[] words = input.split(",");

        System.out.println("After split():");

        for (String word : words) {
            System.out.println(word);
        }

        sc.close();
    }
}

package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StringPermutations
 * Topic        : Recursion / Backtracking
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program generates all permutations of a given string
 * using recursion and backtracking.
 *
 * It selects each character and recursively permutes
 * the remaining substring.
 *
 * Note:
 * This implementation does not handle duplicate characters.
 *
 * Key Concepts:
 * • Recursion
 * • Backtracking
 * • String manipulation
 *
 * Example:
 * Input  : abc
 * Output : abc acb bac bca cab cba
 *
 * Time Complexity  : O(n! * n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StringPermutations {

    static void permute(String str, String ans) {

        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining = str.substring(0, i) + str.substring(i + 1);

            permute(remaining, ans + ch);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        permute(str, "");

        sc.close();
    }
}

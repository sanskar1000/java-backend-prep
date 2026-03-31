package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PangramChecker
 * Topic        : String Algorithms
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given string
 * is a pangram (contains all 26 English letters).
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PangramChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine().trim().toLowerCase();

        if (str.isEmpty()) {
            System.out.println("Invalid string ❌");
            return;
        }

        boolean[] seen = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                int index = ch - 'a';

                if (!seen[index]) {
                    seen[index] = true;
                    count++;
                }

                if (count == 26) break;
            }
        }

        if (count == 26) {
            System.out.println("String is a Pangram ✔");
        } else {
            System.out.println("String is NOT a Pangram ❌");
        }

        sc.close();
    }
}

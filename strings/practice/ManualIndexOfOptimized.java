package strings.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ManualIndexOfOptimized
 * Topic        : String Algorithms
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program implements String.indexOf() manually
 * using an optimized naive approach.
 *
 * Optimization:
 * • First character match check before full comparison
 *
 * Returns:
 * • Index of first occurrence
 * • -1 if not found
 *
 * Time Complexity  : O(n * m)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ManualIndexOfOptimized {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.nextLine().trim();

        System.out.print("Enter substring: ");
        String pattern = sc.nextLine();

        if (pattern.isEmpty()) {
            System.out.println("Index: 0");
            return;
        }

        int index = -1;

        for (int i = 0; i <= text.length() - pattern.length(); i++) {

            if (text.charAt(i) == pattern.charAt(0)) {

                boolean match = true;

                for (int j = 0; j < pattern.length(); j++) {

                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    index = i;
                    break;
                }
            }
        }

        System.out.println("Index: " + index);

        sc.close();
    }
}

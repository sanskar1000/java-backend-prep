package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RightAlignedInvertedTriangle
 * Topic        : Pattern Printing (Spaces + Stars)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a right-aligned inverted triangle pattern.
 *
 * Example:
 * Input  : 4
 * Output :
 * * * * *
 *   * * *
 *     * *
 *       *
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RightAlignedInvertedTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int s = 1; s <= i - 1; s++) {
                System.out.print("  "); // double space for alignment
            }

            // stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}

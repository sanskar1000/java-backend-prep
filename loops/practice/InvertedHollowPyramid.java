package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : InvertedHollowPyramid
 * Topic        : Pattern Printing (Advanced Star Pattern)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints an inverted hollow pyramid pattern.
 *
 * Example:
 * Input  : 5
 * Output :
 * *********
 *  *     *
 *   *   *
 *    * *
 *     *
 *
 * Logic:
 * - Total width = (2 * n - 1)
 * - Use left and right boundary indices
 * - Print '*' when:
 *      • First row (full)
 *      • Current position is left boundary
 *      • Current position is right boundary
 * - Else print space
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class InvertedHollowPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int width = 2 * n - 1;

        for (int i = n; i >= 1; i--) {

            int left = n - i + 1;
            int right = n + i - 1;

            for (int col = 1; col <= width; col++) {

                if (i == n || col == left || col == right) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}

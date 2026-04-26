package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : HollowDiamondPattern
 * Topic        : Pattern Printing (Advanced Star Pattern)
 * Level        : Intermediate → Advanced
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a hollow diamond pattern using '*' characters.
 *
 * Example:
 * Input  : 5
 * Output :
 *     *
 *    * *
 *   *   *
 *  *     *
 * *********
 *  *     *
 *   *   *
 *    * *
 *     *
 *
 * Logic:
 * - Combine normal and inverted hollow pyramids
 * - Use width = (2 * i - 1)
 * - Print '*' on boundaries and full middle row
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class HollowDiamondPattern {

    public static void printRow(int i, int n, boolean isBase) {

        // spaces
        for (int s = i; s <= n - 1; s++) {
            System.out.print(" ");
        }

        int width = 2 * i - 1;

        // stars
        for (int col = 1; col <= width; col++) {

            if (col == 1 || col == width || isBase) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        // Upper half
        for (int i = 1; i <= num; i++) {
            printRow(i, num, i == num);
        }

        // Lower half
        for (int i = num - 1; i >= 1; i--) {
            printRow(i, num, false);
        }

        sc.close();
    }
}

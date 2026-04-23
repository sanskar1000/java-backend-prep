package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : InvertedCenteredPyramid
 * Topic        : Pattern Printing (Symmetry)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints an inverted centered pyramid pattern.
 *
 * Example:
 * Input  : 4
 * Output :
 * * * * * * *
 *  * * * * *
 *   * * *
 *    *
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class InvertedCenteredPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        for (int i = n; i >= 1; i--) {

            // spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}

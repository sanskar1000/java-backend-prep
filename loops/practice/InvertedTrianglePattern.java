package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : InvertedTrianglePattern
 * Topic        : Nested Loops / Pattern Printing
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints an inverted right triangle
 * star pattern.
 *
 * Example:
 * Input  : 4
 * Output :
 * * * * *
 * * * *
 * * *
 * *
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class InvertedTrianglePattern {

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
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

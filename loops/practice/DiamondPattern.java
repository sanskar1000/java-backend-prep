package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DiamondPattern
 * Topic        : Pattern Printing (Symmetry)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a full diamond pattern using stars.
 *
 * Example:
 * Input  : 4
 * Output :
 *       *
 *      ***
 *     *****
 *    *******
 *     *****
 *      ***
 *       *
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DiamondPattern {

    // reusable method
    static void printRow(int spaces, int stars) {
        for (int s = 1; s <= spaces; s++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= stars; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        // upper part
        for (int i = 1; i <= n; i++) {
            printRow(n - i, 2 * i - 1);
        }

        // lower part
        for (int i = n - 1; i >= 1; i--) {
            printRow(n - i, 2 * i - 1);
        }

        sc.close();
    }
}

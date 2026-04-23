package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ReverseFloydsTriangle
 * Topic        : Pattern Printing (Number Patterns)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a reverse Floyd’s Triangle where
 * numbers in each row are printed in decreasing order.
 *
 * Example:
 * Input  : 4
 * Output :
 * 1
 * 3 2
 * 6 5 4
 * 10 9 8 7
 *
 * Logic:
 * - Maintain a running start value
 * - For each row i:
 *      Start from (start + i - 1) and go down to start
 * - Update start after each row
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ReverseFloydsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int start = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = start + i - 1; j >= start; j--) {
                System.out.print(j + " ");
            }

            start += i;
            System.out.println();
        }

        sc.close();
    }
}

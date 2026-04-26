package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : HollowPyramidPattern
 * Topic        : Pattern Printing (Advanced Star Pattern)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a hollow pyramid pattern using '*' characters.
 *
 * Example:
 * Input  : 5
 * Output :
 *     *
 *    * *
 *   *   *
 *  *     *
 * *********
 *
 * Logic:
 * - Print leading spaces for alignment
 * - Width of each row = (2 * i - 1)
 * - Print '*' only on:
 *      • First column
 *      • Last column
 *      • Last row
 * - Print space elsewhere
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class HollowPyramidPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        for (int i = 1; i <= num; i++) {

            // 🔹 Print leading spaces
            for (int s = i; s <= num - 1; s++) {
                System.out.print(" ");
            }

            int width = 2 * i - 1;

            // 🔹 Print pattern
            for (int col = 1; col <= width; col++) {

                if (col == 1 || col == width || i == num) {
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

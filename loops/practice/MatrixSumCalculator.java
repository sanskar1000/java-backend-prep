package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MatrixSumCalculator
 * Topic        : 2D Arrays / Nested Loops
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the sum of all elements
 * in a matrix of size rows × columns.
 *
 * Note:
 * No extra array storage is used (space optimized).
 *
 * Example:
 * Input:
 * 2 2
 * 1 2
 * 3 4
 *
 * Output:
 * Sum = 10
 *
 * Time Complexity  : O(row × column)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MatrixSumCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int column = sc.nextInt();

        if (row <= 0 || column <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int sum = 0;

        System.out.println("Enter elements row-wise:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int value = sc.nextInt();
                sum += value;
            }
        }

        System.out.println("✔ Sum of all elements = " + sum);

        sc.close();
    }
}

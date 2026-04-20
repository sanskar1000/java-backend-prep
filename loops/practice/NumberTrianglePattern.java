package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : NumberTrianglePattern
 * Topic        : Pattern Printing (Numbers)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a number triangle pattern where
 * each row contains the same number repeated.
 *
 * Example:
 * Input  : 4
 * Output :
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class NumberTrianglePattern {

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
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

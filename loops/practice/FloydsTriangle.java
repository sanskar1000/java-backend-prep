package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FloydsTriangle
 * Topic        : Pattern Printing (Number Patterns)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints Floyd's Triangle where numbers
 * are printed in a continuous increasing sequence.
 *
 * Example:
 * Input  : 4
 * Output :
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class FloydsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int value = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%-4d", value++); // aligned output
            }
            System.out.println();
        }

        sc.close();
    }
}

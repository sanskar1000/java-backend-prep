package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RightTrianglePattern
 * Topic        : Nested Loops / Pattern Printing
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a left-aligned right triangle
 * star pattern based on the number of rows.
 *
 * Example:
 * Input  : 4
 * Output :
 * *
 * * *
 * * * *
 * * * * *
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RightTrianglePattern {

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
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}

package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MatrixSequentialPrint
 * Topic        : Nested Loops (2D Matrix Pattern)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a matrix of given rows and columns,
 * filling it with sequential numbers starting from 1.
 *
 * Example:
 * Input  : rows = 2, columns = 3
 * Output :
 *   1   2   3
 *   4   5   6
 *
 * Time Complexity  : O(row × column)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MatrixSequentialPrint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = sc.nextInt();

        System.out.print("Enter columns: ");
        int column = sc.nextInt();

        if (row <= 0 || column <= 0) {
            System.out.println("❌ Invalid rows or columns");
            sc.close();
            return;
        }

        int value = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.printf("%4d", value);
                value++;
            }
            System.out.println();
        }

        sc.close();
    }
}

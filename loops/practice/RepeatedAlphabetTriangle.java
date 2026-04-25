package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : RepeatedAlphabetTriangle
 * Topic        : Pattern Printing (Characters)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a triangle pattern where each row
 * contains the same alphabet repeated.
 *
 * The alphabet increases with each row.
 *
 * Example:
 * Input  : 4
 * Output :
 * A
 * B B
 * C C C
 * D D D D
 *
 * Logic:
 * - Outer loop controls rows
 * - Inner loop prints same character i times
 * - Character increments after each row
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RepeatedAlphabetTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        char ch = 'A';

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            ch++; // move to next alphabet
            System.out.println();
        }

        sc.close();
    }
}

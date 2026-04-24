package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ContinuousAlphabetTriangle
 * Topic        : Pattern Printing (Characters)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a triangle pattern using continuous
 * uppercase alphabets without resetting each row.
 *
 * Example:
 * Input  : 4
 * Output :
 * A
 * B C
 * D E F
 * G H I J
 *
 * Logic:
 * - Use a character variable starting from 'A'
 * - Keep incrementing it globally across rows
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ContinuousAlphabetTriangle {

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
                System.out.print(ch++ + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

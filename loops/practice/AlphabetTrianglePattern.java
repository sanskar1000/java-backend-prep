package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AlphabetTrianglePattern
 * Topic        : Pattern Printing (Characters)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a triangle pattern using uppercase
 * English alphabets starting from 'A'.
 *
 * Each row starts from 'A' and prints characters sequentially.
 *
 * Example:
 * Input  : 4
 * Output :
 * A
 * A B
 * A B C
 * A B C D
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class AlphabetTrianglePattern {

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

            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : NumberButterflyPattern
 * Topic        : Pattern Printing (Numeric Symmetry Pattern)
 * Level        : Intermediate → Advanced
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a symmetric butterfly pattern using numbers.
 *
 * Example:
 * Input  : 5
 * Output :
 * 1        1
 * 12      21
 * 123    321
 * 1234  4321
 * 1234554321
 * 1234  4321
 * 123    321
 * 12      21
 * 1        1
 *
 * Logic:
 * - Left side: increasing numbers (1 → i)
 * - Spaces: 2 * (n - i)
 * - Right side: decreasing numbers (i → 1)
 * - Lower half mirrors the upper half
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class NumberButterflyPattern {

    public static void printRow(int i, int n) {

        int value = 1;

        // Left side (increasing)
        for (int j = 1; j <= i; j++) {
            System.out.print(value++);
        }

        // Spaces
        for (int s = 1; s <= 2 * (n - i); s++) {
            System.out.print(" ");
        }

        // Right side (decreasing)
        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        // Upper half
        for (int i = 1; i <= num; i++) {
            printRow(i, num);
        }

        // Lower half
        for (int i = num - 1; i >= 1; i--) {
            printRow(i, num);
        }

        sc.close();
    }
}

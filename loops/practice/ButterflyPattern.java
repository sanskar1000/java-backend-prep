package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ButterflyPattern
 * Topic        : Pattern Printing (Advanced Star Pattern)
 * Level        : Intermediate → Advanced
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a butterfly pattern using '*' characters.
 *
 * Example:
 * Input  : 5
 * Output :
 * *        *
 * **      **
 * ***    ***
 * ****  ****
 * **********
 * ****  ****
 * ***    ***
 * **      **
 * *        *
 *
 * Logic:
 * - Upper half: increase stars, decrease spaces
 * - Lower half: mirror of upper half
 * - Spaces = 2 * (n - i)
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ButterflyPattern {

    // 🔹 Helper method to print one row
    public static void printRow(int i, int n) {

        // Left stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }

        // Spaces
        for (int s = 1; s <= 2 * (n - i); s++) {
            System.out.print(" ");
        }

        // Right stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
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

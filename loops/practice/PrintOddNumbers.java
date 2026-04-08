package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PrintOddNumbers
 * Topic        : Loops (for loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints all odd numbers from 1 to N.
 *
 * Logic:
 * • Start from 1
 * • Increment by 2 each time
 *
 * Input:
 * • A positive integer N
 *
 * Output:
 * • Odd numbers from 1 to N
 *
 * Time Complexity  : O(n/2) ≈ O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrintOddNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Please enter a positive number");
            sc.close();
            return;
        }

        System.out.println("✔ Odd numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        sc.close();
    }
}

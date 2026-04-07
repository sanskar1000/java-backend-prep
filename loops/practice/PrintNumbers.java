package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PrintNumbers
 * Topic        : Loops (for loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints numbers from 1 to N
 * using a for loop.
 *
 * Input:
 * • A positive integer N
 *
 * Output:
 * • Numbers from 1 to N
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrintNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Input validation
        if (n <= 0) {
            System.out.println("❌ Please enter a positive number");
            sc.close();
            return;
        }

        System.out.println("✔ Numbers from 1 to " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}

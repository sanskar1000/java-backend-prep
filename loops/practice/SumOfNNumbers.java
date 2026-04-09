package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SumOfNNumbers
 * Topic        : Loops (for loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the sum of first N natural numbers.
 *
 * Formula:
 * • Sum = 1 + 2 + 3 + ... + N
 *
 * Example:
 * Input  : 5
 * Output : 15
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SumOfNNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("❌ Invalid number");
            sc.close();
            return;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("✔ Sum of first " + n + " natural numbers = " + sum);

        sc.close();
    }
}

package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FactorialCalculator
 * Topic        : Loops (for loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the factorial of a number.
 *
 * Factorial:
 * n! = n × (n-1) × ... × 1
 *
 * Special Case:
 * • 0! = 1
 *
 * Limit:
 * • Works correctly up to n = 20 (due to long overflow)
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class FactorialCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("❌ Invalid number");
            sc.close();
            return;
        }

        if (n > 20) {
            System.out.println("❌ Number too large (overflow risk)");
            sc.close();
            return;
        }

        long fact = 1;

        for (int i = 2; i <= n; i++) {
            fact *= i;
        }

        System.out.println("✔ Factorial of " + n + " = " + fact);

        sc.close();
    }
}

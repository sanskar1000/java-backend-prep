package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : FibonacciUpToN
 * Topic        : Loops (while loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints the Fibonacci sequence
 * up to a given number N.
 *
 * Fibonacci Series:
 * • Each number is the sum of the previous two
 * • Starts from 0 and 1
 *
 * Example:
 * Input  : 10
 * Output : 0 1 1 2 3 5 8
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class FibonacciUpToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("❌ Invalid number");
            sc.close();
            return;
        }

        int a = 0, b = 1;

        System.out.print("✔ Fibonacci series: ");

        while (a <= num) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}

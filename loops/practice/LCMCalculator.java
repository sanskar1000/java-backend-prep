package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LCMCalculator
 * Topic        : Loops (while loop, Euclidean Algorithm)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the LCM (Least Common Multiple)
 * of two numbers using the Euclidean Algorithm.
 *
 * Formula:
 * • LCM × GCD = num1 × num2
 *
 * Logic:
 * • First find GCD using Euclidean algorithm
 * • Then compute LCM using formula
 *
 * Example:
 * Input  : 12, 18
 * Output : 36
 *
 * Time Complexity  : O(log n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LCMCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number (1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter number (2): ");
        int num2 = sc.nextInt();

        if (num1 < 1 || num2 < 1) {
            System.out.println("❌ Invalid numbers");
            sc.close();
            return;
        }

        int a = num1;
        int b = num2;

        // Euclidean Algorithm for GCD
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        long lcm = (long) num1 * num2 / a;

        System.out.println("✔ LCM of two numbers = " + lcm);

        sc.close();
    }
}

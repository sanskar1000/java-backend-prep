package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LCMOfThreeNumbers
 * Topic        : Loops (Euclidean Algorithm)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the LCM of three numbers
 * using GCD (Euclidean Algorithm).
 *
 * Formula:
 * • LCM(a, b) = (a × b) / GCD(a, b)
 * • LCM(a, b, c) = LCM(LCM(a, b), c)
 *
 * Time Complexity  : O(log n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LCMOfThreeNumbers {

    // Function to compute GCD using Euclidean Algorithm
    public static long gcd(long x, long y) {
        while (y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number (1): ");
        int num1 = sc.nextInt();

        System.out.print("Enter number (2): ");
        int num2 = sc.nextInt();

        System.out.print("Enter number (3): ");
        int num3 = sc.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("❌ Invalid numbers");
            sc.close();
            return;
        }

        long lcm12 = (long) num1 * num2 / gcd(num1, num2);
        long lcm = (lcm12 * num3) / gcd(lcm12, num3);

        System.out.println("✔ LCM of three numbers = " + lcm);

        sc.close();
    }
}

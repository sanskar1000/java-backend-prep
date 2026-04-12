package loops.practice;

import java.util.Scanner;
import static java.lang.Math.min;

/**
 * ------------------------------------------------------------
 * Program Name : GCDCalculator
 * Topic        : Loops (for loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the GCD (HCF) of two numbers
 * using brute-force approach.
 *
 * Logic:
 * • Start from min(num1, num2)
 * • Check divisibility for both numbers
 * • First common divisor is GCD
 *
 * Example:
 * Input  : 12, 18
 * Output : 6
 *
 * Time Complexity  : O(min(n1, n2))
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class GCDCalculator {

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

        for (int i = min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("✔ GCD = " + i);
                break;
            }
        }

        sc.close();
    }
}

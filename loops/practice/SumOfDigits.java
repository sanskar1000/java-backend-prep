package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SumOfDigits
 * Topic        : Loops (while loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the sum of digits of a given number.
 *
 * Logic:
 * • Extract each digit using % 10
 * • Add it to sum
 * • Remove digit using / 10
 *
 * Example:
 * Input  : 1234
 * Output : 10
 *
 * Time Complexity  : O(log₁₀ n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("❌ Invalid number");
            sc.close();
            return;
        }

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }

        System.out.println("✔ Sum of digits of " + n + " = " + sum);

        sc.close();
    }
}

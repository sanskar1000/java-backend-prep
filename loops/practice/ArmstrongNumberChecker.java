package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ArmstrongNumberChecker
 * Topic        : Loops (while loop)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is an Armstrong number.
 *
 * An Armstrong number is a number that is equal to the sum
 * of its digits raised to the power of the number of digits.
 *
 * Example:
 * Input  : 153
 * Output : Armstrong number
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ArmstrongNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("❌ Invalid number");
            sc.close();
            return;
        }

        int original = num;
        int temp = num;
        int digits = 0;

        // Count digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        long sum = 0;
        temp = num;

        // Calculate Armstrong sum
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (num == sum) {
            System.out.println("✔ Armstrong number");
        } else {
            System.out.println("❌ Not an Armstrong number");
        }

        sc.close();
    }
}

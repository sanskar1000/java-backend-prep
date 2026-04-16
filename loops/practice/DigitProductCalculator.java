package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DigitProductCalculator
 * Topic        : Loops (while loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the product of digits of a number.
 *
 * Note:
 * • If any digit is 0, the product becomes 0
 *
 * Example:
 * Input  : 234
 * Output : 24
 *
 * Input  : 203
 * Output : 0
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DigitProductCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("❌ Invalid number");
            sc.close();
            return;
        }

        if (num == 0) {
            System.out.println("✔ Product of digits = 0");
            sc.close();
            return;
        }

        int product = 1;
        int temp = num;

        while (temp != 0) {
            int digit = temp % 10;

            if (digit == 0) {
                product = 0;
                break;
            }

            product *= digit;
            temp /= 10;
        }

        System.out.println("✔ Product of digits = " + product);

        sc.close();
    }
}

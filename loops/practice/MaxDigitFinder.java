package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MaxDigitFinder
 * Topic        : Loops (while loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the largest digit in a given number.
 *
 * Logic:
 * • Extract digits using modulo (% 10)
 * • Compare each digit with current maximum
 * • Update maximum accordingly
 *
 * Example:
 * Input  : 5392
 * Output : 9
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MaxDigitFinder {

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
            System.out.println("✔ Max digit = 0");
            sc.close();
            return;
        }

        int max = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit > max) {
                max = digit;
            }
            num /= 10;
        }

        System.out.println("✔ Max digit = " + max);

        sc.close();
    }
}

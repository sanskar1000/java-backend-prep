package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : EvenOddDigitCounter
 * Topic        : Loops (while loop)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts the number of even and odd digits
 * in a given number.
 *
 * Logic:
 * • Extract digits using modulo (% 10)
 * • Check if digit is even or odd
 * • Maintain separate counters
 *
 * Example:
 * Input  : 1234
 * Output : Even digits = 2, Odd digits = 2
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class EvenOddDigitCounter {

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
            System.out.println("✔ Even digits = 1");
            System.out.println("✔ Odd digits = 0");
            sc.close();
            return;
        }

        int evenCount = 0;
        int oddCount = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            num /= 10;
        }

        System.out.println("✔ Even digits = " + evenCount);
        System.out.println("✔ Odd digits = " + oddCount);

        sc.close();
    }
}

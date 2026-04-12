package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SumOfPrimeNumbers
 * Topic        : Loops (Nested Loop)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the sum of all prime numbers from 1 to N.
 *
 * Optimization:
 * • Skip even numbers
 * • Check divisibility up to √num
 *
 * Example:
 * Input  : 10
 * Output : 17 (2 + 3 + 5 + 7)
 *
 * Time Complexity  : ~O(n √n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SumOfPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number (n): ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("❌ No prime numbers in this range");
            sc.close();
            return;
        }

        int sum = 2; // first prime

        for (int num = 3; num <= n; num += 2) {

            boolean isPrime = true;

            for (int i = 3; i * i <= num; i += 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum += num;
            }
        }

        System.out.println("✔ Sum of prime numbers from 1 to " + n + " = " + sum);

        sc.close();
    }
}

package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PrimeNumbersInRange
 * Topic        : Loops (Nested Loop)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints all prime numbers from 1 to N.
 *
 * Logic:
 * • For each number from 2 to N:
 *     - Check divisibility up to √num
 *     - If no divisor found → prime
 *
 * Example:
 * Input  : 10
 * Output : 2 3 5 7
 *
 * Time Complexity  : O(n √n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrimeNumbersInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("❌ No prime numbers in this range");
            sc.close();
            return;
        }

        System.out.println("✔ Prime numbers from 1 to " + n + ":");

        for (int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}

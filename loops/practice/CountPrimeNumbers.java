package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CountPrimeNumbers
 * Topic        : Loops (Nested Loop)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts the total number of prime numbers
 * from 1 to N.
 *
 * Logic:
 * • For each number from 2 to N:
 *     - Check divisibility up to √num
 *     - If prime → increment count
 *
 * Example:
 * Input  : 10
 * Output : 4 (2, 3, 5, 7)
 *
 * Time Complexity  : O(n √n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CountPrimeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("❌ No prime numbers in this range");
            sc.close();
            return;
        }

        int count = 0;

        for (int num = 2; num <= n; num++) {

            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("✔ Total prime numbers from 1 to " + n + " = " + count);

        sc.close();
    }
}

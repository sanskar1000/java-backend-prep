package loops.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PrimeNumberChecker
 * Topic        : Loops (for loop)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number is prime.
 *
 * A prime number is a number greater than 1
 * that has no divisors other than 1 and itself.
 *
 * Optimization:
 * • Check divisibility only up to √n
 *
 * Example:
 * Input  : 7
 * Output : Prime
 *
 * Time Complexity  : O(√n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("❌ Not a prime number");
            sc.close();
            return;
        }

        boolean isPrime = true;

        // Optimized loop: check till sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("✔ " + n + " is a prime number");
        } else {
            System.out.println("❌ " + n + " is not a prime number");
        }

        sc.close();
    }
}

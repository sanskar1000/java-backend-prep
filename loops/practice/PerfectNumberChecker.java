package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PerfectNumberChecker
 * Topic        : Number Theory (Divisors)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is a Perfect number.
 *
 * A Perfect number is a number whose sum of proper divisors
 * (excluding itself) is equal to the number.
 *
 * Example:
 * 6  → 1 + 2 + 3 = 6
 * 28 → 1 + 2 + 4 + 7 + 14 = 28
 *
 * Logic:
 * - Start sum = 1
 * - Iterate from 2 to √n
 * - If i divides n:
 *      add i and n/i
 * - Avoid double counting when i == n/i
 *
 * Time Complexity  : O(√n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PerfectNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("❌ Not a Perfect number");
            sc.close();
            return;
        }

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;

                if (i != num / i) {
                    sum += num / i;
                }
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect number");
        } else {
            System.out.println(num + " is not a Perfect number");
        }

        sc.close();
    }
}

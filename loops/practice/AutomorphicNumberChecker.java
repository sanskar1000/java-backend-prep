package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AutomorphicNumberChecker
 * Topic        : Number Theory (Digit Comparison)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is an Automorphic number.
 *
 * An Automorphic number is a number whose square ends
 * with the same digits as the number itself.
 *
 * Example:
 * 5  → 25
 * 6  → 36
 * 76 → 5776
 *
 * Logic:
 * - Compute square of number
 * - Compare digits from right (LSD)
 * - If all digits match → Automorphic
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class AutomorphicNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int temp = num;
        long square = (long) num * num;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                System.out.println(num + " is not an Automorphic number");
                sc.close();
                return;
            }
            temp /= 10;
            square /= 10;
        }

        System.out.println(num + " is an Automorphic number");

        sc.close();
    }
}

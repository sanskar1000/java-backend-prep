package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : StrongNumberChecker
 * Topic        : Number Theory (Factorial + Digits)
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is a Strong number.
 *
 * A Strong number is a number whose sum of factorial of digits
 * is equal to the original number.
 *
 * Example:
 * 145 → 1! + 4! + 5! = 145
 *
 * Logic:
 * - Extract each digit
 * - Add factorial of digit
 * - Compare sum with original number
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class StrongNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int original = num;
        int sum = 0;

        // Precomputed factorials (0–9)
        int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

        while (num != 0) {
            int digit = num % 10;
            sum += fact[digit];
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number");
        } else {
            System.out.println(original + " is not a Strong number");
        }

        sc.close();
    }
}

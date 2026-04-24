package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PowerCalculator
 * Topic        : Loops / Math
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates a raised to the power b (a^b)
 * using an optimized approach (Exponentiation by Squaring).
 *
 * Example:
 * Input  : a = 2, b = 5
 * Output : 32
 *
 * Time Complexity  : O(log b)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PowerCalculator {

    public static long power(int a, int b) {
        long result = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                result *= a;
            }
            a *= a;
            b /= 2;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (a): ");
        int a = sc.nextInt();

        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();

        if (b < 0) {
            System.out.println("❌ Negative exponent not supported");
            sc.close();
            return;
        }

        long result = power(a, b);

        System.out.println("✔ Result (a^b) = " + result);

        sc.close();
    }
}

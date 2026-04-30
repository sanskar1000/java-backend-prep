package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : HarmonicSeriesSum
 * Topic        : Series & Mathematical Computation
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the sum of the harmonic series:
 *
 * H(n) = 1 + 1/2 + 1/3 + ... + 1/n
 *
 * Example:
 * Input  : 5
 * Output : 2.283
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class HarmonicSeriesSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("Sum of harmonic series up to %d = %.3f%n", n, sum);

        sc.close();
    }
}

package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DecimalToBinaryConverter
 * Topic        : Number System Conversion
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Converts a decimal number (base 10)
 * into its binary representation (base 2).
 *
 * Logic:
 * - Divide number by 2 repeatedly
 * - Store remainders using positional multiplier
 *
 * Time Complexity  : O(log n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DecimalToBinaryConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        if (num == 0) {
            System.out.println("Binary representation: 0");
            sc.close();
            return;
        }

        long binary = 0;
        long place = 1;

        while (num > 0) {
            int bit = num % 2;
            binary += bit * place;
            place *= 10;
            num /= 2;
        }

        System.out.println("Binary representation: " + binary);

        sc.close();
    }
}

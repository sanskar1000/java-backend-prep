package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : BinaryToDecimalConverter
 * Topic        : Number System Conversion
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program converts a binary number (base 2)
 * into its decimal equivalent (base 10).
 *
 * Example:
 * Input  : 1011
 * Output : 11
 *
 * Logic:
 * - Extract digits from right
 * - Multiply each digit with base (2^position)
 * - Accumulate result
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class BinaryToDecimalConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int binary = sc.nextInt();

        if (binary < 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int base = 1;
        int decimal = 0;

        while (binary != 0) {
            int digit = binary % 10;

            if (digit != 0 && digit != 1) {
                System.out.println("❌ Invalid binary number");
                sc.close();
                return;
            }

            decimal += digit * base;
            base *= 2;
            binary /= 10;
        }

        System.out.println("Decimal equivalent: " + decimal);

        sc.close();
    }
}

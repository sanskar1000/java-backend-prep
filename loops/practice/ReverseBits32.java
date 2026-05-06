package loops.practice;
/**
 * ------------------------------------------------------------
 * Program Name : ReverseBits32
 * Topic        : Bit Manipulation
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program reverses the bits of a 32-bit integer.
 *
 * Each bit from the original number is extracted from
 * the right (LSB) and appended to the left of the result.
 *
 * Example:
 * Input  : 6  (000...0110)
 * Output : 1610612736 (0110...0000)
 *
 * Logic:
 * - Initialize result = 0
 * - Loop 32 times:
 *      • Left shift result
 *      • Add last bit of input (n & 1)
 *      • Right shift input
 *
 * Time Complexity  : O(32) → O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class ReverseBits32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int reversed = 0;

        // 🔹 Reverse 32 bits
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;          // shift left
            reversed |= (num & 1);   // add last bit
            num >>= 1;               // shift input right
        }

        System.out.println("Reversed bits (decimal): " + reversed);

        sc.close();
    }
}

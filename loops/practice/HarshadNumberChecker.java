package loops.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : HarshadNumberChecker
 * Topic        : Number Theory (Digit Sum)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is a Harshad (Niven) number.
 *
 * A Harshad number is a number that is divisible by the sum of its digits.
 *
 * Example:
 * 18 → 1 + 8 = 9 → 18 % 9 = 0 ✔
 *
 * Time Complexity  : O(d)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class HarshadNumberChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ Invalid input");
            sc.close();
            return;
        }

        int temp = num;
        int sum = 0;

        // 🔹 Calculate sum of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        // 🔹 Check Harshad condition
        if (num % sum == 0) {
            System.out.println(num + " is a Harshad number");
        } else {
            System.out.println(num + " is not a Harshad number");
        }

        sc.close();
    }
}

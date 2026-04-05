package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PrimeCheckIfElseOnly
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is prime
 * using only if-else statements (no loops).
 *
 * Limitation:
 * • Works correctly only for small numbers
 * • Checks divisibility up to 7 only
 * • Not reliable for larger numbers
 *
 * Example:
 * Input  : 11 → Output: Prime (incorrect)
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PrimeCheckIfElseOnly {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("❌ Not Prime");
        } 
        else if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println("✔ Prime");
        } 
        else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            System.out.println("❌ Not Prime");
        } 
        else {
            System.out.println("⚠ Possibly Prime (not guaranteed)");
        }

        sc.close();
    }
}

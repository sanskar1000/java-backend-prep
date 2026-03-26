package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DivisibleBy3And5
 * Topic        : Nested if-else
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a number is divisible
 * by both 3 and 5 using nested if-else statements.
 *
 * Key Concepts:
 * • Modulus operator (%)
 * • Nested if-else
 *
 * Example:
 * Input  : 15
 * Output : Divisible by both 3 and 5
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DivisibleBy3And5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num % 3 == 0) {

            if (num % 5 == 0) {
                System.out.println("Divisible by both 3 and 5");
            } else {
                System.out.println("Divisible by 3 but not by 5");
            }

        } else {

            if (num % 5 == 0) {
                System.out.println("Divisible by 5 but not by 3");
            } else {
                System.out.println("Not divisible by 3 or 5");
            }
        }

        sc.close();
    }
}

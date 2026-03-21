package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : PositiveEvenNested
 * Topic        : Nested if-else
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number is
 * positive and even using nested if-else statements.
 *
 * Logic:
 * • First check if number is positive
 * • If positive → check if it is even
 *
 * Key Concepts:
 * • Nested if-else
 * • Modulus operator (%)
 *
 * Example:
 * Input  : 8
 * Output : Number is positive and even
 *
 * Input  : -4
 * Output : Number is not positive
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class PositiveEvenNested {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 0) {

            if (num % 2 == 0) {
                System.out.println("Number is positive and even");
            } else {
                System.out.println("Number is positive but odd");
            }

        } else {
            System.out.println("Number is not positive");
        }

        sc.close();
    }
}

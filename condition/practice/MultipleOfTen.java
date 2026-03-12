package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MultipleOfTen
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number is a multiple
 * of 10. A number is considered a multiple of 10 if it is
 * divisible by 10 with no remainder.
 *
 * Key Concepts:
 * • User input using Scanner
 * • Modulus operator (%)
 * • Conditional statements (if-else)
 *
 * Logic:
 * If num % 10 == 0 → number is a multiple of 10
 * Otherwise → number is not a multiple of 10
 *
 * Example:
 * Input  : 50
 * Output : Number is a multiple of 10
 *
 * Input  : 37
 * Output : Number is not a multiple of 10
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class MultipleOfTen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 10 == 0) {
            System.out.println("Number is a multiple of 10");
        } else {
            System.out.println("Number is not a multiple of 10");
        }

        sc.close();
    }
}

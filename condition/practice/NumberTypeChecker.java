package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : NumberTypeChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a given number entered by the
 * user is positive, negative, or zero.
 *
 * Key Concepts:
 * • User input using Scanner
 * • Conditional statements (if-else)
 * • Comparison operators
 *
 * Example:
 * Input  : 10
 * Output : Number is Positive
 *
 * Input  : -5
 * Output : Number is Negative
 *
 * Input  : 0
 * Output : Number is Zero
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class NumberTypeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        sc.close();
    }
}

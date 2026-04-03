package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MiddleOfThreeNumbers
 * Topic        : Conditional Statements
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the middle number among three integers.
 *
 * The middle number is the one that is neither maximum nor minimum.
 *
 * Approach:
 * • Check if a lies between b and c
 * • Else check if b lies between a and c
 * • Otherwise, c is the middle number
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

import java.util.Scanner;

public class MiddleOfThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int a = sc.nextInt();

        System.out.print("Enter number2: ");
        int b = sc.nextInt();

        System.out.print("Enter number3: ");
        int c = sc.nextInt();

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println("Middle number: " + a);
        } 
        else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println("Middle number: " + b);
        } 
        else {
            System.out.println("Middle number: " + c);
        }

        sc.close();
    }
}

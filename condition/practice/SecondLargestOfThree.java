package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SecondLargestOfThree
 * Topic        : Conditional Statements
 * Level        : Beginner / Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the second largest number
 * among three given numbers.
 *
 * Logic:
 * The second largest is the number that lies
 * between the other two.
 *
 * Key Concepts:
 * • if-else conditions
 * • logical operators
 *
 * Example:
 * Input  : 10, 20, 30
 * Output : Second largest = 20
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SecondLargestOfThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int second;

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            second = a;
        } 
        else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            second = b;
        } 
        else {
            second = c;
        }

        System.out.println("Second largest number: " + second);

        sc.close();
    }
}

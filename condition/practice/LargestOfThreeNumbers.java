package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : LargestOfThreeNumbers
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the largest number among three numbers
 * entered by the user.
 *
 * The program compares the numbers using conditional
 * statements (if-else) and prints the greatest value.
 *
 * Key Concepts:
 * • User input using Scanner
 * • Conditional statements (if-else if)
 * • Logical operators (&&)
 *
 * Example:
 * Input  : 10 25 15
 * Output : Greater number is : 25
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class LargestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Greatest number is : " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Greatest number is : " + num2);
        } else {
            System.out.println("Greatest number is : "+ num3);
        }
        sc.close();
    }
}

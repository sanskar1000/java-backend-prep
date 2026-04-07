package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : BasicCalculator
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program performs basic arithmetic operations
 * based on user input.
 *
 * Supported operations:
 * • Addition (+)
 * • Subtraction (-)
 * • Multiplication (*)
 * • Division (/)
 *
 * Special Case:
 * • Division by zero is handled
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter number2: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        boolean valid = true;

        if (op == '+') {
            result = num1 + num2;
        } 
        else if (op == '-') {
            result = num1 - num2;
        } 
        else if (op == '*') {
            result = num1 * num2;
        } 
        else if (op == '/') {
            if (num2 == 0) {
                System.out.println("❌ Cannot divide by zero");
                sc.close();
                return;
            }
            result = num1 / num2;
        } 
        else {
            System.out.println("❌ Invalid operator");
            valid = false;
            result = 0;
        }

        if (valid) {
            System.out.println("✔ Result: " + result);
        }

        sc.close();
    }
}

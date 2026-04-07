package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : QuadraticEquationSolver
 * Topic        : Mathematics / Conditional Logic
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program solves a quadratic equation of the form:
 *     ax² + bx + c = 0
 *
 * Based on discriminant (D = b² - 4ac):
 * • D > 0  → Two distinct real roots
 * • D = 0  → Equal real roots
 * • D < 0  → Complex roots
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class QuadraticEquationSolver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("❌ Not a quadratic equation");
            sc.close();
            return;
        }

        double D = b * b - 4 * a * c;
        double denom = 2 * a;

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / denom;
            double root2 = (-b - Math.sqrt(D)) / denom;

            System.out.println("✔ Two distinct real roots:");
            System.out.printf("Root1 = %.2f%n", root1);
            System.out.printf("Root2 = %.2f%n", root2);
        } 
        else if (Math.abs(D) < 1e-9) {
            double root = -b / denom;

            System.out.println("✔ Equal roots:");
            System.out.printf("Root = %.2f%n", root);
        } 
        else {
            double realPart = -b / denom;
            double imaginaryPart = Math.sqrt(-D) / denom;

            System.out.println("✔ Complex roots:");
            System.out.printf("Root1 = %.2f + %.2fi%n", realPart, imaginaryPart);
            System.out.printf("Root2 = %.2f - %.2fi%n", realPart, imaginaryPart);
        }

        sc.close();
    }
}

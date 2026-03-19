package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : BMICategoryCalculator
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates BMI (Body Mass Index) using
 * weight (kg) and height (feet), then determines the
 * BMI category.
 *
 * Formula:
 * BMI = weight / (height in meters)^2
 *
 * Categories:
 * • BMI < 18.5 → Underweight
 * • 18.5–24.9  → Normal
 * • 25–29.9    → Overweight
 * • ≥ 30       → Obese
 *
 * Key Concepts:
 * • Unit conversion (feet to meters)
 * • Mathematical calculations
 * • Conditional statements
 *
 * Example:
 * Input  : weight = 60, height = 5.7
 * Output : BMI = 20.69 → Normal
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class BMICategoryCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in Kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in feet: ");
        double height = sc.nextDouble();

        if (height <= 0 || weight <= 0) {
            System.out.println("Invalid input");
            return;
        }

        double meter = height * 0.3048;
        double bmi = weight / (meter * meter);

        System.out.printf("BMI = %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        sc.close();
    }
}

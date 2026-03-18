package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : IncomeTaxSlabChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program determines the income tax slab and
 * calculates the tax based on yearly salary.
 *
 * Tax Slabs:
 * • ≤ 2,50,000       → No tax
 * • 2,50,001–5,00,000 → 5%
 * • 5,00,001–10,00,000 → 20%
 * • > 10,00,000      → 30%
 *
 * Key Concepts:
 * • Conditional statements (if-else)
 * • Input validation
 * • Percentage calculation
 *
 * Example:
 * Input  : 600000
 * Output :
 * Tax Rate : 20%
 * Tax Amount : 120000.0
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class IncomeTaxSlabChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yearly salary: ");
        double salary = sc.nextDouble();

        double tax = 0;
        int rate = 0;

        if (salary < 0) {
            System.out.println("Invalid salary");
        } else if (salary <= 250000) {
            rate = 0;
            tax = 0;
        } else if (salary <= 500000) {
            rate = 5;
            tax = salary * 0.05;
        } else if (salary <= 1000000) {
            rate = 20;
            tax = salary * 0.20;
        } else {
            rate = 30;
            tax = salary * 0.30;
        }

        if (salary >= 0) {
            System.out.println("Tax Rate : " + rate + "%");
            System.out.println("Tax Amount : " + tax);
        }

        sc.close();
    }
}

package condition.pracrtice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DiscountCalculator
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates discount based on purchase amount
 * and displays the final payable amount.
 *
 * Discount Slabs:
 * • < 1000       → 0%
 * • 1000–4999    → 10%
 * • 5000–9999    → 20%
 * • ≥ 10000      → 30%
 *
 * Key Concepts:
 * • Conditional statements (if-else)
 * • Percentage calculation
 * • Input validation
 *
 * Example:
 * Input  : 6000
 * Output :
 * Discount Rate : 20%
 * Discount Amount : 1200.00
 * Final Amount : 4800.00
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Enter valid amount");
            return;
        }

        double discount = 0;
        int rate = 0;

        if (amount < 1000) {
            rate = 0;
        } else if (amount <= 4999) {
            rate = 10;
        } else if (amount <= 9999) {
            rate = 20;
        } else {
            rate = 30;
        }

        discount = amount * rate / 100;
        double total = amount - discount;

        System.out.println("Discount Rate : " + rate + "%");
        System.out.printf("Discount Amount : %.2f%n", discount);
        System.out.printf("Final Amount : %.2f%n", total);

        sc.close();
    }
}

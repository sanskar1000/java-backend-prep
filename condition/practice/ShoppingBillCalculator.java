package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ShoppingBillCalculator
 * Topic        : Conditional Statements
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates final shopping bill including:
 * • Discount based on purchase amount
 * • Tax (18% GST)
 *
 * Discount Rules:
 * • < 1000     → 0%
 * • 1000–4999  → 10%
 * • 5000–9999  → 20%
 * • ≥ 10000    → 30%
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ShoppingBillCalculator {

    public static double getDiscountRate(double amount) {
        if (amount < 1000) return 0.0;
        if (amount <= 4999) return 0.10;
        if (amount <= 9999) return 0.20;
        return 0.30;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();

        if (amount < 0) {
            System.out.println("Invalid amount ❌");
            return;
        }

        double discountRate = getDiscountRate(amount);
        double discount = amount * discountRate;
        double discountedPrice = amount - discount;
        double tax = discountedPrice * 0.18;
        double finalAmount = discountedPrice + tax;

        // Bill Output
        System.out.println("\n------ BILL SUMMARY ------");
        System.out.printf("Original Amount   : ₹%.2f\n", amount);
        System.out.printf("Discount (%.0f%%) : ₹%.2f\n", discountRate * 100, discount);
        System.out.printf("After Discount    : ₹%.2f\n", discountedPrice);
        System.out.printf("GST (18%%)         : ₹%.2f\n", tax);
        System.out.printf("Final Amount      : ₹%.2f\n", finalAmount);
        System.out.println("--------------------------");

        sc.close();
    }
}

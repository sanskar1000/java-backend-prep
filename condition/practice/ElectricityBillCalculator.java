package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ElectricityBillCalculator
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the electricity bill based on
 * units consumed using predefined slab rates.
 *
 * Slabs:
 * • ≤ 100 units      → ₹1.5 per unit
 * • 101 – 200 units  → ₹2.5 per unit
 * • 201 – 300 units  → ₹4.0 per unit
 * • > 300 units      → ₹6.0 per unit
 *
 * Key Concepts:
 * • Conditional statements (if-else)
 * • Real-world billing logic
 * • Input validation
 *
 * Example:
 * Input  : 250
 * Output : Total Bill = ₹1000.0
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if (units < 0) {
            System.out.println("Invalid units");
            return;
        }

        double rate;
        double bill;

        if (units <= 100) {
            rate = 1.5;
        } else if (units <= 200) {
            rate = 2.5;
        } else if (units <= 300) {
            rate = 4.0;
        } else {
            rate = 6.0;
        }

        bill = units * rate;

        System.out.println("Rate per unit: ₹" + rate);
        System.out.println("Total Bill: ₹" + bill);

        sc.close();
    }
}

package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MovieTicketPricing
 * Topic        : Conditional Statements
 * Level        : Beginner / Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program determines movie ticket price
 * based on age category.
 *
 * Categories:
 * • Child   (<5)   → Free
 * • Teen    (5-17) → ₹100
 * • Adult   (18-59)→ ₹200
 * • Senior  (60+)  → ₹120
 *
 * Key Concepts:
 * • if-else ladder
 * • Input validation
 * • Categorization logic
 *
 * Example:
 * Input  : 25
 * Output : Category: Adult, Price: ₹200
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MovieTicketPricing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Movie Ticket Pricing ------\n");

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age ❌");
            return;
        }

        final int CHILD_PRICE = 0;
        final int TEEN_PRICE = 100;
        final int ADULT_PRICE = 200;
        final int SENIOR_PRICE = 120;

        String category;
        int price;

        if (age < 5) {
            category = "Child";
            price = CHILD_PRICE;
        } 
        else if (age <= 17) {
            category = "Teen";
            price = TEEN_PRICE;
        } 
        else if (age <= 59) {
            category = "Adult";
            price = ADULT_PRICE;
        } 
        else {
            category = "Senior";
            price = SENIOR_PRICE;
        }

        System.out.println("Category: " + category);
        System.out.println("Price: ₹" + price);

        sc.close();
    }
}

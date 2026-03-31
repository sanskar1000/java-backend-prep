package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : InsurancePremiumCategory
 * Topic        : Conditional Statements
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program determines insurance premium category
 * based on age, smoking habits, and health condition.
 *
 * Categories:
 * • Low Premium
 * • Medium Premium
 * • High Premium
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class InsurancePremiumCategory {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Insurance Premium Calculator -----");

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Are you a smoker? (true/false): ");
        boolean isSmoker = sc.nextBoolean();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter health condition (good/average/poor): ");
        String health = sc.nextLine().toLowerCase();

        // Input validation
        if (age < 0) {
            System.out.println("Invalid age ❌");
            return;
        }

        if (age < 18) {
            System.out.println("Not eligible for insurance ❌");
            return;
        }

        String category;

        if (age <= 30) {

            if (!isSmoker && health.equals("good")) {
                category = "Low Premium 💰";
            } else {
                category = "Medium Premium 💰";
            }

        } else if (age <= 60) {

            if (!isSmoker && health.equals("good")) {
                category = "Medium Premium 💰";
            } else {
                category = "High Premium 💰";
            }

        } else {
            category = "High Premium 💰";
        }

        System.out.println("Premium Category: " + category);

        sc.close();
    }
}

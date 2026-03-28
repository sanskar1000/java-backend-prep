
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : MobileRechargeValidity
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether a mobile recharge
 * plan is still valid based on validity period
 * and days passed.
 *
 * Rules:
 * • validityDays must be > 0
 * • daysPassed must be ≥ 0
 * • If daysPassed ≥ validity → expired
 * • Else → show remaining days
 *
 * Key Concepts:
 * • Input validation
 * • Conditional logic
 *
 * Example:
 * Input  : validity=28, passed=10
 * Output : Remaining days: 18
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MobileRechargeValidity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter recharge validity (days): ");
        int validityDays = sc.nextInt();

        System.out.print("Enter days passed since recharge: ");
        int daysPassed = sc.nextInt();

        if (validityDays <= 0 || daysPassed < 0) {
            System.out.println("Invalid input ❌");
            return;
        }

        if (daysPassed >= validityDays) {
            System.out.println("Recharge expired ❌");
        } else {
            int remainingDays = validityDays - daysPassed;
            System.out.println("Recharge is active ✔");
            System.out.println("Remaining days: " + remainingDays);
        }

        sc.close();
    }
}

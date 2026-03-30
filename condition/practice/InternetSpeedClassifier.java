package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : InternetSpeedClassifier
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program classifies internet speed into categories
 * based on Mbps value.
 *
 * Categories:
 * • ≤ 2 Mbps   → Very Slow
 * • ≤ 10 Mbps  → Slow
 * • ≤ 50 Mbps  → Moderate
 * • ≤ 100 Mbps → Fast
 * • > 100 Mbps → Very Fast
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class InternetSpeedClassifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ Internet Speed Classification ------");

        System.out.print("Enter internet speed in Mbps: ");
        double speed = sc.nextDouble();

        if (speed <= 0) {
            System.out.println("Invalid speed ❌");
        } 
        else if (speed <= 2) {
            System.out.println("Speed Category: Very Slow 🐢");
        } 
        else if (speed <= 10) {
            System.out.println("Speed Category: Slow");
        } 
        else if (speed <= 50) {
            System.out.println("Speed Category: Moderate");
        } 
        else if (speed <= 100) {
            System.out.println("Speed Category: Fast ⚡");
        } 
        else {
            System.out.println("Speed Category: Very Fast 🚀");
        }

        sc.close();
    }
}

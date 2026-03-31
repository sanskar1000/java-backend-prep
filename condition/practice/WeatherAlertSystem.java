package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : WeatherAlertSystem
 * Topic        : Conditional Statements
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program generates weather alerts based on:
 * • Temperature
 * • Rain status
 * • Wind conditions
 *
 * Priority:
 * • Extreme temperature overrides other conditions
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class WeatherAlertSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Weather Alert System -----");

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        System.out.print("Rain Status (true/false): ");
        boolean isRain = sc.nextBoolean();

        System.out.print("High Wind Status (true/false): ");
        boolean isHighWind = sc.nextBoolean();

        // Input validation
        if (temp < -50 || temp > 60) {
            System.out.println("Invalid temperature ❌");
            return;
        }

        // Priority 1: Extreme conditions
        if (temp > 40) {
            System.out.println("🔥 Heatwave alert (High severity)");
            return;
        }

        if (temp < 5) {
            System.out.println("❄ Cold wave alert (High severity)");
            return;
        }

        // Priority 2: Weather conditions
        if (isRain && isHighWind) {
            System.out.println("⛈ Storm alert");
        } 
        else if (isRain) {
            System.out.println("🌧 Rain alert");
        } 
        else if (isHighWind) {
            System.out.println("🌪 High wind alert");
        } 
        else {
            System.out.println("😊 Normal weather");
        }

        sc.close();
    }
}

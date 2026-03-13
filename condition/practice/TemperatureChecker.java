package condition.practice;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TemperatureChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program checks whether the temperature entered by the
 * user indicates hot or cold weather.
 *
 * The program compares the temperature with a threshold value.
 * If the temperature is greater than 30°C, the weather is
 * considered hot; otherwise it is considered cold.
 *
 * Key Concepts:
 * • User input using Scanner
 * • Conditional statements (if-else)
 * • Comparison operators
 *
 * Example:
 * Input  : 35
 * Output : Weather is hot.
 *
 * Input  : 20
 * Output : Weather is cold.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class TemperatureChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temp = sc.nextInt();

        if (temp > 30) {
            System.out.println("Weather is hot.");
        } else {
            System.out.println("Weather is cold.");
        }

        sc.close();
    }
}

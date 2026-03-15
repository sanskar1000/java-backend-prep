package condition.practice;
import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : DayTypeChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program determines whether a given day is a weekday
 * or a weekend.
 *
 * The user enters the name of a day (e.g., Monday, Sunday).
 * The program checks the value and classifies it accordingly.
 *
 * Weekdays  : Monday, Tuesday, Wednesday, Thursday, Friday
 * Weekends  : Saturday, Sunday
 *
 * Key Concepts:
 * • String comparison
 * • equalsIgnoreCase() method
 * • Conditional statements (if-else)
 *
 * Example:
 * Input  : Sunday
 * Output : Weekend
 *
 * Input  : Tuesday
 * Output : Weekday
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class DayTypeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = sc.nextLine();

        if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } 
        else if (day.equalsIgnoreCase("Monday") ||
                 day.equalsIgnoreCase("Tuesday") ||
                 day.equalsIgnoreCase("Wednesday") ||
                 day.equalsIgnoreCase("Thursday") ||
                 day.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        } 
        else {
            System.out.println("Invalid day");
        }

        sc.close();
    }
}

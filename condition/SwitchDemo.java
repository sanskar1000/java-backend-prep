package condition;

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : SwitchDemo
 * Topic        : Conditional Statements (Switch Case)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of a switch statement
 * to map a number (1–7) to the corresponding day of the week.
 *
 * Logic:
 * • Each case represents a day number
 * • Switch matches input with case value
 * • Break prevents fall-through
 * • Default handles invalid input
 *
 * Input:
 * • Integer (1 to 7)
 *
 * Output:
 * • Prints the corresponding day name
 *
 * Example:
 * Input  : 3
 * Output : Wednesday
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("❌ Invalid input");
        }

        sc.close();
    }
}

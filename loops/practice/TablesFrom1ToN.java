import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TablesFrom1ToN
 * Topic        : Nested Loops
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints multiplication tables
 * from 1 to N using nested loops.
 *
 * Example:
 * Input  : 3
 * Output :
 * Table of 1
 * Table of 2
 * Table of 3
 *
 * Time Complexity  : O(N × 10)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class TablesFrom1ToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ Invalid number");
            sc.close();
            return;
        }

        for (int i = 1; i <= num; i++) {

            System.out.println("✔ Table of " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // spacing between tables
        }

        sc.close();
    }
}

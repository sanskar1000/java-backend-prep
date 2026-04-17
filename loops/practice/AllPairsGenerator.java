import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : AllPairsGenerator
 * Topic        : Nested Loops (Cartesian Product)
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints all ordered pairs (i, j)
 * where i and j range from 1 to N.
 *
 * Example:
 * Input  : 2
 * Output :
 * (1, 1)
 * (1, 2)
 * (2, 1)
 * (2, 2)
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class AllPairsGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("❌ No pairs to print");
            sc.close();
            return;
        }

        System.out.println("✔ All pairs (i, j):");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.println("(" + i + ", " + j + ")");
            }
        }

        sc.close();
    }
}

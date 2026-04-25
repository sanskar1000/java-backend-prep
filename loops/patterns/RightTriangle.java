package loops.patterns;

/**
 * ------------------------------------------------------------
 * Program Name : RightAngledStarTriangle
 * Topic        : Pattern Printing (Stars)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program prints a right-angled triangle pattern
 * using '*' (asterisk) characters.
 *
 * Each row contains an increasing number of stars.
 *
 * Example:
 * Input  : height = 5
 * Output :
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 *
 * Logic:
 * - Outer loop controls rows
 * - Inner loop prints stars equal to current row number
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class RightAngledStarTriangle {

    public static void main(String[] args) {

        int height = 5;   // number of rows

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

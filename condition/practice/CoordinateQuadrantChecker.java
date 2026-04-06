import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : CoordinateQuadrantChecker
 * Topic        : Conditional Statements
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program determines the position of a point (x, y)
 * in the Cartesian coordinate system.
 *
 * Cases:
 * • (0, 0) → Origin
 * • x = 0  → Lies on Y-axis
 * • y = 0  → Lies on X-axis
 * • x > 0, y > 0 → Quadrant I
 * • x < 0, y > 0 → Quadrant II
 * • x < 0, y < 0 → Quadrant III
 * • x > 0, y < 0 → Quadrant IV
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CoordinateQuadrantChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        String result;

        if (x == 0 && y == 0) {
            result = "At Origin";
        } 
        else if (x == 0) {
            result = "Lies on Y-axis";
        } 
        else if (y == 0) {
            result = "Lies on X-axis";
        } 
        else if (x > 0 && y > 0) {
            result = "Quadrant I";
        } 
        else if (x < 0 && y > 0) {
            result = "Quadrant II";
        } 
        else if (x < 0 && y < 0) {
            result = "Quadrant III";
        } 
        else {
            result = "Quadrant IV";
        }

        System.out.println("✔ " + result);

        sc.close();
    }
}

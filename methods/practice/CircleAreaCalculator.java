package methods.practice;
/**
 * ------------------------------------------------------------
 * Program Name : CircleAreaCalculator
 * Topic        : Methods with Return Values
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program calculates the area
 * of a circle using a method.
 *
 * Formula:
 * Area = π × r²
 *
 * If an invalid radius is provided
 * (negative value), the method returns -1.
 *
 * Example:
 * Input  : radius = 5
 * Output : Area of circle : 78.54
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class CircleAreaCalculator {

    /**
     * Calculates area of a circle.
     *
     * @param radius radius of circle
     * @return area if valid, otherwise -1
     */
    static double area(double radius) {

        // 🔹 Validation
        if (radius < 0) {
            return -1;
        }

        // 🔹 Area formula
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // 🔹 Method call
        double result = area(-5);

        // 🔹 Output handling
        if (result == -1) {
            System.out.println("Invalid radius");

        } else {
            System.out.printf("Area of circle : %.2f", result);
        }
    }
}

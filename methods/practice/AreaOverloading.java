/**
 * ------------------------------------------------------------
 * Program Name : AreaOverloading
 * Topic        : Method Overloading
 * Level        : Beginner → Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates
 * method overloading in Java.
 *
 * Same method name:
 * area()
 *
 * Different parameter lists:
 * - area(int side)
 * - area(int length, int breadth)
 * - area(double radius)
 *
 * Shapes Covered:
 * - Square
 * - Rectangle
 * - Circle
 *
 * Concepts Used:
 * - method overloading
 * - parameters
 * - return values
 * - Math.PI
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class AreaOverloading {

    /**
     * Returns area of square.
     *
     * @param side side length
     * @return square area
     */
    static int area(int side) {
        return side * side;
    }

    /**
     * Returns area of rectangle.
     *
     * @param length rectangle length
     * @param breadth rectangle breadth
     * @return rectangle area
     */
    static int area(int length, int breadth) {
        return length * breadth;
    }

    /**
     * Returns area of circle.
     *
     * @param radius circle radius
     * @return circle area
     */
    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // 🔹 Square area
        System.out.println("Square area : " + area(5));

        // 🔹 Rectangle area
        System.out.println("Rectangle area : " + area(4, 6));

        // 🔹 Circle area
        System.out.printf("Circle area : %.2f", area(5.0));
    }
}

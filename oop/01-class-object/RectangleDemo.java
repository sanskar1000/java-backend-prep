package oops.classobject;
/**
 * ------------------------------------------------------------
 * Program Name : RectangleDemo
 * Topic        : Object-Oriented Programming (Class & Object)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic concept of Class and Object in Java.
 *
 * • A class is a blueprint for creating objects.
 * • An object is an instance of a class representing a real-world entity.
 *
 * In this program:
 * • A Rectangle class is defined with attributes (length, width)
 * • A constructor is used to initialize object data
 * • Methods are used to calculate area and perimeter
 * • A display method shows rectangle details
 *
 * Note:
 * If invalid dimensions are provided (<= 0),
 * default values (1, 1) are assigned.
 *
 * Example:
 * Output:
 * ---- Rectangle 1 ----
 * Length: 6, Width: 8
 * Area: 48
 * Perimeter: 28
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Class representing a Rectangle entity
 */
class Rectangle {

    // ------------------------------------------------------------
    // Fields (Instance Variables)
    // ------------------------------------------------------------
    int length;   // Length of the rectangle
    int width;    // Width of the rectangle

    // ------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------

    /**
     * Parameterized constructor to initialize Rectangle object
     *
     * @param length length of the rectangle
     * @param width  width of the rectangle
     */
    Rectangle(int length, int width) {
        if (length <= 0 || width <= 0) {
            // Assign default values for invalid input
            this.length = 1;
            this.width = 1;
        } else {
            this.length = length;
            this.width = width;
        }
    }

    // ------------------------------------------------------------
    // Methods
    // ------------------------------------------------------------

    /**
     * Calculates the area of the rectangle
     *
     * @return area (length × width)
     */
    int area() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle
     *
     * @return perimeter (2 × (length + width))
     */
    int perimeter() {
        return 2 * (length + width);
    }

    /**
     * Displays the details of the rectangle
     */
    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

/**
 * Main class to demonstrate object creation and method calling
 */
public class RectangleDemo {

    public static void main(String[] args) {

        // ------------------------------------------------------------
        // Object Creation
        // ------------------------------------------------------------

        Rectangle rect1 = new Rectangle(6, 8);
        Rectangle rect2 = new Rectangle(46, 56);
        Rectangle rect3 = new Rectangle(-2, 5); // Edge case

        // ------------------------------------------------------------
        // Method Calls
        // ------------------------------------------------------------

        System.out.println("---- Rectangle 1 ----");
        rect1.display();
        System.out.println("Area: " + rect1.area());
        System.out.println("Perimeter: " + rect1.perimeter());

        System.out.println("\n---- Rectangle 2 ----");
        rect2.display();
        System.out.println("Area: " + rect2.area());
        System.out.println("Perimeter: " + rect2.perimeter());

        System.out.println("\n---- Rectangle 3 (Invalid Input) ----");
        rect3.display();
        System.out.println("Area: " + rect3.area());
        System.out.println("Perimeter: " + rect3.perimeter());
    }
}

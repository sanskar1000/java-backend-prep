package oops.constructors;

/**
 * ------------------------------------------------------------
 * Class Name : Rectangle
 * Topic      : Constructor Overloading
 * Author     : Aradhya Thakur
 * Year       : 2026
 *
 * Description:
 * Demonstrates:
 * - default constructor
 * - parameterized constructor
 * - object initialization
 * - method composition
 * - rectangle area calculation
 * ------------------------------------------------------------
 */

class Rectangle {

    double length;
    double breadth;

    /**
     * Default constructor.
     */
    Rectangle() {

        length = breadth = 0.0;
    }

    /**
     * Parameterized constructor.
     *
     * @param length rectangle length
     * @param breadth rectangle breadth
     */
    Rectangle(double length, double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    /**
     * Calculates rectangle area.
     *
     * @return rectangle area
     */
    double calculateArea() {

        return length * breadth;
    }

    /**
     * Displays rectangle details.
     */
    void displayRectangleDetails() {

        System.out.println("----- Rectangle Details -----");

        System.out.println("Length  : " + length);

        System.out.println("Breadth : " + breadth);

        System.out.printf("Area    : %.2f%n", calculateArea());

        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {

        // Object creation
        Rectangle r1 = new Rectangle();

        Rectangle r2 = new Rectangle(5.0, 3.0);

        // Display details
        r1.displayRectangleDetails();

        r2.displayRectangleDetails();
    }
}

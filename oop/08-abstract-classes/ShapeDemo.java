/**
 * ------------------------------------------------------------
 * Program Name : ShapeAreaCalculator
 * Topic        : Abstract Class in Java
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the concept of abstraction using
 * an abstract class. The Shape class provides common properties
 * and behavior, while Circle and Rectangle provide their own
 * implementations of the calculateArea() method.
 *
 * Concepts Covered:
 * - Abstract Class
 * - Abstract Method
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism (through abstract methods)
 * - Constructors
 * - Encapsulation
 * - Input Validation
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Abstract parent class representing a generic shape.
 *
 * Every shape has a color and must provide its own
 * implementation for calculating area.
 */
abstract class Shape {

    /** Color of the shape */
    private String color;

    /**
     * Constructs a Shape object.
     *
     * @param color Color of the shape
     */
    Shape(String color) {

        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "Unknown";
            System.out.println("Invalid color. Default value assigned.");
        }

        System.out.println("Shape constructor executed.\n");
    }

    /**
     * Returns the color of the shape.
     *
     * @return shape color
     */
    public String getColor() {
        return color;
    }

    /**
     * Calculates the area of the shape.
     *
     * @return calculated area
     */
    abstract double calculateArea();

    /**
     * Displays the color of the shape.
     */
    public void displayColor() {
        System.out.println("Color  : " + getColor());
    }
}

/**
 * Represents a Circle.
 *
 * Extends the Shape class and provides an implementation
 * for calculating the area of a circle.
 */
class Circle extends Shape {

    /** Radius of the circle */
    private double radius;

    /**
     * Constructs a Circle object.
     *
     * @param color  Circle color
     * @param radius Circle radius
     */
    Circle(String color, double radius) {

        super(color);

        if (radius > 0) {
            this.radius = radius;
        } else {
            this.radius = 0.0;
            System.out.println("Invalid radius. Default value assigned.");
        }

        System.out.println("Circle constructor executed.\n");
    }

    /**
     * Returns the radius.
     *
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * Formula:
     * π × r²
     *
     * @return area of circle
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Displays complete circle details.
     */
    public void displayCircleDetails() {

        displayColor();
        System.out.println("Radius : " + getRadius());
        System.out.printf("Area   : %.2f%n", calculateArea());
        System.out.println();
    }
}

/**
 * Represents a Rectangle.
 *
 * Extends the Shape class and provides an implementation
 * for calculating the area of a rectangle.
 */
class Rectangle extends Shape {

    /** Length of the rectangle */
    private double length;

    /** Width of the rectangle */
    private double width;

    /**
     * Constructs a Rectangle object.
     *
     * @param color  Rectangle color
     * @param length Rectangle length
     * @param width  Rectangle width
     */
    Rectangle(String color, double length, double width) {

        super(color);

        if (length > 0) {
            this.length = length;
        } else {
            this.length = 0.0;
            System.out.println("Invalid length. Default value assigned.");
        }

        if (width > 0) {
            this.width = width;
        } else {
            this.width = 0.0;
            System.out.println("Invalid width. Default value assigned.");
        }

        System.out.println("Rectangle constructor executed.\n");
    }

    /**
     * Returns the rectangle length.
     *
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Returns the rectangle width.
     *
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * Formula:
     * Length × Width
     *
     * @return area of rectangle
     */
    @Override
    public double calculateArea() {
        return length * width;
    }

    /**
     * Displays complete rectangle details.
     */
    public void displayRectangleDetails() {

        displayColor();
        System.out.println("Length : " + getLength());
        System.out.println("Width  : " + getWidth());
        System.out.printf("Area   : %.2f%n", calculateArea());
        System.out.println();
    }
}

/**
 * Driver class of the program.
 *
 * Demonstrates abstraction by creating Circle and Rectangle
 * objects and calculating their respective areas.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Circle circle = new Circle("Blue", 24.0);
        Rectangle rectangle = new Rectangle("Green", 6.0, 8.0);

        System.out.println("========== Circle ==========");
        circle.displayCircleDetails();

        System.out.println("======== Rectangle =========");
        rectangle.displayRectangleDetails();
    }
}

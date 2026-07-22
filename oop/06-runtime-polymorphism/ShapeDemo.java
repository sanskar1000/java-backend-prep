/**
 * ------------------------------------------------------------
 * Program Name : ShapeDemo
 * Topic        : Method Overriding (Runtime Polymorphism)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates Method Overriding in Java.
 *
 * A parent class (Shape) defines a common method draw().
 * Child classes (Circle and Rectangle) override the draw()
 * method to provide their own specific implementation.
 *
 * Runtime polymorphism is demonstrated by using parent class
 * references to invoke overridden methods of child classes.
 *
 * Concepts Covered:
 * - Inheritance
 * - Method Overriding
 * - Runtime Polymorphism
 * - Dynamic Method Dispatch
 * - @Override Annotation
 *
 * Expected Output:
 *
 * Drawing Circle.
 * Drawing Rectangle.
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

/**
 * Parent class representing a generic shape.
 */
class Shape {

    /**
     * Draws a generic shape.
     */
    public void draw() {
        System.out.println("Drawing Shape.");
    }
}

/**
 * Child class representing a Circle.
 */
class Circle extends Shape {

    /**
     * Draws a circle.
     * Overrides the draw() method of Shape.
     */
    @Override
    public void draw() {
        System.out.println("Drawing Circle.");
    }
}

/**
 * Child class representing a Rectangle.
 */
class Rectangle extends Shape {

    /**
     * Draws a rectangle.
     * Overrides the draw() method of Shape.
     */
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle.");
    }
}

/**
 * Driver class of the program.
 */
public class Main {

    /**
     * Program execution starts here.
     *
     * Demonstrates runtime polymorphism by storing child
     * objects in parent class references.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Parent reference pointing to Circle object
        Shape s1 = new Circle();

        // Parent reference pointing to Rectangle object
        Shape s2 = new Rectangle();

        System.out.println("========== Runtime Polymorphism ==========\n");

        s1.draw();

        s2.draw();
    }
}

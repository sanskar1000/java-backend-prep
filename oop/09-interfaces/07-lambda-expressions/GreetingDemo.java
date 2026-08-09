/**
 * ------------------------------------------------------------
 * Program Name : ParameterizedLambdaDemo
 * Topic        : Lambda Expression with Parameter
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how a lambda expression
 * can accept a parameter and provide the implementation
 * of a functional interface method.
 *
 * Concepts Used:
 * - Functional Interface
 * - @FunctionalInterface
 * - Lambda Expression
 * - Lambda Parameter
 * - Interface Reference
 * ------------------------------------------------------------
 */

/**
 * Functional interface containing one abstract method.
 */
@FunctionalInterface
interface Printer {

    /**
     * Greets a person by name.
     *
     * @param name person's name
     */
    void greet(String name);
}

public class ParameterizedLambdaDemo {

    public static void main(String[] args) {

        // Lambda expression with one parameter
        Printer printer =
                (name) -> System.out.println(
                        "Hello " + name
                );

        // Calling the lambda multiple times
        printer.greet("Aradhya");
        printer.greet("Yasir");
        printer.greet("Rahul");
    }
}

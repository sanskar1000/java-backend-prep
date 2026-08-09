package interfaces.lambdaexpressions;

/**
 * ------------------------------------------------------------
 * Program Name : PrinterDemo
 * Topic        : Lambda Expressions
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how a lambda expression can
 * provide the implementation of a functional interface.
 *
 * Concepts Used:
 * - Functional Interface
 * - @FunctionalInterface annotation
 * - Lambda Expression
 * - Interface Reference
 * ------------------------------------------------------------
 */

/**
 * Functional interface containing exactly one
 * abstract method.
 */
@FunctionalInterface
interface Printer {

    /**
     * Prints a message.
     */
    void print();
}

public class PrinterDemo {

    public static void main(String[] args) {

        // Lambda expression implementing Printer
        Printer printer =
                () -> System.out.println(
                        "Hello from Lambda!"
                );

        // Calling the implemented method
        printer.print();
    }
}

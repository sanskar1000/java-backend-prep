import java.util.function.Supplier;

/**
 * ------------------------------------------------------------
 * Program Name : SupplierDemo
 * Topic        : Supplier Functional Interface
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of Java's built-in
 * Supplier functional interface.
 *
 * Supplier<T> does not take any input but produces
 * and returns a value of type T.
 *
 * In this program, Supplier is used to generate
 * a welcome message.
 *
 * Concepts Used:
 * - Functional Interface
 * - Supplier<T>
 * - Lambda Expression
 * - Supplier.get()
 * - No-argument functional interface
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class SupplierDemo {

    public static void main(String[] args) {

        // Supplier that generates a welcome message
        Supplier<String> generateWelcomeMessage =
                () -> "Welcome to Java Backend!";

        // Get the supplied value
        System.out.println(
                generateWelcomeMessage.get()
        );
    }
}

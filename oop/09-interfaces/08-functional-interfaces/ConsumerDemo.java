import java.util.function.Consumer;

/**
 * ------------------------------------------------------------
 * Program Name : ConsumerDemo
 * Topic        : Consumer Functional Interface
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of Java's built-in
 * Consumer functional interface.
 *
 * Consumer<T> accepts one input and performs an action
 * without returning a result.
 *
 * In this program, Consumer is used to print a name
 * after validating that the input is not null or blank.
 *
 * Concepts Used:
 * - Functional Interface
 * - Consumer<T>
 * - Lambda Expression
 * - Consumer.accept()
 * - Input Validation
 * ------------------------------------------------------------
 */

public class ConsumerDemo {

    public static void main(String[] args) {

        // Consumer that validates and prints a name
        Consumer<String> printName = name -> {

            if (name == null || name.isBlank()) {

                System.out.println("Invalid name");
                return;
            }

            System.out.println("Name : " + name);
        };

        // Test valid inputs
        printName.accept("Aradhya");
        printName.accept("Java");

        // Test invalid inputs
        printName.accept("");
        printName.accept(null);
    }
}

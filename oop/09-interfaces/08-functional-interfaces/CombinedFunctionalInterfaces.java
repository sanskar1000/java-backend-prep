import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * ------------------------------------------------------------
 * Program Name : FunctionalInterfacesDemo
 * Topic        : Combining Built-in Functional Interfaces
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates how Supplier, Predicate,
 * Function, and Consumer can be combined to create
 * a simple data-processing pipeline.
 *
 * Workflow:
 *
 * Supplier
 *     ↓
 * Generate a name
 *     ↓
 * Predicate
 *     ↓
 * Validate the name
 *     ↓
 * Function
 *     ↓
 * Transform the name
 *     ↓
 * Consumer
 *     ↓
 * Display the result
 *
 * Functional Interfaces Used:
 * - Supplier<T>  → Generates a value
 * - Predicate<T> → Validates a value
 * - Function<T,R> → Transforms a value
 * - Consumer<T> → Performs an action
 *
 * Concepts Used:
 * - Lambda Expressions
 * - Functional Interfaces
 * - Supplier
 * - Predicate
 * - Function
 * - Consumer
 * ------------------------------------------------------------
 */

public class FunctionalInterfacesDemo {

    public static void main(String[] args) {

        // Supplier: generates a name
        Supplier<String> generateName =
                () -> "Aradhya";

        // Predicate: validates the name
        Predicate<String> isValidName =
                name -> name != null
                        && !name.isBlank()
                        && name.length() >= 3;

        // Function: transforms the name
        Function<String, String> upperCase =
                name -> name.trim().toUpperCase();

        // Consumer: displays the final result
        Consumer<String> printName =
                name -> System.out.println(
                        "Name: " + name
                );

        // Generate name
        String name = generateName.get();

        // Validate → Transform → Display
        if (isValidName.test(name)) {

            String result =
                    upperCase.apply(name);

            printName.accept(result);

        } else {

            System.out.println(
                    "Invalid name"
            );
        }
    }
}

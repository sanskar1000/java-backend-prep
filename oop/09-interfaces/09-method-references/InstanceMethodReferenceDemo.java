import java.util.function.Consumer;
import java.util.function.Function;

/*
 * Program: InstanceMethodReferenceDemo.java
 *
 * Purpose:
 * Demonstrates Method References using Java's
 * built-in Functional Interfaces.
 *
 * Concepts:
 * - Method Reference
 * - Consumer<T>
 * - Function<T, R>
 * - Static/Instance Method References
 */

public class MethodReferenceWithBuiltInInterfaces {

    public static void main(String[] args) {

        String message = "Hello Java";

        // Method reference to System.out.println()
        // Equivalent lambda:
        // text -> System.out.println(text)
        Consumer<String> printer = System.out::println;

        // Method reference to String.toUpperCase()
        // Equivalent lambda:
        // text -> text.toUpperCase()
        Function<String, String> upperCase =
                String::toUpperCase;

        System.out.println("Consumer Method Reference:");

        printer.accept(message);
        printer.accept("Learning Method Reference");

        System.out.println();

        System.out.println("Function Method Reference:");

        System.out.println(
                "java -> " + upperCase.apply("java")
        );

        System.out.println(
                "backend -> " + upperCase.apply("backend")
        );
    }
}

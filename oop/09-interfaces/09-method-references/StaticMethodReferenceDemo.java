package functionalinterfaces.methodreference;

import java.util.function.Function;

/*
 * Program: MethodReferenceDemo
 *
 * Purpose:
 * Demonstrates the use of Method References
 * with the Function Functional Interface.
 *
 * Concepts:
 * - Method Reference
 * - Function<T, R>
 * - Static Method Reference
 * - Instance Method Reference
 */

public class MethodReferenceDemo {

    public static void main(String[] args) {

        // Static method reference
        // Equivalent lambda:
        // number -> Math.abs(number)
        Function<Integer, Integer> absoluteValue = Math::abs;

        // Instance method reference
        // Equivalent lambda:
        // text -> text.length()
        Function<String, Integer> length = String::length;

        System.out.println("Absolute Values:");

        System.out.println("-50 -> " + absoluteValue.apply(-50));
        System.out.println("-25 -> " + absoluteValue.apply(-25));
        System.out.println("-10 -> " + absoluteValue.apply(-10));

        System.out.println();

        System.out.println("String Lengths:");

        System.out.println("Java -> " + length.apply("Java"));
        System.out.println("Backend -> " + length.apply("Backend"));
    }
}

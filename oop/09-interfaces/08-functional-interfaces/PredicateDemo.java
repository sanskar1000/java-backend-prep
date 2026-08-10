import java.util.function.Predicate;

/**
 * ------------------------------------------------------------
 * Program Name : PredicateDemo
 * Topic        : Predicate Functional Interface
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of Java's built-in
 * Predicate functional interface.
 *
 * Predicate<T> represents a condition that takes one input
 * and returns a boolean value.
 *
 * In this program, Predicate is used to check whether a
 * number is even and whether a number is positive.
 *
 * Concepts Used:
 * - Functional Interface
 * - Predicate<T>
 * - Lambda Expression
 * - Predicate.test()
 * - Generics
 * ------------------------------------------------------------
 */

public class PredicateDemo {

    public static void main(String[] args) {

        // Predicate to check whether a number is even
        Predicate<Integer> isEven =
                number -> number % 2 == 0;

        // Predicate to check whether a number is positive
        Predicate<Integer> isPositive =
                number -> number > 0;

        int[] numbers = {
                1, 2, 3, 4, 5,
                6, 7, -2, -4, -7
        };

        // Test every number using both predicates
        for (int number : numbers) {

            System.out.println("Number   : " + number);
            System.out.println(
                    "Even     : " + isEven.test(number)
            );
            System.out.println(
                    "Positive : " + isPositive.test(number)
            );

            System.out.println();
        }
    }
}

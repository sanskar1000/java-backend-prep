import java.util.function.Function;

/**
 * ------------------------------------------------------------
 * Program Name : FunctionDemo
 * Topic        : Function Functional Interface
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the use of Java's built-in
 * Function functional interface.
 *
 * Function<T, R> accepts one input of type T and returns
 * a result of type R.
 *
 * In this program, Function is used to validate, trim,
 * and convert text to uppercase.
 *
 * Concepts Used:
 * - Functional Interface
 * - Function<T, R>
 * - Lambda Expression
 * - Function.apply()
 * - String Validation
 * - String Manipulation
 *
 * Time Complexity  : O(n), where n is the length of the text
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class FunctionDemo {

    public static void main(String[] args) {

        // Function that cleans and converts text to uppercase
        Function<String, String> cleanText = text -> {

            // Validate input
            if (text == null || text.isBlank()) {
                return "Invalid text";
            }

            // Remove leading/trailing spaces
            // and convert text to uppercase
            return text.trim().toUpperCase();
        };

        // Test valid inputs
        System.out.println(
                cleanText.apply("  java  ")
        );

        System.out.println(
                cleanText.apply(" Backend Developer ")
        );

        // Test invalid inputs
        System.out.println(
                cleanText.apply("")
        );

        System.out.println(
                cleanText.apply(null)
        );
    }
}

package methods;

/**
 * ------------------------------------------------------------
 * Program Name : MethodBasics
 * Topic        : Java Methods
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates:
 * - method definition
 * - method calling
 * - static methods
 * - code reusability
 * - program execution flow
 *
 * Concepts Used:
 * - Classes and Objects
 * - Methods
 * - Method Invocation
 * - Static Keyword
 *
 * Time Complexity  : O(1)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class MethodBasics {

    /**
     * Displays a welcome message.
     */
    static void greet() {

        System.out.println(
                "Hello, welcome to Java methods!"
        );
    }

    public static void main(String[] args) {

        System.out.println(
                "----- Method Demonstration -----"
        );

        greet();
    }
}

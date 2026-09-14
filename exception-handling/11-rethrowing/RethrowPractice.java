/*
 * RethrowPractice.java
 *
 * Lesson 14: Rethrowing Exceptions
 *
 * Problem:
 * Demonstrate how the same exception object can be caught
 * and rethrown through multiple methods.
 *
 * Flow:
 * main() → methodB() → methodA()
 *
 * ArithmeticException occurs in methodA().
 * methodA() catches and rethrows it.
 * methodB() catches and rethrows the same exception.
 * main() finally handles the exception.
 *
 * Expected Output:
 * D
 * A
 * B
 * C
 * F
 * G
 *
 * Key Concept:
 * throw e;
 * rethrows the SAME exception object.
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */

public class RethrowPractice {

    static void methodA() {

        try {
            System.out.println("A");

            int x = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("B");

            // Rethrow the same exception object
            throw e;
        }
    }

    static void methodB() {

        try {
            methodA();

        } catch (ArithmeticException e) {

            System.out.println("C");

            // Rethrow the same exception object again
            throw e;
        }
    }

    public static void main(String[] args) {

        System.out.println("D");

        try {
            methodB();

            // This line is skipped because methodB() rethrows
            System.out.println("E");

        } catch (ArithmeticException e) {

            System.out.println("F");
        }

        System.out.println("G");
    }
}

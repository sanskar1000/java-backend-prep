/**
 * Custom unchecked exception used when an invalid age is provided.
 *
 * This exception extends RuntimeException, making it an
 * unchecked exception. Therefore, methods throwing this
 * exception are not required to declare it using throws.
 */
class InvalidAgeException extends RuntimeException {

    /**
     * Creates an InvalidAgeException with the specified message.
     *
     * @param message explanation of why the age is invalid
     */
    public InvalidAgeException(String message) {

        super(message);
    }
}

/**
 * Program: ExceptionPractice
 * Topic: Exception Handling - Custom Unchecked Exception
 * Level: Beginner / Intermediate
 *
 * Description:
 * Demonstrates how to create, throw, and handle a custom
 * unchecked exception in Java.
 *
 * The checkAge() method validates whether a person is at least
 * 18 years old. If the age is below 18, it manually throws
 * an InvalidAgeException.
 *
 * Exception Flow:
 *
 *     main()
 *       ↓
 *     checkAge(20)
 *       ↓
 *     Age is valid
 *
 *     checkAge(16)
 *       ↓
 *     throw InvalidAgeException
 *       ↓
 *     catch in main()
 *       ↓
 *     finally
 *
 * Concepts Used:
 * - Custom exception
 * - RuntimeException
 * - Unchecked exception
 * - throw keyword
 * - try-catch-finally
 * - Exception message
 * - Exception inheritance
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */
public class ExceptionPractice {

    /**
     * Program entry point.
     *
     * Tests the age validation method with both a valid
     * and an invalid age.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        try {

            checkAge(20);
            checkAge(16);

        } catch (InvalidAgeException e) {

            System.out.println(
                    "Exception : " + e.getClass().getSimpleName()
            );

            System.out.println(
                    "Message   : " + e.getMessage()
            );

        } finally {

            System.out.println("-Completed-");
        }
    }

    /**
     * Validates whether the given age is 18 or above.
     *
     * If the age is below 18, a custom InvalidAgeException
     * is thrown.
     *
     * @param age age to validate
     * @throws InvalidAgeException if the age is below 18
     */
    public static void checkAge(int age) {

        if (age < 18) {

            throw new InvalidAgeException(
                    "Invalid age. Age must be 18 or above."
            );
        }

        System.out.println("Age is valid.");
    }
}

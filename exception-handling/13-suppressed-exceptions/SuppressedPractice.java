/*
 * Program Name: SuppressedPractice
 * Topic: Suppressed Exceptions
 * Lesson: 16
 * Level: Advanced
 * Author: Aradhya Thakur
 * Year: 2026
 *
 * Description:
 * Demonstrates how try-with-resources handles a situation where
 * both the main try block and the resource close() method throw
 * exceptions.
 *
 * The exception from the try block becomes the primary exception.
 * The exception from close() becomes a suppressed exception.
 *
 * Key Concepts:
 * - Try-with-resources
 * - AutoCloseable
 * - Primary exception
 * - Suppressed exception
 * - getSuppressed()
 * - getMessage()
 *
 * Expected Output:
 * A
 * Closing
 * B
 * Primary: Main failed
 * Suppressed count: 1
 * Suppressed: Close failed
 * C
 * D
 *
 * Time Complexity: O(1)
 * Auxiliary Space: O(1) excluding exception objects
 */

public class SuppressedPractice {

    public static void main(String[] args) {

        try (Resource resource = new Resource()) {

            System.out.println("A");

            // Primary exception
            throw new RuntimeException("Main failed");

        } catch (Exception e) {

            System.out.println("B");

            // Message of the primary exception
            System.out.println("Primary: " + e.getMessage());

            // Number of suppressed exceptions
            System.out.println(
                    "Suppressed count: " + e.getSuppressed().length
            );

            // Display suppressed exception messages
            for (Throwable t : e.getSuppressed()) {
                System.out.println(
                        "Suppressed: " + t.getMessage()
                );
            }

            System.out.println("C");
        }

        System.out.println("D");
    }
}

/*
 * Resource used with try-with-resources.
 */
class Resource implements AutoCloseable {

    @Override
    public void close() {

        System.out.println("Closing");

        // Exception during cleanup becomes suppressed
        // because the try block already failed.
        throw new RuntimeException("Close failed");
    }
}

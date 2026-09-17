/*
 * Program Name : TryWithResourcesPractice
 * Topic        : Exception Handling - Try-With-Resources
 * Lesson       : 15
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates try-with-resources with multiple resources,
 * reverse-order resource closing, and suppressed exceptions.
 *
 * Key Concepts:
 * - try-with-resources
 * - AutoCloseable
 * - Multiple resources
 * - Resource creation order
 * - Reverse-order closing (LIFO)
 * - Primary exception
 * - Suppressed exceptions
 * - getSuppressed()
 *
 * Expected Flow:
 * 1. Resources are created from left to right.
 * 2. The try block executes.
 * 3. The try block throws a RuntimeException.
 * 4. Resources are automatically closed from right to left.
 * 5. Exceptions thrown during close() become suppressed exceptions.
 * 6. The original try-block exception remains the primary exception.
 * 7. The catch block handles the primary exception.
 */
public class TryWithResourcesPractice {
    public static void main(String[] args) {
        try (
            MyResource resourceA = new MyResource("A");
            MyResource resourceB = new MyResource("B");
            MyResource resourceC = new MyResource("C")
        ) {
            System.out.println("Inside try");
            throw new RuntimeException("Main operation failed");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println(
                "Suppressed count: " + e.getSuppressed().length
            );
            for (Throwable suppressed : e.getSuppressed()) {
                System.out.println(
                    "Suppressed: " + suppressed.getMessage()
                );
            }
        }
        System.out.println("Program finished");
    }
}
/*
 * Custom resource used to demonstrate automatic closing.
 */
class MyResource implements AutoCloseable {
    private String name;
    MyResource(String name) {
        this.name = name;
        System.out.println("Created " + name);
    }
    @Override
    public void close() {
        System.out.println("Closing " + name);
        /*
         * Resource B and A fail during cleanup.
         * These exceptions should become suppressed exceptions
         * because the try block already has a primary exception.
         */
        if (name.equals("B") || name.equals("A")) {
            throw new RuntimeException(
                "Close " + name + " failed"
            );
        }
    }
}

/*
 * Program Name: SuppressedMultiplePractice
 * Topic: Multiple Suppressed Exceptions
 * Lesson: 16
 * Level: Advanced
 * Author: Aradhya Thakur
 * Year: 2026
 *
 * Description:
 * Demonstrates how multiple resources can produce multiple
 * suppressed exceptions when they are closed.
 *
 * Resources are created from left to right but closed in
 * reverse order because try-with-resources follows LIFO order.
 *
 * Resource creation:
 * A → B → C
 *
 * Resource closing:
 * C → B → A
 *
 * The main exception remains the primary exception.
 * Exceptions from B and A become suppressed exceptions.
 *
 * Key Concepts:
 * - Multiple resources
 * - Try-with-resources
 * - LIFO resource closing
 * - Primary exception
 * - Multiple suppressed exceptions
 * - getSuppressed()
 * - Throwable[]
 *
 * Expected Output:
 * Created A
 * Created B
 * Created C
 * Inside
 * Closing C
 * Closing B
 * Closing A
 * Caught
 * Primary: Main failed
 * Suppressed count: 2
 * Suppressed: Close B failed
 * Suppressed: Close A failed
 * Finished
 *
 * Time Complexity: O(n)
 * Auxiliary Space: O(n) for suppressed exception objects
 */
public class SuppressedMultiplePractice {
    public static void main(String[] args) {
        try (
                Resource a = new Resource("A");
                Resource b = new Resource("B");
                Resource c = new Resource("C")
        ) {
            System.out.println("Inside");
            // Primary exception
            throw new RuntimeException("Main failed");
        } catch (Exception e) {
            System.out.println("Caught");
            // Primary exception message
            System.out.println(
                    "Primary: " + e.getMessage()
            );
            // getSuppressed() returns Throwable[]
            Throwable[] suppressed = e.getSuppressed();
            System.out.println(
                    "Suppressed count: " + suppressed.length
            );
            // Print all suppressed exceptions
            for (Throwable t : suppressed) {
                System.out.println(
                        "Suppressed: " + t.getMessage()
                );
            }
        }
        System.out.println("Finished");
    }
}
/*
 * Resource class used by try-with-resources.
 */
class Resource implements AutoCloseable {
    private String name;
    Resource(String name) {
        this.name = name;
        System.out.println("Created " + name);
    }
    @Override
    public void close() {
        System.out.println("Closing " + name);
        /*
         * C closes successfully.
         *
         * B closes and throws.
         *
         * A closes and throws.
         *
         * Since the try block already threw "Main failed",
         * the B and A exceptions become suppressed.
         */
        if (name.equals("A") || name.equals("B")) {
            throw new RuntimeException(
                    "Close " + name + " failed"
            );
        }
    }
}

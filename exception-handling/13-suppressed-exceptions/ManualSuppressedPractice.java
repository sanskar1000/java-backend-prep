/*
 * Program Name: ManualSuppressedPractice
 * Topic: Manual Suppressed Exceptions
 * Lesson: 16
 * Level: Advanced
 * Author: Aradhya Thakur
 * Year: 2026
 *
 * Description:
 * Demonstrates how to manually attach suppressed exceptions
 * to a primary exception using addSuppressed().
 *
 * addSuppressed() does NOT throw the exception.
 * It attaches the given Throwable to the primary exception.
 *
 * Key Concepts:
 * - addSuppressed()
 * - getSuppressed()
 * - Primary exception
 * - Suppressed exception
 * - Throwable[]
 * - Exception relationships
 *
 * Expected Output:
 * Primary: Main operation failed
 * Suppressed count: 2
 * Suppressed: Database cleanup failed
 * Suppressed: File cleanup failed
 *
 * Time Complexity: O(n)
 * Auxiliary Space: O(n) for suppressed exception objects
 */
public class ManualSuppressedPractice {
    public static void main(String[] args) {
        // Create the primary exception.
        RuntimeException primary =
                new RuntimeException(
                        "Main operation failed"
                );
        // Create additional exceptions.
        RuntimeException cleanup1 =
                new RuntimeException(
                        "Database cleanup failed"
                );
        RuntimeException cleanup2 =
                new RuntimeException(
                        "File cleanup failed"
                );
        /*
         * Attach cleanup exceptions to the primary exception.
         *
         * Important:
         * addSuppressed() does NOT throw cleanup1 or cleanup2.
         * It only stores them inside the primary exception.
         */
        primary.addSuppressed(cleanup1);
        primary.addSuppressed(cleanup2);
        // Display primary exception message.
        System.out.println(
                "Primary: " + primary.getMessage()
        );
        // getSuppressed() returns Throwable[].
        Throwable[] suppressed =
                primary.getSuppressed();
        System.out.println(
                "Suppressed count: " + suppressed.length
        );
        // Display suppressed exception messages.
        for (Throwable t : suppressed) {
            System.out.println(
                    "Suppressed: " + t.getMessage()
            );
        }
    }
}

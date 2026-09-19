/*
 * Program Name: SuppressedFinalTest
 * Topic: Suppressed Exceptions
 * Lesson: 16
 * Level: Advanced
 * Author: Aradhya Thakur
 * Year: 2026
 *
 * Description:
 * Demonstrates how try-with-resources handles multiple exceptions.
 *
 * The main operation throws a RuntimeException.
 * Both resources also throw exceptions while closing.
 *
 * The exception from the try block becomes the primary exception.
 * Exceptions thrown during resource closing become suppressed
 * exceptions and can be accessed using getSuppressed().
 *
 * Key Concepts:
 * - Try-with-resources
 * - Automatic resource closing
 * - LIFO resource closing order
 * - Primary exception
 * - Suppressed exceptions
 * - getMessage()
 * - getCause()
 * - getSuppressed()
 *
 * Expected Output:
 * Created A
 * Created B
 * 1
 * Closing B
 * Closing A
 * 2
 * Primary: Main failed
 * Cause: null
 * Suppressed: 2
 * Suppressed message: Close B failed
 * Suppressed message: Close A failed
 * 3
 * 4
 *
 * Important:
 * Resource B closes before Resource A because resources are
 * closed in reverse order of creation.
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */

public class SuppressedFinalTest {

    public static void main(String[] args) {

        try (Resource a = new Resource("A");
             Resource b = new Resource("B")) {

            System.out.println("1");

            throw new RuntimeException("Main failed");

        } catch (Exception e) {

            System.out.println("2");
            System.out.println("Primary: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
            System.out.println("Suppressed: " + e.getSuppressed().length);

            for (Throwable t : e.getSuppressed()) {
                System.out.println(
                        "Suppressed message: " + t.getMessage()
                );
            }

            System.out.println("3");
        }

        System.out.println("4");
    }
}

class Resource implements AutoCloseable {

    private String name;

    Resource(String name) {
        this.name = name;
        System.out.println("Created " + name);
    }

    @Override
    public void close() {

        System.out.println("Closing " + name);

        if (name.equals("A") || name.equals("B")) {
            throw new RuntimeException("Close " + name + " failed");
        }
    }
}

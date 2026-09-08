import java.io.FileNotFoundException;

/**
 * Program: ThrowsChain
 * Topic: Exception Handling - throws and Exception Propagation
 * Level: Beginner / Intermediate
 *
 * Description:
 * Demonstrates how a checked exception can propagate through
 * multiple methods using the throws keyword.
 *
 * methodA() creates and throws a FileNotFoundException.
 * methodB() calls methodA() and declares the same exception
 * using throws, allowing it to propagate further.
 * methodC() calls methodB() and again declares the exception.
 * Finally, main() calls methodC() and handles the exception
 * using a try-catch block.
 *
 * Exception Propagation Flow:
 *
 *     main()
 *       ↓
 *     methodC()
 *       ↓
 *     methodB()
 *       ↓
 *     methodA()
 *       ↓
 *     throw FileNotFoundException
 *       ↓
 *     methodA() throws
 *       ↓
 *     methodB() throws
 *       ↓
 *     methodC() throws
 *       ↓
 *     main() catch
 *
 * Concepts Used:
 * - Checked Exception
 * - throws keyword
 * - throw keyword
 * - Exception propagation
 * - Method chaining
 * - try-catch-finally
 * - FileNotFoundException
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */
public class ThrowsChain {

    /**
     * Program entry point.
     *
     * Calls methodC() and handles the FileNotFoundException
     * propagated through methodB() and methodA().
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        try {

            methodC();

        } catch (FileNotFoundException e) {

            System.out.println(
                    "Exception caught: " + e.getMessage()
            );

        } finally {

            System.out.println("-Completed-");
        }
    }

    /**
     * Method A creates and throws a FileNotFoundException.
     *
     * This method is responsible for generating the exception.
     * It does not handle the exception itself.
     *
     * @throws FileNotFoundException deliberately thrown
     *         to demonstrate exception propagation
     */
    static void methodA() throws FileNotFoundException {

        System.out.println("Method A Executes.");

        throw new FileNotFoundException("File not found");
    }

    /**
     * Method B calls methodA().
     *
     * Method B does not handle the exception. Instead, it
     * declares the same checked exception using throws so
     * that it can propagate to its caller, methodC().
     *
     * @throws FileNotFoundException propagated from methodA()
     */
    static void methodB() throws FileNotFoundException {

        System.out.println("Method B Executes.");

        methodA();

        // This statement is never reached if methodA() throws.
        System.out.println("-Done-");
    }

    /**
     * Method C calls methodB().
     *
     * Method C also does not handle the exception. It declares
     * FileNotFoundException using throws and passes it to main().
     *
     * @throws FileNotFoundException propagated from methodB()
     */
    static void methodC() throws FileNotFoundException {

        System.out.println("Method C Executes.");

        methodB();

        // This statement is never reached if methodB() throws.
        System.out.println("-Done-");
    }
}

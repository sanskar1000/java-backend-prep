/**
 * ------------------------------------------------------------
 * Program Name : MultipleCatchChallenge
 * Topic        : Multiple Catch Blocks & Exception Hierarchy
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program is a master challenge for practicing multiple
 * catch blocks and Java's exception hierarchy.
 *
 * Four different exception scenarios are tested:
 *
 * Test 1:
 * ArithmeticException
 * Caused by division by zero.
 *
 * Test 2:
 * NullPointerException
 * Caused by calling a method on a null reference.
 *
 * Test 3:
 * ArrayIndexOutOfBoundsException
 * Caused by accessing an invalid array index.
 *
 * Test 4:
 * RuntimeException category
 * Demonstrates the RuntimeException level of the
 * exception hierarchy.
 *
 * The program uses multiple catch blocks ordered from
 * specific exceptions to more general exceptions.
 *
 * Concepts Used:
 * - try-catch
 * - Multiple catch blocks
 * - Exception hierarchy
 * - ArithmeticException
 * - NullPointerException
 * - ArrayIndexOutOfBoundsException
 * - RuntimeException
 * - Exception
 * - switch statement
 * - Helper methods
 * - getClass().getSimpleName()
 * - getMessage()
 * - Program flow
 *
 * Catch Hierarchy:
 *
 * ArithmeticException
 * NullPointerException
 * ArrayIndexOutOfBoundsException
 *             ↓
 *      RuntimeException
 *             ↓
 *         Exception
 *
 * ------------------------------------------------------------
 */

public class MultipleCatchChallenge {

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println(
                "=== Multiple Catch Master Challenge ==="
        );

        // Test 1: ArithmeticException
        handleException("Arithmetic Test", 1);

        // Test 2: NullPointerException
        handleException("Null Test", 2);

        // Test 3: ArrayIndexOutOfBoundsException
        handleException("Array Test", 3);

        // Test 4: RuntimeException category
        handleException("Runtime Test", 4);

        // Program continues after all tests
        System.out.println(
                "\nProgram continues normally."
        );
    }

    /**
     * Executes a selected exception test and handles
     * the resulting exception.
     *
     * @param testName name of the test
     * @param testNumber number identifying the test
     */
    public static void handleException(
            String testName,
            int testNumber) {

        System.out.println("\n--- " + testName + " ---");

        try {

            switch (testNumber) {

                case 1:

                    // Causes ArithmeticException
                    int result = 10 / 0;

                    System.out.println(
                            "Result: " + result
                    );

                    break;

                case 2:

                    // Causes NullPointerException
                    String name = null;

                    System.out.println(
                            name.length()
                    );

                    break;

                case 3:

                    // Causes ArrayIndexOutOfBoundsException
                    int[] numbers = {10, 20, 30};

                    System.out.println(
                            numbers[5]
                    );

                    break;

                case 4:

                    // Causes NullPointerException.
                    // NullPointerException is also a
                    // RuntimeException.
                    int[] values = null;

                    System.out.println(
                            values.length
                    );

                    break;

                default:

                    System.out.println(
                            "No exception test selected."
                    );
            }

        } catch (ArithmeticException e) {

            // Handles arithmetic errors
            printException(e);

        } catch (NullPointerException e) {

            // Handles null reference errors
            printException(e);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handles invalid array index errors
            printException(e);

        } catch (RuntimeException e) {

            // Handles other unchecked exceptions
            printException(e);

        } catch (Exception e) {

            // Handles other exceptions
            printException(e);
        }

        System.out.println(
                "Handled successfully."
        );
    }

    /**
     * Prints information about the caught exception.
     *
     * @param e exception object
     */
    public static void printException(Exception e) {

        System.out.println(
                "Exception type : "
                        + e.getClass().getSimpleName()
        );

        System.out.println(
                "Message : "
                        + e.getMessage()
        );
    }
}

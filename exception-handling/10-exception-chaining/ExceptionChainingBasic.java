/**
 * Custom checked exception representing a database connection failure.
 */
class DatabaseException extends Exception {

    /**
     * Creates a DatabaseException with the specified message.
     *
     * @param message explanation of the database failure
     */
    public DatabaseException(String message) {

        super(message);
    }
}

/**
 * Program: ExceptionChainingBasic
 * Topic: Exception Handling - Exception Chaining
 * Level: Intermediate
 *
 * Description:
 * Demonstrates exception chaining in Java.
 *
 * A DatabaseException is created in connectDatabase().
 * The exception is caught in loadData() and wrapped inside
 * a RuntimeException using the original exception as its cause.
 *
 * The new RuntimeException is then propagated to main(),
 * where both the new exception and its original cause are
 * inspected.
 *
 * Exception Chain:
 *
 *     connectDatabase()
 *             ↓
 *     DatabaseException
 *      "Connection failed"
 *             ↓
 *       catch in loadData()
 *             ↓
 *     RuntimeException
 *      "Loading data failed"
 *             ↓
 *       catch in main()
 *             ↓
 *      getCause()
 *             ↓
 *     DatabaseException
 *
 * Expected Output:
 *
 *     E
 *     B
 *     A
 *     D
 *     G
 *     Loading data failed
 *     Connection failed
 *     H
 *
 * Concepts Used:
 * - Checked exception
 * - Custom exception
 * - throw
 * - throws
 * - Exception chaining
 * - Exception cause
 * - getCause()
 * - getMessage()
 * - try-catch
 * - Exception propagation
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */
public class ExceptionChainingBasic {

    /**
     * Attempts to connect to the database.
     *
     * This method deliberately throws a DatabaseException
     * to demonstrate exception chaining.
     *
     * @throws DatabaseException when the database connection fails
     */
    static void connectDatabase() throws DatabaseException {

        System.out.println("A");

        throw new DatabaseException("Connection failed");
    }

    /**
     * Attempts to load data from the database.
     *
     * If a DatabaseException occurs, it is caught and wrapped
     * inside a RuntimeException. The original exception is
     * passed as the cause so that the original failure is
     * not lost.
     */
    static void loadData() {

        System.out.println("B");

        try {

            connectDatabase();

            // This line is never reached if an exception occurs.
            System.out.println("C");

        } catch (DatabaseException e) {

            System.out.println("D");

            /*
             * Exception chaining:
             *
             * The original DatabaseException becomes
             * the cause of the new RuntimeException.
             */
            throw new RuntimeException(
                    "Loading data failed",
                    e
            );
        }
    }

    /**
     * Program entry point.
     *
     * Calls loadData() and handles the RuntimeException
     * produced by exception chaining.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        System.out.println("E");

        try {

            loadData();

            // This line is never reached if loadData() throws.
            System.out.println("F");

        } catch (RuntimeException e) {

            System.out.println("G");

            // Message of the new/wrapping exception.
            System.out.println(e.getMessage());

            // Message of the original/cause exception.
            System.out.println(
                    e.getCause().getMessage()
            );
        }

        System.out.println("H");
    }
}

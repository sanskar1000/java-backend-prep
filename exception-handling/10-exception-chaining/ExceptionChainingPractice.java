/**
 * Program: ExceptionChainingPractice
 * Topic: Exception Handling - Multi-Level Exception Chaining
 * Level: Intermediate
 *
 * Author: Aradhya Thakur
 * Year: 2026
 *
 * Description:
 * Demonstrates multi-level exception chaining by wrapping an original
 * checked exception inside repository and service-layer exceptions.
 *
 * Exception flow:
 *
 * DatabaseException
 *       ↓
 * RepositoryException
 *       ↓
 * UserServiceException
 *
 * The original exception is preserved as the cause at every layer.
 *
 * Concepts Used:
 * - Custom checked exception
 * - Custom unchecked exceptions
 * - throw
 * - throws
 * - try-catch
 * - Exception chaining
 * - Throwable cause
 * - getCause()
 * - getMessage()
 * - getClass().getSimpleName()
 */
class DatabaseException extends Exception {

    /**
     * Creates a DatabaseException with the specified message.
     *
     * @param message description of the database failure
     */
    public DatabaseException(String message) {
        super(message);
    }
}

/**
 * Represents an exception occurring at the repository layer.
 *
 * The original exception is preserved as the cause.
 */
class RepositoryException extends RuntimeException {

    /**
     * Creates a RepositoryException with a message and original cause.
     *
     * @param message description of the repository failure
     * @param cause original exception that caused this failure
     */
    public RepositoryException(String message, Throwable cause) {
        super(message, cause);
    }
}

/**
 * Represents an exception occurring at the service layer.
 *
 * The repository exception is preserved as the cause.
 */
class UserServiceException extends RuntimeException {

    /**
     * Creates a UserServiceException with a message and original cause.
     *
     * @param message description of the service failure
     * @param cause exception that caused this service failure
     */
    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

/**
 * Demonstrates multi-level exception chaining.
 *
 * The database exception is wrapped first by RepositoryException
 * and then by UserServiceException.
 */
public class ExceptionChainingPractice {

    /**
     * Simulates saving data to a database.
     *
     * @throws DatabaseException when the database connection fails
     */
    static void saveToDatabase() throws DatabaseException {

        throw new DatabaseException(
                "Database connection failed"
        );
    }

    /**
     * Simulates finding a user through the repository layer.
     *
     * The database exception is caught and wrapped inside
     * a RepositoryException.
     */
    static void findUser() {

        try {

            saveToDatabase();

        } catch (DatabaseException e) {

            throw new RepositoryException(
                    "Repository operation failed",
                    e
            );
        }
    }

    /**
     * Simulates user registration through the service layer.
     *
     * The repository exception is caught and wrapped inside
     * a UserServiceException.
     */
    static void registerUser() {

        try {

            findUser();

        } catch (RepositoryException e) {

            throw new UserServiceException(
                    "User registration failed",
                    e
            );
        }
    }

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        try {

            registerUser();

        } catch (UserServiceException e) {

            System.out.println(
                    "Exception : "
                            + e.getClass().getSimpleName()
            );

            System.out.println(
                    "Message   : "
                            + e.getMessage()
            );

            System.out.println(
                    "Cause     : "
                            + e.getCause().getClass().getSimpleName()
            );

            System.out.println(
                    "Cause Msg : "
                            + e.getCause().getMessage()
            );

            System.out.println(
                    "Original  : "
                            + e.getCause()
                                  .getCause()
                                  .getClass()
                                  .getSimpleName()
            );

            System.out.println(
                    "Original Msg : "
                            + e.getCause()
                                  .getCause()
                                  .getMessage()
            );
        }
    }
}

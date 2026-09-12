/**
 * Custom unchecked exception thrown when attempting to register
 * a username that already exists.
 */
class UserAlreadyExistsException extends RuntimeException {

    /**
     * Creates a UserAlreadyExistsException with the specified message.
     *
     * @param message explanation of the exception
     */
    public UserAlreadyExistsException(String message) {

        super(message);
    }
}

/**
 * Custom unchecked exception thrown when a requested user
 * cannot be found.
 */
class UserNotFoundException extends RuntimeException {

    /**
     * Creates a UserNotFoundException with the specified message.
     *
     * @param message explanation of the exception
     */
    public UserNotFoundException(String message) {

        super(message);
    }
}

/**
 * Provides basic user registration and user-search functionality.
 *
 * The service uses a fixed-size array to store usernames and
 * custom exceptions to report invalid operations.
 */
class UserService {

    private final String[] users;
    private int userCount;

    /**
     * Creates a UserService with the specified storage capacity.
     *
     * @param capacity maximum number of users that can be stored
     * @throws IllegalArgumentException if capacity is zero
     *         or negative
     */
    public UserService(int capacity) {

        if (capacity <= 0) {

            throw new IllegalArgumentException(
                    "Capacity must be greater than zero."
            );
        }

        users = new String[capacity];
        userCount = 0;
    }

    /**
     * Registers a new user.
     *
     * The username is first validated, then checked for duplicates,
     * and finally checked against the available storage capacity.
     *
     * @param username username to register
     * @throws IllegalArgumentException if username is null or blank
     * @throws UserAlreadyExistsException if the username is already
     *         registered
     * @throws IllegalStateException if the user storage is full
     */
    public void registerUser(String username) {

        validateUsername(username);

        // Check for duplicate username.
        for (int i = 0; i < userCount; i++) {

            if (users[i].equals(username)) {

                throw new UserAlreadyExistsException(
                        "User already exists: " + username
                );
            }
        }

        // Check whether storage is full.
        if (userCount >= users.length) {

            throw new IllegalStateException(
                    "User storage is full."
            );
        }

        users[userCount] = username;
        userCount++;

        System.out.println(
                "User registered: " + username
        );
    }

    /**
     * Searches for a registered user.
     *
     * @param username username to search for
     * @throws IllegalArgumentException if username is null or blank
     * @throws UserNotFoundException if the username does not exist
     */
    public void findUser(String username) {

        validateUsername(username);

        for (int i = 0; i < userCount; i++) {

            if (users[i].equals(username)) {

                System.out.println(
                        "User found: " + username
                );

                return;
            }
        }

        throw new UserNotFoundException(
                "User not found: " + username
        );
    }

    /**
     * Validates a username.
     *
     * @param username username to validate
     * @throws IllegalArgumentException if username is null or blank
     */
    private void validateUsername(String username) {

        if (username == null || username.isBlank()) {

            throw new IllegalArgumentException(
                    "Username cannot be null or blank."
            );
        }
    }
}

/**
 * Program: ExceptionPractice3
 * Topic: Custom Exceptions with OOP
 * Level: Intermediate
 *
 * Description:
 * Demonstrates custom unchecked exceptions in a simple
 * user-management service.
 *
 * The program supports:
 * - Registering users
 * - Searching for users
 * - Detecting duplicate users
 * - Detecting missing users
 * - Validating usernames
 * - Detecting full user storage
 *
 * Custom Exceptions:
 * - UserAlreadyExistsException
 * - UserNotFoundException
 *
 * Standard Exceptions:
 * - IllegalArgumentException
 * - IllegalStateException
 *
 * Exception Flow:
 *
 *     UserService
 *          │
 *          ├── registerUser()
 *          │       ├── validate username
 *          │       ├── check duplicate
 *          │       └── check capacity
 *          │
 *          └── findUser()
 *                  └── search users
 *
 * Concepts Used:
 * - Custom unchecked exceptions
 * - RuntimeException
 * - throw keyword
 * - Exception hierarchy
 * - Multiple catch blocks
 * - try-catch-finally
 * - Encapsulation
 * - private fields
 * - final reference
 * - Arrays
 * - Constructor validation
 * - Helper methods
 * - Method return
 *
 * Author: Aradhya Thakur
 * Year: 2026
 */
public class ExceptionPractice3 {

    /**
     * Program entry point.
     *
     * Tests user registration and user searching while
     * handling different exception types.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        UserService userService = new UserService(3);

        try {

            // Register users.
            userService.registerUser("Sankar");
            userService.registerUser("Raj");
            userService.registerUser("Amit");

            // Find an existing user.
            userService.findUser("Raj");

            // Attempt to find a missing user.
            userService.findUser("Ramu");

        } catch (UserAlreadyExistsException e) {

            printException(e);

        } catch (UserNotFoundException e) {

            printException(e);

        } catch (IllegalArgumentException e) {

            printException(e);

        } catch (IllegalStateException e) {

            printException(e);

        } finally {

            System.out.println("-Completed-");
        }
    }

    /**
     * Prints basic information about a runtime exception.
     *
     * @param e exception whose details should be displayed
     */
    private static void printException(RuntimeException e) {

        System.out.println(
                "Exception : " + e.getClass().getSimpleName()
        );

        System.out.println(
                "Message   : " + e.getMessage()
        );
    }
}

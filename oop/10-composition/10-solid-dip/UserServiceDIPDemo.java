/**
 * ------------------------------------------------------------
 * Program Name : UserServiceDIPDemo
 * Topic        : Dependency Inversion Principle (DIP)
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the Dependency Inversion Principle.
 *
 * DIP states:
 *
 * 1. High-level modules should not depend on low-level modules.
 *    Both should depend on abstractions.
 *
 * 2. Abstractions should not depend on details.
 *    Details should depend on abstractions.
 *
 * In this example:
 *
 * UserService is the high-level module.
 *
 * MySQLDatabase and MongoDatabase are low-level modules.
 *
 * UserService does NOT directly depend on either database.
 * Instead, it depends on the Database interface.
 *
 * Therefore, we can change the database implementation
 * without modifying UserService.
 *
 * Concepts Used:
 * - Interface
 * - Abstraction
 * - Dependency Injection
 * - Polymorphism
 * - Constructor Injection
 * - Loose Coupling
 * - Dependency Inversion Principle
 *
 * ------------------------------------------------------------
 */


/**
 * Defines the abstraction for database operations.
 *
 * High-level classes depend on this interface instead of
 * depending directly on a particular database.
 */
interface Database {

    /**
     * Saves data to the database.
     *
     * @param data data to be saved
     */
    void save(String data);
}


/**
 * MySQL implementation of the Database interface.
 */
class MySQLDatabase implements Database {

    @Override
    public void save(String data) {

        System.out.println(
                "Saving user to MySQL   : " + data
        );
    }
}


/**
 * MongoDB implementation of the Database interface.
 */
class MongoDatabase implements Database {

    @Override
    public void save(String data) {

        System.out.println(
                "Saving user to MongoDB : " + data
        );
    }
}


/**
 * High-level service responsible for user operations.
 *
 * UserService depends on the Database abstraction rather
 * than a concrete database implementation.
 */
class UserService {

    private final Database database;

    /**
     * Constructor Injection.
     *
     * The required database dependency is provided from
     * outside the class.
     *
     * @param database database implementation
     */
    public UserService(Database database) {

        if (database == null) {

            throw new IllegalArgumentException(
                    "Database cannot be null."
            );
        }

        this.database = database;
    }

    /**
     * Saves a user using the configured database.
     *
     * @param name user name
     */
    public void saveUser(String name) {

        if (name == null || name.isBlank()) {

            throw new IllegalArgumentException(
                    "User name cannot be null or blank."
            );
        }

        database.save(name);
    }
}


/**
 * Demonstrates the Dependency Inversion Principle.
 */
public class UserServiceDIPDemo {

    public static void main(String[] args) {

        // Inject MySQL implementation.
        Database mysqlDatabase =
                new MySQLDatabase();

        UserService mysqlUserService =
                new UserService(mysqlDatabase);

        mysqlUserService.saveUser("Aradhya");

        System.out.println();

        // Inject MongoDB implementation.
        Database mongoDatabase =
                new MongoDatabase();

        UserService mongoUserService =
                new UserService(mongoDatabase);

        mongoUserService.saveUser("Yasir");
    }
}

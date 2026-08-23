# Dependency Inversion Principle — Interview Questions

## Q1. What is the Dependency Inversion Principle?

**Answer:**

The Dependency Inversion Principle states that high-level modules should not depend directly on low-level modules. Both should depend on abstractions.

---

## Q2. What is the main goal of DIP?

**Answer:**

The main goal is to reduce tight coupling and make software more flexible, maintainable, replaceable, and testable.

---

## Q3. What is the difference between DIP and Dependency Injection?

**Answer:**

DIP is a design principle.

Dependency Injection is a technique used to provide dependencies from outside a class.

---

## Q4. Why should `UserService` depend on `Database` instead of `MySQLDatabase`?

**Answer:**

Because `Database` is an abstraction. This allows `UserService` to work with MySQL, MongoDB, PostgreSQL, or other implementations without modifying `UserService`.

---

## Q5. What is tight coupling?

**Answer:**

Tight coupling occurs when one class directly depends on a specific implementation.

Example:

    class UserService {

        private MySQLDatabase database;
    }

Here, `UserService` is directly coupled to `MySQLDatabase`.

---

## Q6. What is loose coupling?

**Answer:**

Loose coupling means classes depend on abstractions rather than concrete implementations.

Example:

    class UserService {

        private Database database;
    }

`UserService` can now work with different implementations of `Database`.

---

## Q7. What type of Dependency Injection is used in this example?

**Answer:**

Constructor Dependency Injection.

The dependency is provided through the constructor:

    public UserService(Database database) {
        this.database = database;
    }

---

## Q8. Why is constructor injection useful?

**Answer:**

Constructor injection ensures that the required dependency is provided when the object is created.

It also prevents the object from being created without its required dependency.

---

## Q9. Can `UserService` work with MongoDB without modifying `UserService`?

**Answer:**

Yes.

Because `MongoDatabase` implements `Database`, we can inject it:

    Database database = new MongoDatabase();

    UserService userService =
            new UserService(database);

No modification to `UserService` is required.

---

## Q10. How does polymorphism help DIP?

**Answer:**

Polymorphism allows an interface reference to refer to different implementation objects.

Example:

    Database database =
            new MySQLDatabase();

Or:

    Database database =
            new MongoDatabase();

`UserService` can work with either implementation.

---

## Q11. What happens if `database` is null?

**Answer:**

The constructor throws an `IllegalArgumentException`.

Example:

    if (database == null) {

        throw new IllegalArgumentException(
            "Database cannot be null."
        );
    }

This prevents `UserService` from being created without its required dependency.

---

## Q12. Which SOLID principle is demonstrated in this example?

**Answer:**

Dependency Inversion Principle — the **D** in SOLID.

---

## Q13. What is an abstraction in this example?

**Answer:**

The `Database` interface is the abstraction.

    interface Database {

        void save(String data);
    }

It defines the required behavior without specifying the implementation.

---

## Q14. What are the low-level modules in this example?

**Answer:**

`MySQLDatabase` and `MongoDatabase` are low-level modules because they contain the concrete database implementation details.

---

## Q15. What is the high-level module?

**Answer:**

`UserService` is the high-level module because it contains the business-level operation of saving a user.

---

## Q16. Why is creating dependencies inside a class considered a problem?

**Answer:**

Creating dependencies directly inside a class tightly couples that class to a specific implementation.

Example:

    class UserService {

        private MySQLDatabase database;

        public UserService() {

            database = new MySQLDatabase();
        }
    }

Now changing the database requires modifying `UserService`.

---

## Q17. How can DIP improve testability?

**Answer:**

A test implementation can be injected instead of a real database.

Example:

    class FakeDatabase implements Database {

        @Override
        public void save(String data) {

            System.out.println(
                "Fake database save."
            );
        }
    }

Then:

    UserService service =
            new UserService(
                new FakeDatabase()
            );

This allows testing without connecting to a real database.

---

## Q18. What is the key difference between DIP and direct dependency?

**Answer:**

### Direct dependency:

    UserService
         |
         v
    MySQLDatabase

### DIP:

    UserService
         |
         v
      Database
       /    \
      ↓      ↓
   MySQL    MongoDB

DIP introduces an abstraction between the high-level and low-level modules.

---

# Quick Interview Revision

## DIP

    High-level module
           ↓
      Abstraction
           ↑
    Low-level module

### Remember:

    DIP = Design Principle

    DI = Technique

    Interface = Abstraction

    Constructor Injection
          ↓
    Dependency provided from outside

    Result
       ↓
    Loose Coupling
       ↓
    Flexibility
       ↓
    Testability

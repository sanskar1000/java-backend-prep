# 11 — Dependency Inversion Principle (DIP)

## Overview

The Dependency Inversion Principle is the fifth principle of SOLID.

DIP says:

1. High-level modules should not depend directly on low-level modules.
2. Both should depend on abstractions.
3. Abstractions should not depend on implementation details.
4. Implementation details should depend on abstractions.

### Main Goals

- Loose coupling
- Flexibility
- Testability
- Maintainability
- Easy replacement of implementations

---

# Problem: Tight Coupling

A tightly coupled design looks like this:

    UserService
         |
         v
    MySQLDatabase

For example:

    class UserService {

        private MySQLDatabase database;

        public UserService() {
            database = new MySQLDatabase();
        }
    }

`UserService` is now directly dependent on `MySQLDatabase`.

If we want to replace MySQL with MongoDB, we must modify `UserService`.

This makes the system tightly coupled.

---

# Solution: Depend on an Abstraction

Create a `Database` interface:

    interface Database {

        void save(String data);
    }

Now different database implementations can implement this interface:

    MySQLDatabase implements Database
    MongoDatabase implements Database

The architecture becomes:

                    Database
                   /        \
                  /          \
             MySQL          MongoDB
                  \          /
                   \        /
                  UserService

`UserService` depends only on the `Database` abstraction.

---

# Project Structure

    11-solid-dip/
    ├── UserDIPDemo.java
    ├── README.md
    └── InterviewQuestions.md

---

# Classes

## 1. Database

`Database` is an abstraction.

    interface Database {

        void save(String data);
    }

It defines what a database should do without specifying how the operation is performed.

---

## 2. MySQLDatabase

`MySQLDatabase` provides one implementation of `Database`.

    class MySQLDatabase implements Database {

        @Override
        public void save(String data) {

            System.out.println(
                "Saving user to MySQL: " + data
            );
        }
    }

---

## 3. MongoDatabase

`MongoDatabase` provides another implementation.

    class MongoDatabase implements Database {

        @Override
        public void save(String data) {

            System.out.println(
                "Saving user to MongoDB: " + data
            );
        }
    }

---

## 4. UserService

`UserService` is the high-level module.

It depends on the `Database` abstraction:

    class UserService {

        private final Database database;

        public UserService(Database database) {

            if (database == null) {
                throw new IllegalArgumentException(
                    "Database cannot be null."
                );
            }

            this.database = database;
        }

        public void saveUser(String name) {

            if (name == null || name.isBlank()) {
                throw new IllegalArgumentException(
                    "User name cannot be null or blank."
                );
            }

            database.save(name);
        }
    }

---

# Dependency Injection

The dependency is created outside `UserService`.

Example:

    Database database = new MySQLDatabase();

    UserService userService =
            new UserService(database);

    userService.saveUser("Aradhya");

The `Database` dependency is provided through the constructor.

This is called:

**Constructor Dependency Injection**

---

# Switching Implementations

We can switch to MongoDB:

    Database database = new MongoDatabase();

    UserService userService =
            new UserService(database);

    userService.saveUser("Aradhya");

Notice that `UserService` does not need to change.

Only the implementation supplied from outside changes.

---

# Why This Is Better

### Without DIP

    UserService
         |
         v
    MySQLDatabase

`UserService` is tightly coupled to MySQL.

### With DIP

    UserService
         |
         v
      Database
       /    \
      /      \
   MySQL    MongoDB

`UserService` is now loosely coupled to the database implementation.

---

# Benefits

## 1. Loose Coupling

`UserService` does not directly depend on `MySQLDatabase`.

It depends on `Database`.

---

## 2. Easy Replacement

We can replace:

    MySQLDatabase

with:

    MongoDatabase

without modifying `UserService`.

---

## 3. Better Testing

A fake or mock implementation can be supplied during testing.

Example:

    class FakeDatabase implements Database {

        @Override
        public void save(String data) {

            System.out.println(
                "Saving to fake database."
            );
        }
    }

This allows `UserService` to be tested without using a real database.

---

## 4. Maintainability

Changes to individual database implementations remain isolated.

---

## 5. Extensibility

New implementations can be added without modifying `UserService`.

Examples:

    PostgreSQLDatabase
    OracleDatabase
    FileDatabase
    FakeDatabase

---

# DIP and Dependency Injection

DIP and Dependency Injection are related but they are not the same thing.

### Dependency Inversion Principle

DIP is a **design principle**.

It tells us:

    Depend on abstractions.

### Dependency Injection

Dependency Injection is a **technique**.

It provides the required dependency from outside the class.

Think of it as:

    DIP
     |
     | Design Principle
     v
    Depend on abstraction

    Dependency Injection
     |
     | Implementation Technique
     v
    Provide dependency from outside

---

# Key Code

The most important part is:

    private Database database;

Instead of:

    private MySQLDatabase database;

And the constructor should accept:

    public UserService(Database database)

Instead of:

    public UserService(MySQLDatabase database)

This allows different implementations to be injected.

---

# Key Takeaway

The main idea of DIP is:

> High-level business logic should not be tightly coupled to low-level implementation details.

In this example:

    UserService
         ↓
      Database
       ↙    ↘
    MySQL   MongoDB

The `Database` interface acts as the abstraction between the high-level service and the low-level implementations.

---

# What I Learned

- Dependency Inversion Principle
- High-level modules
- Low-level modules
- Abstraction
- Loose coupling
- Constructor Dependency Injection
- Interface-based design
- Runtime polymorphism
- Replaceable implementations
- Testability
- Maintainability

---

# SOLID Complete

The five SOLID principles practiced:

    S → Single Responsibility Principle
    O → Open/Closed Principle
    L → Liskov Substitution Principle
    I → Interface Segregation Principle
    D → Dependency Inversion Principle

All five SOLID principles have now been practiced using Java examples.

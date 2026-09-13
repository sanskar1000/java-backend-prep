🔗 Exception Chaining

📌 Overview

Exception chaining is the technique of connecting one exception to another exception while preserving the original cause.

It is especially useful in layered applications such as backend systems, where a low-level exception can be wrapped with a higher-level exception without losing the original problem.

⸻

🧠 Mental Model

Outer Exception
      ↓
    cause
      ↓
Original Exception

Example:

UserServiceException
        ↓
     caused by
        ↓
DatabaseException

The outer exception gives higher-level context, while the cause preserves the original problem.

⸻

🔹 Basic Syntax

try {
    // risky operation
} catch (Exception e) {
    throw new RuntimeException(
        "Operation failed",
        e
    );
}

The second argument e becomes the cause of the new exception.

⸻

🔹 Custom Exception with Cause

class UserServiceException extends RuntimeException {
    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

Usage:

catch (DatabaseException e) {
    throw new UserServiceException(
        "User registration failed",
        e
    );
}

⸻

🔹 Important Methods

getMessage()

Returns the message of the current exception.

e.getMessage();

getCause()

Returns the exception that caused the current exception.

e.getCause();

Example:

System.out.println(e.getMessage());
System.out.println(e.getCause());

⸻

🔹 Example

class DatabaseException extends Exception {
    public DatabaseException(String message) {
        super(message);
    }
}
class UserServiceException extends RuntimeException {
    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
public class ExceptionChainingBasic {
    static void saveUser() throws DatabaseException {
        throw new DatabaseException("Database connection failed");
    }
    static void registerUser() {
        try {
            saveUser();
        } catch (DatabaseException e) {
            throw new UserServiceException(
                "User registration failed",
                e
            );
        }
    }
}

The exception relationship is:

UserServiceException
Message: User registration failed
        ↓
Cause
        ↓
DatabaseException
Message: Database connection failed

⸻

🔹 Why Use Exception Chaining?

Without chaining:

throw new UserServiceException(
    "User registration failed"
);

The original DatabaseException is lost.

With chaining:

throw new UserServiceException(
    "User registration failed",
    e
);

The original exception is preserved.

Benefits

* Preserves the root cause
* Adds higher-level context
* Makes debugging easier
* Helps maintain layered architecture
* Useful for logging
* Prevents important diagnostic information from being lost

⸻

🏗️ Backend Example

A typical backend may have several layers:

Controller
    ↓
Service
    ↓
Repository
    ↓
Database

Suppose the database fails:

DatabaseException
        ↓
Repository
        ↓
UserServiceException
        ↓
Controller

The service can provide meaningful business context while preserving the database exception as the cause.

⸻

⚠️ Common Mistakes

1. Losing the original cause

throw new UserServiceException(
    "Registration failed"
);

❌ Original exception is not preserved.

⸻

2. Correct chaining

throw new UserServiceException(
    "Registration failed",
    e
);

✅ Original exception is preserved.

⸻

3. Confusing message and cause

e.getMessage();

Returns the current exception’s message.

e.getCause();

Returns the original/cause exception.

⸻

🔑 Remember

Exception Type → What kind of problem?
Message → What does this exception say?
Cause → What caused this exception?

⸻

⏱️ Time Complexity

Exception chaining itself:

O(1) for creating the wrapper/cause relationship.

Retrieving the immediate cause:

O(1).

Traversing a long chain of causes:

O(n) where n is the number of chained exceptions.

💾 Space Complexity

O(n) for a chain containing n exception objects.

⸻

🎯 Key Takeaway

Exception chaining lets a higher-level exception add context while preserving the original lower-level exception as its cause.

UserServiceException
        ↓
DatabaseException
        ↓
Root cause

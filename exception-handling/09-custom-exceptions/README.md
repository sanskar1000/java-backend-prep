Custom Exceptions

Custom exceptions allow an application to represent meaningful business and domain-specific failures.

What I Learned

* Creating custom exceptions
* Exception vs RuntimeException
* Checked and unchecked custom exceptions
* throw
* throws
* catch
* super(message)
* Exception hierarchy
* Exception type vs exception message
* Business/domain exceptions
* IllegalArgumentException
* IllegalStateException
* Specific exception handling
* Exception handling with OOP
* Exception handling with arrays

⸻

Custom Exceptions Practiced

1. InvalidAgeException

Used when an age does not satisfy the application’s age requirement.

class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

Example:

if (age < 18) {
    throw new InvalidAgeException(
            "Invalid age. Age must be 18 or above."
    );
}

⸻

2. InsufficientBalanceException

Used when a bank account does not have enough balance for a withdrawal.

class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

Example:

if (amount > balance) {
    throw new InsufficientBalanceException(
            "Balance is insufficient."
    );
}

⸻

3. UserAlreadyExistsException

Used when trying to register a username that already exists.

throw new UserAlreadyExistsException(
        "User already exists: " + username
);

⸻

4. UserNotFoundException

Used when searching for a username that does not exist.

throw new UserNotFoundException(
        "User not found: " + username
);

⸻

Exception Design

Different exceptions represent different problems.

IllegalArgumentException
        ↓
The supplied argument is invalid.
IllegalStateException
        ↓
The object's current state does not allow the operation.
UserAlreadyExistsException
        ↓
A domain-specific duplicate user condition.
UserNotFoundException
        ↓
A domain-specific missing user condition.
InsufficientBalanceException
        ↓
A domain-specific insufficient balance condition.
InvalidAgeException
        ↓
A domain-specific invalid age condition.

⸻

Important Concepts

throw

throw actually throws an exception object.

throw new UserNotFoundException(
        "User not found."
);

throws

throws declares that a method may pass an exception to its caller.

public void readFile() throws IOException {
    // ...
}

catch

catch handles an exception.

catch (UserNotFoundException e) {
    System.out.println(e.getMessage());
}

super(message)

The custom exception constructor passes the message to the parent exception class.

public UserNotFoundException(String message) {
    super(message);
}

The message can later be retrieved using:

e.getMessage();

⸻

Specific Catch Before General Catch

Exception handlers should be ordered from more specific to more general.

catch (UserNotFoundException e) {
    // specific
}
catch (IllegalArgumentException e) {
    // more general
}
catch (RuntimeException e) {
    // even more general
}

A parent exception catch must not appear before a child exception catch when both are intended to be handled separately.

⸻

Exception Control Flow

When an exception is thrown inside a try block:

try
 ↓
Exception occurs
 ↓
Remaining statements in try are skipped
 ↓
Matching catch executes
 ↓
finally executes
 ↓
Program continues if exception was handled

Example:

try {
    checkAge(16);
    System.out.println("This is skipped.");
}
catch (InvalidAgeException e) {
    System.out.println(e.getMessage());
}
finally {
    System.out.println("-Completed-");
}

⸻

Key Learning

A custom exception should represent a meaningful application condition.

Do not create a custom exception for every possible error.

Use:

IllegalArgumentException

when the supplied argument itself is invalid.

Use:

IllegalStateException

when the object’s current state prevents the operation.

Use a custom exception when the application has a meaningful domain-specific condition.

⸻

Practices Completed

* Practice 1 — Basic Custom Exception
* Practice 2 — Bank Account
* Practice 3 — User Registration and Lookup

⸻

Technologies / Concepts Used

* Java
* Classes and Objects
* Constructors
* Methods
* Encapsulation
* Arrays
* Loops
* if statements
* Exception Handling
* Custom Exceptions
* RuntimeException
* throw
* catch
* finally
* Exception Hierarchy

⸻

Key Takeaway

Custom exceptions make application failures more meaningful and easier to understand.

Instead of treating every failure as a generic exception, the exception type can communicate exactly what went wrong.

throw new UserNotFoundException(
        "User not found: " + username
);

The exception type communicates the category of failure, while the message provides additional details.

🔄 Rethrowing Exceptions

📌 Overview

Rethrowing means catching an exception and throwing the same exception again so that it can continue propagating to a higher layer.

Rethrowing is useful when the current method cannot completely handle or recover from the problem.

⸻

🧠 Mental Model

Exception occurs
      ↓
catch
      ↓
local work
(logging / cleanup / inspection)
      ↓
throw e
      ↓
same exception continues upward

⸻

🔹 Basic Rethrowing

try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Exception caught");
    throw e;
}

The statement:

throw e;

throws the same exception object again.

⸻

🔹 Rethrowing vs Exception Chaining

Rethrowing

catch (Exception e) {
    throw e;
}

The same exception is thrown again.

DatabaseException
      ↓
catch
      ↓
same DatabaseException
      ↓
caller

Exception Chaining

catch (DatabaseException e) {
    throw new RuntimeException(
        "Database operation failed",
        e
    );
}

A new exception is created and the original exception becomes its cause.

RuntimeException
      ↓ cause
DatabaseException

Key Difference

throw e
→ same exception
throw new Exception(message, e)
→ new exception + original cause

⸻

🔹 Partial Handling + Rethrowing

A method can perform some local work and then rethrow the exception.

try {
    processPayment();
} catch (PaymentException e) {
    logError(e);
    cleanup();
    throw e;
}

The method has performed local work but has not completely resolved the problem.

⸻

🔹 Why Rethrow?

A lower layer may:

* Log useful diagnostic information
* Perform cleanup
* Inspect the exception
* Update local state
* Then allow a higher layer to decide the final response

Example:

Controller
    ↓
Service
    ↓
Repository
    ↓
Database

The Repository may detect a database failure but may not be responsible for deciding what response the user should receive.

It can rethrow the exception to the Service layer.

⸻

🔹 Handle vs Rethrow vs Wrap

Handle

Use when the current layer can recover or respond appropriately.

catch (NumberFormatException e) {
    System.out.println("Invalid number");
}

Rethrow

Use when the current layer cannot properly handle the problem.

catch (DatabaseException e) {
    logError(e);
    throw e;
}

Wrap + Cause

Use when a higher layer needs to add meaningful context.

catch (DatabaseException e) {
    throw new UserServiceException(
        "User registration failed",
        e
    );
}

⸻

🔹 Avoid Swallowing Exceptions

Avoid:

try {
    saveUser();
} catch (Exception e) {
}

This silently discards the exception.

The problem becomes difficult to diagnose and important information may be lost.

⸻

🔹 Rethrowing and Exception Propagation

Consider:

static void methodA() {
    try {
        int x = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Caught in A");
        throw e;
    }
}

If the caller does not catch the exception, it continues propagating.

methodA()
   ↓
catch
   ↓
throw e
   ↓
caller
   ↓
JVM / another catch

⸻

🔹 Important Rule

Catching an exception does not necessarily mean the exception is fully handled.

catch (Exception e) {
    throw e;
}

The exception was caught, but it was immediately rethrown.

Therefore it continues propagating.

⸻

🏗️ Backend Example

Controller
     ↓
Service
     ↓
Repository
     ↓
Database

Suppose the Repository catches a database exception:

catch (DatabaseException e) {
    logger.error("Database operation failed", e);
    throw e;
}

The Repository records useful information and rethrows the exception.

The Service can then decide whether to:

* Handle it
* Rethrow it
* Wrap it with a domain-specific exception

⸻

⚠️ Common Mistakes

Mistake 1 — Thinking throw e creates a new exception

throw e;

❌ It does not create a new exception.

It rethrows the same exception object.

⸻

Mistake 2 — Thinking catch means the problem is solved

catch (Exception e) {
    throw e;
}

The exception is caught but not fully handled.

It continues propagating.

⸻

Mistake 3 — Losing the cause

catch (DatabaseException e) {
    throw new RuntimeException("Database failed");
}

The original cause is not preserved.

Better:

catch (DatabaseException e) {
    throw new RuntimeException(
        "Database failed",
        e
    );
}

⸻

Mistake 4 — Swallowing exceptions

catch (Exception e) {
}

❌ Avoid this unless there is a very deliberate reason and the failure is genuinely safe to ignore.

⸻

🔑 Key Takeaways

throw e
→ rethrow same exception
catch + throw e
→ partial handling + propagation
throw new Exception(message, e)
→ new exception + preserved cause
Handle
→ recover/respond at current layer
Rethrow
→ let a higher layer handle it
Wrap
→ add context while preserving cause

⸻

⏱️ Time Complexity

Rethrowing an exception itself is effectively O(1).

Traversing or processing a longer exception propagation chain depends on the number of stack frames and handlers involved.

⸻

💾 Space Complexity

The exception object already exists when rethrowing:

throw e;

No new exception object is created merely by rethrowing.

Creating a new wrapper exception requires additional memory.

⸻

🎯 Interview Definition

Rethrowing is the process of catching an exception, performing any necessary local work, and throwing the same exception again so that a higher layer can handle it.

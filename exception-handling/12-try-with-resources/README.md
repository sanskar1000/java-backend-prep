☕ Lesson 15 — Try-With-Resources

📌 Overview

Try-with-resources is a Java feature used to automatically close resources after they are no longer needed.

It is especially useful when working with resources such as:

* Files
* Streams
* Database connections
* Sockets
* Readers and Writers
* Other objects that implement AutoCloseable

Instead of manually closing resources inside finally, Java can close them automatically.

⸻

🎯 Learning Objectives

After completing this lesson, I can:

* Understand why resources need to be closed
* Understand try-with-resources
* Use AutoCloseable
* Use multiple resources
* Understand resource creation order
* Understand resource closing order
* Understand LIFO cleanup
* Understand primary exceptions
* Understand suppressed exceptions
* Use getSuppressed()
* Use existing resources with try (resource)
* Understand effectively final resources

⸻

1. Why Do Resources Need to Be Closed?

Some resources use external system resources.

Examples:

File → Operating System
Database Connection → Database
Socket → Network
Stream → Operating System / I/O system

If these resources are not closed properly, they can cause:

* Resource leaks
* File descriptor exhaustion
* Database connection exhaustion
* Memory/resource pressure
* Unstable applications

⸻

2. Traditional Resource Handling

Before try-with-resources, developers commonly used finally:

Resource resource = null;
try {
    resource = openResource();
    // Use resource
} finally {
    if (resource != null) {
        resource.close();
    }
}

This works, but it can become verbose and error-prone.

Try-with-resources provides cleaner automatic cleanup.

⸻

3. Basic Syntax

try (ResourceType resource = createResource()) {
    // Use resource
} catch (Exception e) {
    // Handle exception
}

Example:

try (FileInputStream file =
         new FileInputStream("data.txt")) {
    // Use file
} catch (IOException e) {
    System.out.println("File error");
}

Java automatically calls:

file.close();

when leaving the try block.

⸻

4. AutoCloseable

A resource must implement:

AutoCloseable

Example:

class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Resource closed");
    }
}

Then:

try (MyResource resource = new MyResource()) {
    System.out.println("Using resource");
}

Java automatically calls:

resource.close();

⸻

5. AutoCloseable vs Closeable

Closeable extends AutoCloseable.

Conceptually:

AutoCloseable
      ↑
  Closeable
      ↑
I/O resources

Therefore:

Every Closeable is AutoCloseable.

But:

Not every AutoCloseable is Closeable.

AutoCloseable is the more general interface.

⸻

6. Multiple Resources

Java allows multiple resources:

try (
    MyResource resourceA = new MyResource("A");
    MyResource resourceB = new MyResource("B");
    MyResource resourceC = new MyResource("C")
) {
    // Use resources
}

Resources are created from left to right:

A → B → C

Resources are closed from right to left:

C → B → A

This is called:

LIFO
Last In, First Out

⸻

7. Resource Creation and Closing

If:

try (
    A a = ...;
    B b = ...;
    C c = ...
) {
}

Then:

Creation:
A
↓
B
↓
C
Closing:
C
↓
B
↓
A

Think of resources as a stack:

       C  ← first closed
       B
       A  ← last closed

⸻

8. Exception During the Try Block

Consider:

try (MyResource resource = new MyResource()) {
    throw new RuntimeException("Try failed");
}

The exception does not prevent resource cleanup.

The flow is:

Try block
   ↓
Exception occurs
   ↓
Resource close()
   ↓
catch

Therefore, resources are still closed even when the try block throws an exception.

⸻

9. Primary Exception

If the try block throws:

throw new RuntimeException("Try failed");

that exception becomes the:

Primary Exception

It is the main exception that the catch block receives.

⸻

10. Suppressed Exceptions

Suppose:

Try block → throws Exception A
close() → throws Exception B

Java keeps:

Exception A → Primary
Exception B → Suppressed

The cleanup exception does not replace the original exception.

You can access suppressed exceptions using:

e.getSuppressed()

Example:

for (Throwable t : e.getSuppressed()) {
    System.out.println(t.getMessage());
}

⸻

11. Multiple Suppressed Exceptions

If:

Try → Exception A
Resource C → closes successfully
Resource B → Exception B
Resource A → Exception C

Then:

Primary:
Exception A
Suppressed:
Exception B
Exception C

This preserves all relevant failure information.

⸻

12. Primary vs Suppressed

Primary exception

The main failure that occurred during the try operation.

Main operation failed

Suppressed exception

An additional failure that occurred while Java was cleaning up resources.

Close B failed
Close A failed

Mental model:

                Primary
                   ↓
          Main operation failed
             ↙          ↘
    Suppressed B     Suppressed A

⸻

13. getCause() vs getSuppressed()

These are different concepts.

getCause()

Answers:

What caused this exception?

Example:

UserServiceException
        ↓ cause
DatabaseException

getSuppressed()

Answers:

What additional exceptions occurred while handling/cleaning up this operation?

Example:

Primary exception
      ↓
Suppressed exception
      ↓
Suppressed exception

⸻

14. Existing Resources — Java 9+

A resource can already exist before the try block.

Example:

MyResource resource = new MyResource("A");
try (resource) {
    System.out.println("Using resource");
}

The resource is still automatically closed.

The resource must be:

final

or:

effectively final

Example:

MyResource resource = new MyResource("A");
try (resource) {
}

This works because resource is never reassigned.

⸻

15. Effectively Final

A variable is effectively final when it is assigned once and never reassigned.

Valid:

MyResource resource = new MyResource("A");
try (resource) {
}

Invalid:

MyResource resource = new MyResource("A");
resource = new MyResource("B");
try (resource) {
}

The second example reassigned the variable.

⸻

16. Practice Program

The practice program in this folder demonstrates:

* Multiple resources
* AutoCloseable
* Resource creation
* LIFO closing
* Primary exception
* Suppressed exceptions
* getSuppressed()
* Automatic cleanup

File:

TryWithResourcesPractice.java

⸻

🧠 Core Mental Model

Remember:

OPEN
 ↓
USE
 ↓
TRY COMPLETES OR FAILS
 ↓
CLOSE AUTOMATICALLY
 ↓
CATCH
 ↓
CONTINUE

For multiple resources:

Create:
A → B → C
Close:
C → B → A

For exceptions:

Try exception
     ↓
PRIMARY
Close exceptions
     ↓
SUPPRESSED

⸻

⚠️ Common Mistakes

Mistake 1 — Thinking AutoCloseable automatically closes everything

Incorrect:

implements AutoCloseable
     ↓
automatically closed everywhere

The automatic behavior occurs when the resource is used in:

try (resource) {
}

or:

try (Resource resource = ...) {
}

⸻

Mistake 2 — Closing resources in creation order

Incorrect:

A → B → C

Correct:

C → B → A

⸻

Mistake 3 — Losing the primary exception

Try-with-resources preserves the try-block exception as the primary exception when cleanup also fails.

⸻

Mistake 4 — Confusing cause and suppressed exceptions

getCause()
→ original underlying cause
getSuppressed()
→ additional cleanup exceptions

⸻

Mistake 5 — Thinking an exception prevents close()

It does not.

Try-with-resources performs cleanup even when the try block throws.

⸻

💼 Backend Relevance

Try-with-resources is highly relevant to backend development.

Common examples include:

File resources
Database resources
JDBC statements
Result sets
Input/output streams
Network resources

Example JDBC-style structure:

try (
    Connection connection = dataSource.getConnection();
    PreparedStatement statement = connection.prepareStatement(sql);
    ResultSet resultSet = statement.executeQuery()
) {
    // Process database results
} catch (SQLException e) {
    // Handle database failure
}

The resources are automatically closed in reverse order.

⸻

⏱️ Complexity

Try-with-resources itself does not change the algorithmic complexity of the operation being performed.

Resource cleanup occurs once for each acquired resource.

For n resources:

Time: O(n)
Space: O(n)

The actual complexity of the program still depends on what the resources are doing.

⸻

🎯 Interview Questions

Q1. What is try-with-resources?

A Java feature that automatically closes resources implementing AutoCloseable when leaving the try block.

Q2. What interface must a resource implement?

AutoCloseable

Q3. In what order are multiple resources closed?

Reverse order of creation/acquisition.

A → B → C
C → B → A

Q4. What is a suppressed exception?

An exception that occurs during resource cleanup while another exception is already the primary exception.

Q5. How do you access suppressed exceptions?

e.getSuppressed()

Q6. What happens if the try block succeeds but close() throws?

The close exception becomes the primary exception because there is no earlier try-block exception.

Q7. What happens if both the try block and close() throw?

The try-block exception remains primary and the close exception becomes suppressed.

Q8. Can an existing resource be used in try-with-resources?

Yes, since Java 9, if the variable is final or effectively final.

⸻

✅ Lesson Status

Lesson 15 — Try-With-Resources: COMPLETE

Concepts completed:

* Resource management
* AutoCloseable
* Closeable
* Basic try-with-resources
* Multiple resources
* LIFO closing
* Exception during try
* Primary exception
* Suppressed exceptions
* getSuppressed()
* Existing resources
* Effectively final resources
* Backend relevance
* Practice challenge
* Mastery challenge

⸻

📂 Files

15-try-with-resources/
├── README.md
└── TryWithResourcesPractice.java

Next lesson: 16-suppressed-exceptions — advanced mastery of suppressed exceptions, including multiple cleanup failures and how Java internally preserves those failures.

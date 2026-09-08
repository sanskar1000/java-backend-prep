Java Exception Handling — throws

📚 What I Learned

* What throws means
* Checked exceptions
* throw vs throws
* Exception propagation
* Specific vs general exception declarations
* Multiple throws declarations
* Catch ordering
* throws Exception vs specific exceptions
* Handling vs declaring exceptions

⸻

🔄 Exception Flow

main()
   ↓
testTransaction()
   ↓
processTransaction()
   ↓
loadAccount()
   ↓
FileNotFoundException
   ↓
Propagation
   ↓
testTransaction() catch
   ↓
Exception handled
   ↓
finally

⸻

🔑 Key Rules

1. Checked Exception

A checked exception must be:

Handled with try-catch
        OR
Declared with throws

2. throw

throw actually throws an exception object.

throw new FileNotFoundException("File not found");

3. throws

throws declares that a method may propagate an exception to its caller.

static void loadAccount()
        throws FileNotFoundException {
}

4. Exception Hierarchy

Exception
   ↑
IOException
   ↑
FileNotFoundException

A method can declare the same exception or a parent type:

throws FileNotFoundException
throws IOException
throws Exception

5. Catch Ordering

Always place specific exceptions before general exceptions:

catch (FileNotFoundException e) {
    
}
catch (Exception e) {
    
}

Never put:

catch (Exception e) {
    
}
catch (FileNotFoundException e) {
    
}

because the second catch becomes unreachable.

⸻

💻 What I Practiced

* Basic throws
* Checked exception handling
* throw + throws
* Exception propagation
* Multiple method propagation
* Debugging compilation errors
* Output prediction
* Specific vs general exceptions
* Multiple catch blocks
* finally
* Bank transaction exception-handling system

⸻

🏦 Master Challenge

Bank Transaction System

The project demonstrates:

Account Loading
      ↓
Transaction Validation
      ↓
Transaction Processing
      ↓
Exception Handling
      ↓
Cleanup

Exceptions Used

* FileNotFoundException
* IllegalArgumentException
* General Exception

Concepts Demonstrated

throw
throws
try
catch
finally
Exception propagation
Exception hierarchy
Checked exceptions
Unchecked exceptions

⸻

🧠 Important Takeaways

throw = actually throws an exception.

throws = declares that a method may propagate an exception.

Checked exception = must be handled or declared.

Catch order = specific → general.

Prefer specific exception declarations over unnecessarily using throws Exception.

⸻

📂 Project Structure

08-throws/
│
├── README.md
├── ThrowsBasic.java
├── ThrowsChain.java
└── ThrowsMasterChallenge.java

⸻

✅ Result

Lesson: 08 — throws

Status: Completed ✅

Master Challenge: Completed ✅

GitHub Practice: Completed ✅

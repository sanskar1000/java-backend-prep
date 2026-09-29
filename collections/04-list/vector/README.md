📦 Vector — Java Collections

Vector is a legacy dynamic-array implementation provided by Java’s Collections Framework.

It stores elements in a dynamically growing array and maintains elements in insertion order.

Vector implements the List interface and is synchronized, meaning its individual methods provide built-in synchronization.

import java.util.Vector;

⸻

📌 What is Vector?

A Vector is a resizable array.

Unlike a normal array:

int[] numbers = new int[5];

a Vector can automatically grow when more elements are added.

Example:

Vector
┌────┬────┬────┬────┬────┐
│ 10 │ 20 │ 30 │ 40 │ 50 │
└────┴────┴────┴────┴────┘

If more elements are added, its internal storage can grow automatically.

⸻

🧠 Why Does Vector Exist?

Java originally provided Vector as a growable array before the modern Collections Framework was introduced.

Later, Java introduced the List interface and implementations such as:

List
 ├── ArrayList
 ├── LinkedList
 └── Vector

Vector was retrofitted to implement List.

Because Vector is a legacy class and synchronizes its methods, modern Java code commonly uses:

ArrayList

instead when thread safety is not specifically required.

⸻

🔹 Creating a Vector

import java.util.Vector;
public class VectorBasics {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
    }
}

Output:

[10, 20, 30]

⸻

📚 Important Characteristics

Property	Vector
Data structure	Dynamic array
Interface	List
Maintains order	Yes
Allows duplicates	Yes
Allows null	Yes
Random access	Yes
Automatically grows	Yes
Synchronized	Yes
Thread-safe methods	Yes
Legacy class	Yes
Package	java.util
Generic support	Yes

⸻

🔢 Generics with Vector

Always prefer generics.

Vector<Integer> numbers = new Vector<>();
Vector<String> names = new Vector<>();

Avoid raw types:

Vector vector = new Vector();

Generics provide compile-time type safety.

⸻

➕ Adding Elements

add()

Adds an element at the end.

Vector<Integer> numbers = new Vector<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);

Result:

[10, 20, 30]

⸻

add(index, element)

Adds an element at a specific position.

numbers.add(1, 15);

Result:

[10, 15, 20, 30]

Elements after the insertion point are shifted.

⸻

🔍 Accessing Elements

get()

System.out.println(numbers.get(1));

Random access is efficient because Vector uses an array internally.

Typical complexity:

O(1)

⸻

✏️ Updating Elements

set()

numbers.set(1, 100);

Before:

[10, 20, 30]

After:

[10, 100, 30]

Typical complexity:

O(1)

⸻

❌ Removing Elements

remove(index)

numbers.remove(1);

Removes the element at the specified index.

Example:

Before:
[10, 20, 30]
remove(1)
After:
[10, 30]

Removing from the middle requires shifting elements.

Typical complexity:

O(n)

⸻

remove(Object)

Be careful when using Vector<Integer>.

numbers.remove(Integer.valueOf(20));

This removes the value 20.

This is different from:

numbers.remove(20);

which attempts to remove the element at index 20.

Important Java concept

With:

Vector<Integer> numbers;

this:

numbers.remove(20);

calls:

remove(int index)

while:

numbers.remove(Integer.valueOf(20));

calls:

remove(Object object)

This is an important Collections + method-overloading concept.

⸻

📏 Size

Use:

numbers.size();

Example:

System.out.println(numbers.size());

Returns the number of elements currently stored.

Typical complexity:

O(1)

⸻

🧱 Capacity vs Size

This is an important Vector concept.

Size

Number of actual elements.

numbers.size();

Capacity

Amount of internal storage currently available.

numbers.capacity();

Example:

Size     = 3
Capacity = 10

This means:

3 elements are currently stored
10 element positions are available internally

Capacity is not the same thing as size.

⸻

📈 Capacity Management

Vector provides methods for controlling capacity.

capacity()

numbers.capacity();

Returns the current capacity.

⸻

ensureCapacity()

numbers.ensureCapacity(50);

Ensures that the Vector has enough capacity for at least 50 elements.

⸻

trimToSize()

numbers.trimToSize();

Reduces capacity to match the current size.

⸻

🔄 Traversing a Vector

Enhanced for loop

for (Integer number : numbers) {
    System.out.println(number);
}

⸻

Traditional for loop

for (int i = 0; i < numbers.size(); i++) {
    System.out.println(numbers.get(i));
}

⸻

Iterator

Iterator<Integer> iterator = numbers.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

Import:

import java.util.Iterator;

⸻

🔎 Searching

contains()

numbers.contains(30);

Returns:

true

if the element exists.

Typical complexity:

O(n)

⸻

indexOf()

numbers.indexOf(30);

Returns the first matching index.

Typical complexity:

O(n)

⸻

lastIndexOf()

numbers.lastIndexOf(30);

Returns the last matching index.

Typical complexity:

O(n)

⸻

🧹 Clearing the Vector

clear()

numbers.clear();

Removes all elements.

Example:

Before:
[10, 20, 30]
After:
[]

⸻

🔍 Checking Whether Vector Is Empty

numbers.isEmpty();

Returns:

true

or:

false

⸻

🧩 Important Vector Methods

Method	Purpose
add()	Add element
add(index, element)	Insert at index
get()	Access element
set()	Replace element
remove(index)	Remove by index
remove(Object)	Remove by value
size()	Number of elements
capacity()	Current capacity
contains()	Check existence
indexOf()	Find first occurrence
lastIndexOf()	Find last occurrence
isEmpty()	Check whether empty
clear()	Remove all elements
firstElement()	Get first element
lastElement()	Get last element
ensureCapacity()	Increase minimum capacity
trimToSize()	Reduce capacity to size

⸻

⚙️ Time Complexity

Operation	Typical Complexity
get(index)	O(1)
set(index, value)	O(1)
add(value)	O(1) amortized
add(index, value)	O(n)
remove(index)	O(n)
remove(value)	O(n)
contains(value)	O(n)
indexOf(value)	O(n)
size()	O(1)
isEmpty()	O(1)
clear()	O(n)

Complexity can depend on the exact operation and where elements are located. add(value) is generally O(1) amortized because occasional resizing can require copying elements.

⸻

🔄 Vector vs ArrayList

Both are dynamic-array-based List implementations.

Feature	Vector	ArrayList
Dynamic array	Yes	Yes
Maintains insertion order	Yes	Yes
Allows duplicates	Yes	Yes
Random access	O(1)	O(1)
Synchronized methods	Yes	No
Legacy	Yes	No
Typical modern choice	Less common	Common
Performance overhead	Generally higher due to synchronization	Generally lower

Important

Do not assume:

Vector = thread-safe collection for every possible use case

Its methods are synchronized, but designing thread-safe compound operations may still require external synchronization or other concurrency mechanisms.

⸻

🧠 Vector vs LinkedList

Feature	Vector	LinkedList
Internal structure	Dynamic array	Doubly linked list
Random access	O(1)	O(n)
Insert at beginning	O(n)	O(1)
Remove at beginning	O(n)	O(1)
Memory locality	Generally better	Generally worse
Synchronization	Yes	No
Legacy	Yes	No

The exact practical performance depends on the workload and implementation details.

⸻

🔐 Synchronization

Vector’s methods are synchronized.

For example:

public synchronized boolean add(E e)

This means individual method calls are protected by synchronization.

However, multiple operations are not automatically one atomic transaction.

Example:

if (!vector.contains(value)) {
    vector.add(value);
}

Another thread could modify the Vector between these operations.

Therefore, thread safety at the method level does not automatically make every multi-step operation atomic.

⸻

🧠 Important Interview Concept

Question:

Why is Vector considered a legacy class?

Answer:

Vector predates the modern Java Collections Framework.

It was later integrated into the framework by implementing List.

It also synchronizes its methods, which can introduce unnecessary synchronization overhead when thread safety is not required.

Modern Java applications generally prefer ArrayList for ordinary list usage and use other concurrency mechanisms or collections when concurrent access is actually required.

⸻

🧪 Practice Programs

Level 1 — Basics

* Create a Vector
* Add elements
* Print Vector
* Get element
* Update element
* Remove element
* Find size
* Check empty
* Check contains

⸻

Level 2 — Operations

* Insert at index
* Remove by index
* Remove by value
* Find first occurrence
* Find last occurrence
* Traverse using for loop
* Traverse using enhanced for loop
* Traverse using Iterator
* Clear Vector

⸻

Level 3 — Capacity

* Check size
* Check capacity
* Use ensureCapacity()
* Use trimToSize()
* Understand size vs capacity
* Observe capacity growth experimentally

⸻

Level 4 — Interview Practice

* Vector vs ArrayList
* Vector vs LinkedList
* Why Vector is synchronized
* Why Vector is considered legacy
* Size vs capacity
* remove(int) vs remove(Object)
* Random access complexity
* Amortized complexity
* Thread safety vs atomicity

⸻

⚠️ Common Mistakes

1. Confusing size and capacity

Wrong assumption:

capacity == number of elements

They are different concepts.

⸻

2. Confusing remove(index) and remove(value)

For:

Vector<Integer> numbers;

this:

numbers.remove(10);

means:

remove element at index 10

while:

numbers.remove(Integer.valueOf(10));

means:

remove the value 10

⸻

3. Assuming synchronization makes everything thread-safe

Individual synchronized methods do not automatically make a sequence of operations atomic.

⸻

4. Using Vector automatically because threads are involved

Thread safety requirements should be analyzed based on the actual access pattern.

There are modern concurrent collections and synchronization techniques designed for different workloads.

⸻

5. Treating Vector like a Linked List

Vector is internally a dynamic array.

Therefore:

get(index) → O(1)

but inserting/removing in the middle requires shifting elements.

⸻

🎯 When Should You Use Vector?

Understand Vector because it is part of Java’s Collections Framework and appears in legacy code and interviews.

For new code, first consider whether you actually need Vector’s synchronization behavior.

For ordinary list usage:

List<Integer> numbers = new ArrayList<>();

is usually the more appropriate starting point.

If concurrent access is required, choose a collection or synchronization strategy based on the actual concurrency requirements.

⸻

🧠 Key Mental Model

Remember Vector as:

Vector
   ↓
List
   ↓
Dynamic Array
   ↓
Ordered
   ↓
Duplicates Allowed
   ↓
Random Access
   ↓
Synchronized Methods
   ↓
Legacy Collection

⸻

📝 Notes Structure

For every Vector concept, maintain concise notes using:

Concept
↓
What?
↓
Why?
↓
How?
↓
Example
↓
Complexity
↓
Common Mistake
↓
Interview Question

Do not memorize every method individually.

Understand:

Structure
+
Operations
+
Complexity
+
When to use
+
When not to use

⸻

🏆 Completion Checklist

Fundamentals

* What is Vector?
* Why was Vector created?
* Why is Vector a legacy class?
* Vector implements List
* Understand dynamic array
* Understand insertion order
* Understand duplicates
* Understand null

Operations

* add()
* get()
* set()
* remove()
* contains()
* indexOf()
* lastIndexOf()
* size()
* isEmpty()
* clear()

Capacity

* capacity()
* ensureCapacity()
* trimToSize()
* Size vs capacity

Advanced

* Synchronization
* Thread safety
* Atomicity
* Vector vs ArrayList
* Vector vs LinkedList
* Amortized complexity
* remove(int) vs remove(Object)

⸻

🚀 Learning Goal

The goal is not to memorize Vector’s API.

The goal is to understand:

What is Vector?
       ↓
How is it implemented?
       ↓
How does it grow?
       ↓
How do operations work?
       ↓
What are their complexities?
       ↓
Why is it synchronized?
       ↓
Why is it considered legacy?
       ↓
When should modern Java code use something else?

⸻

Core Principle:
Vector is a dynamically resizable array and a legacy List implementation with synchronized methods. Understand it well enough to read legacy Java code, answer interview questions, and make informed collection choices—but do not confuse familiarity with a requirement to use it in every modern Java application.

Java Collections — Collections Foundation

This module introduces the fundamental concepts of the Java Collections Framework (JCF) and builds the foundation required to work confidently with Java collections.

The focus is on understanding why collections exist, how the major interfaces differ, and how interfaces and implementation classes are used together.

⸻

📚 Topics Covered

* Why Collections exist
* Arrays vs Collections
* Java Collections Framework
* Collection
* Collections
* Collectors — basic distinction
* Core Collection interfaces
* List
* Set
* Queue
* Deque
* Map
* Interface vs Implementation
* Programming to an Interface
* List characteristics
* Basic iteration
* Basic Iterator concepts
* Stack and LIFO
* Queue and FIFO
* Linked List fundamentals
* Array vs Linked List
* Basic Big-O connection

⸻

1. Why Do Collections Exist?

Java arrays are useful for storing multiple values, but an array has a fixed size after creation.

int[] numbers = new int[5];

If the program later needs more elements, the array itself cannot automatically grow.

Collections provide ready-made data structures that support different requirements and behaviors.

Examples:

ArrayList       → Resizable list
HashSet         → Unique elements
HashMap         → Key-value associations
PriorityQueue   → Priority-based retrieval
ArrayDeque      → Operations at both ends

The important principle is:

Choose a data structure based on the requirements of the problem.

⸻

2. Java Collections Framework

The Java Collections Framework (JCF) is a framework containing interfaces, implementation classes, and utility functionality for working with groups of objects.

A simplified view:

Collections Framework
│
├── Interfaces
│
├── Implementation Classes
│
└── Utility APIs

Different data structures provide different behaviors and performance characteristics.

⸻

3. Collection vs Collections vs Collectors

These names are similar but represent different concepts.

Collection

Collection is an interface representing a group of objects.

Common operations include:

add()
remove()
contains()
size()
isEmpty()

Collections

Collections is a utility class containing static utility methods for working with collections.

Examples:

Collections.sort(list);
Collections.reverse(list);

Collectors

Collectors is associated with Java’s Stream API and provides collector implementations used to accumulate stream results.

Streams and Collectors will be studied in a later module.

Summary

Collection   → Interface
Collections  → Utility class
Collectors   → Stream-related utility class

⸻

4. Core Collection Interfaces

A simplified mental model:

Collection
│
├── List
├── Set
└── Queue
     │
     └── Deque
Map

Important:

Map is part of the Java Collections Framework, but Map does not extend Collection.

⸻

5. List

List represents an ordered sequence of elements.

Important characteristics:

* Allows duplicates
* Maintains order
* Supports positional/index-based operations

Example:

List<String> names = new ArrayList<>();
names.add("Aradhya");
names.add("Rahul");
names.add("Aradhya");

Conceptually:

Index:    0          1        2
        [Aradhya]  [Rahul]  [Aradhya]

Duplicates are allowed and insertion order is maintained.

Index-based access:

names.get(1);

returns:

Rahul

⸻

6. Set

A Set represents a collection that does not allow duplicate elements according to its equality semantics.

Example:

Set<String> names = new HashSet<>();
names.add("Java");
names.add("Java");

The logically duplicate value is not stored twice.

Different Set implementations provide different ordering and performance characteristics.

⸻

7. Queue

A Queue represents elements waiting to be processed according to the queue’s ordering policy.

The classic queue model is:

FIFO
First In → First Out

Example:

Person A → Person B → Person C
    ↓
Person A is processed first

Specific queue implementations can provide different ordering behavior, so the implementation’s contract matters.

⸻

8. Deque

Deque means:

Double-Ended Queue

A deque supports insertion and removal operations at both ends.

Conceptually:

front                         back
  ↓                             ↓
[10] ⇄ [20] ⇄ [30] ⇄ [40]
  ↑                             ↑
add/remove                  add/remove

Memory connection:

Stack → LIFO
Queue → FIFO
Deque  → Both ends

⸻

9. Map

A Map stores associations between keys and values.

Example:

Map<String, Integer> ages = new HashMap<>();

Conceptually:

"Aradhya" → 25
"Rahul"   → 30
"Priya"   → 28

The key identifies the associated value.

Important:

Map is part of the Collections Framework
but
Map does not extend Collection

⸻

10. Interface vs Implementation

A common Java Collections pattern is:

List<String> names = new ArrayList<>();

Breaking it down:

List<String>
    ↓
Interface / reference type
names
    ↓
Reference variable
new ArrayList<>()
    ↓
Creates an object
ArrayList
    ↓
Implementation class

The interface defines the contract/available operations, while the implementation class determines how those operations are provided.

⸻

11. Programming to an Interface

Instead of unnecessarily tying code to a specific implementation:

ArrayList<String> names = new ArrayList<>();

we can often write:

List<String> names = new ArrayList<>();

This allows the implementation to be changed while keeping the same interface type:

List<String> names = new ArrayList<>();

Later:

names = new LinkedList<>();

This works because LinkedList implements List.

The general principle is:

Program to the interface, not unnecessarily to the implementation.

⸻

12. Iteration

Iteration means going through elements one by one.

Example:

for (String name : names) {
    System.out.println(name);
}

For:

[A, B, C]

the elements are processed as:

A
B
C

⸻

13. Iterator — Basic Concept

Java also provides an Iterator for explicit traversal.

Example:

Iterator<String> iterator = names.iterator();
while (iterator.hasNext()) {
    String name = iterator.next();
    System.out.println(name);
}

Basic mental model:

hasNext()
    ↓
Is another element available?
    ↓
   yes
    ↓
next()
    ↓
Get the next element

Detailed iterator behavior, modification rules, fail-fast behavior, and ListIterator will be covered later.

⸻

14. Stack — LIFO

LIFO = Last In, First Out

Think of a stack of plates:

Plate 3  ← added last
Plate 2
Plate 1  ← added first

Plate 3 is removed first.

Stack → LIFO

⸻

15. Queue — FIFO

FIFO = First In, First Out

Think of people standing in a line:

Person A → Person B → Person C
   ↑
leaves first
Queue → FIFO

⸻

16. Linked List Fundamentals

A linked list consists of nodes.

A node generally contains:

1. Data
2. A reference/link to another node

Conceptually:

[10 | next] → [20 | next] → [30 | next] → null

The next reference of 10 points to 20.

The next reference of 30 contains null because there is no next node.

Java’s LinkedList uses a doubly linked structure internally, allowing links in both directions.

⸻

17. Array vs Linked List

Array

Index:  0    1    2
       [10] [20] [30]

An array supports direct index access:

array[2];

This is generally:

O(1)

Linked List

10 → 20 → 30 → 40

To reach a particular position, traversal through the links is generally required.

Therefore positional access is generally:

O(n)

Key Difference

Array
→ direct index access
→ O(1) positional access
Linked List
→ follow links
→ O(n) positional access

⸻

18. Basic Complexity Concepts

Big-O describes how the amount of work grows as the input size grows.

Important examples:

O(1)      → Constant
O(log n)  → Logarithmic
O(n)      → Linear
O(n²)     → Quadratic

Examples:

Array index access       → O(1)
Linear search            → O(n)
Binary search            → O(log n)
Linked-list traversal    → O(n)

Complexity can depend on the operation and implementation, so specific collection guarantees will be studied with each collection.

⸻

🧠 Key Takeaways

Array
→ Fixed-size structure
Collection Framework
→ Provides different data structures and APIs
List
→ Ordered + duplicates + positional access
Set
→ No duplicate elements
Queue
→ Processing order
Deque
→ Both ends
Map
→ Key → Value
Collection
→ Interface
Collections
→ Utility class
Collectors
→ Stream-related utility class
ArrayList
→ List implementation
LinkedList
→ List implementation
Stack
→ LIFO
Queue
→ FIFO
Iterator
→ Traverses elements

⸻

🎯 Learning Status

Completed

* ✅ Collections motivation
* ✅ Arrays vs Collections
* ✅ Collections Framework overview
* ✅ Collection
* ✅ Collections
* ✅ Collectors basic distinction
* ✅ List
* ✅ Set
* ✅ Queue
* ✅ Deque
* ✅ Map
* ✅ Interface vs implementation
* ✅ Programming to an interface
* ✅ Basic iteration
* ✅ Basic Iterator
* ✅ Stack / LIFO
* ✅ Queue / FIFO
* ✅ Linked List fundamentals
* ✅ Array vs Linked List
* ✅ Basic Big-O connection

Next Topic

ArrayList — internal mental model, size vs capacity, growth, operations, complexity, and practical usage.

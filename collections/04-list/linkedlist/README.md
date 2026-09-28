🔗 Linked List — Java DSA

Linked List is a fundamental linear data structure where elements are stored in separate objects called nodes. Each node contains data and a reference to another node.

This section covers Linked Lists from fundamentals → implementation → operations → problem-solving → interview-level patterns.

⸻

📌 What is a Linked List?

A Linked List is a collection of nodes connected through references.

A basic node contains:

+---------+----------+
|  Data   |  Next    |
+---------+----------+

Example:

10 → 20 → 30 → 40 → null

Each node stores:

* data — the value stored in the node
* next — reference to the next node

⸻

🧠 Why Linked Lists?

Arrays store elements in contiguous memory, while Linked Lists connect nodes using references.

Array

[10][20][30][40]

Linked List

[10 | •] → [20 | •] → [30 | •] → [40 | null]

The nodes do not need to be stored next to each other in memory.

⸻

📚 Topics Covered

1. Linked List Fundamentals

* What is a Linked List?
* Why Linked Lists are needed
* Node concept
* Data + reference
* Head
* Tail
* null
* Traversal
* Linked List memory structure
* Array vs Linked List
* Static vs dynamic structure

⸻

2. Node Implementation

Basic Node structure:

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

Example:

Node
 ├── data = 10
 └── next ───────► Node
                    ├── data = 20
                    └── next ───────► null

⸻

🔹 Types of Linked Lists

3. Singly Linked List

Each node points only to the next node.

10 → 20 → 30 → 40 → null

Structure:

[data | next] → [data | next] → [data | next] → null

⸻

4. Doubly Linked List

Each node contains:

* Previous reference
* Data
* Next reference

null ← 10 ⇄ 20 ⇄ 30 ⇄ 40 → null

Node structure:

[prev | data | next]

⸻

5. Circular Linked List

The last node points back to the first node.

10 → 20 → 30 → 40
↑              ↓
└──────────────┘

There is no null at the end.

⸻

6. Circular Doubly Linked List

Each node contains:

prev ⇄ data ⇄ next

The last node connects back to the first, and the first connects back to the last.

⸻

⚙️ Core Operations

7. Traversal

Visit every node from the head.

10 → 20 → 30 → 40 → null

Time Complexity:

O(n)

⸻

8. Insert at Beginning

Before:

10 → 20 → 30

Insert 5:

5 → 10 → 20 → 30

Time Complexity:

O(1)

⸻

9. Insert at End

Before:

10 → 20 → 30

Insert 40:

10 → 20 → 30 → 40

Without a tail reference:

O(n)

With a tail reference:

O(1)

⸻

10. Insert at a Specific Position

Example:

10 → 20 → 40

Insert 30:

10 → 20 → 30 → 40

Typical time complexity:

O(n)

⸻

🗑️ Deletion Operations

11. Delete from Beginning

Before:

10 → 20 → 30

After deleting 10:

20 → 30

Time Complexity:

O(1)

⸻

12. Delete from End

Before:

10 → 20 → 30

After:

10 → 20

For a singly linked list, finding the previous node requires traversal.

Time Complexity:

O(n)

⸻

13. Delete a Specific Node

Example:

10 → 20 → 30 → 40

Delete 30:

10 → 20 → 40

Typical time complexity:

O(n)

⸻

🔍 Searching

14. Search for an Element

Example:

10 → 20 → 30 → 40

Search for 30.

The list is traversed until the value is found.

Time Complexity:

Best Case:  O(1)
Worst Case: O(n)

⸻

📏 Length of Linked List

Example:

10 → 20 → 30 → 40

Length:

4

Time Complexity:

O(n)

If the implementation maintains a size variable:

O(1)

⸻

🧠 Important Concepts

Head

head points to the first node.

head
 ↓
10 → 20 → 30 → null

⸻

Tail

tail points to the last node.

head                 tail
 ↓                     ↓
10 → 20 → 30 → 40 → null

⸻

Null

null represents the end of a normal singly linked list.

10 → 20 → 30 → null

⸻

🔄 Pointer / Reference Manipulation

Linked List problems heavily depend on correctly changing references.

Example:

current.next = newNode;

or:

newNode.next = current.next;
current.next = newNode;

Understanding reference changes is more important than memorizing code.

⸻

🐢 Fast and Slow Pointer

One of the most important Linked List patterns.

Two references move at different speeds:

slow → one step
fast → two steps

Common uses:

* Find middle of Linked List
* Detect cycle
* Find cycle starting point
* Check certain structural properties
* Split Linked List

⸻

🔄 Reverse Linked List

One of the most important interview problems.

Before:

10 → 20 → 30 → 40 → null

After:

40 → 30 → 20 → 10 → null

The standard iterative solution uses:

previous
current
next

Typical time complexity:

O(n)

Space complexity:

O(1)

⸻

♻️ Cycle Detection

A Linked List may contain a cycle:

10 → 20 → 30 → 40
          ↑       ↓
          └───────┘

Floyd’s Cycle Detection Algorithm uses:

slow
fast

If slow == fast, a cycle exists.

Time Complexity:

O(n)

Space Complexity:

O(1)

⸻

🧩 Important Linked List Patterns

The goal is to learn patterns, not memorize individual problems.

Pattern 1 — Traversal

current = head
while (current != null)

Used for:

* Printing
* Searching
* Counting
* Finding values

⸻

Pattern 2 — Two Pointers

slow
fast

Used for:

* Middle node
* Cycle detection
* Cycle-related problems

⸻

Pattern 3 — Previous / Current / Next

prev
current
next

Used for:

* Reversing a Linked List
* Rearranging references

⸻

Pattern 4 — Dummy Node

A temporary node placed before the actual head.

dummy → head → ...

Useful for simplifying:

* Deletion
* Insertion
* Merging
* Edge cases involving the head

⸻

Pattern 5 — In-place Manipulation

Modify the existing nodes instead of creating another Linked List.

Important for reducing auxiliary space.

⸻

⏱️ Complexity Summary

Operation	Singly Linked List
Access by index	O(n)
Search	O(n)
Insert at beginning	O(1)
Insert at end without tail	O(n)
Insert at end with tail	O(1)
Delete beginning	O(1)
Delete end	O(n)
Delete/search specific value	O(n)
Traversal	O(n)
Reverse	O(n)

Complexity can change depending on the exact implementation and whether a tail or other references are maintained.

⸻

⚖️ Array vs Linked List

Feature	Array	Linked List
Memory	Contiguous	Non-contiguous nodes
Random Access	O(1)	O(n)
Insert Beginning	O(n)	O(1)
Delete Beginning	O(n)	O(1)
Search	O(n)	O(n)
Extra Reference Memory	No	Yes
Cache Locality	Generally better	Generally worse
Dynamic Growth	Limited / implementation-dependent	Natural

⸻

🧪 Practice Progression

Problems should be solved in increasing difficulty.

Level 1 — Fundamentals

* Create a Node
* Create a Linked List
* Print all nodes
* Count nodes
* Search an element
* Find maximum
* Find minimum
* Find sum
* Find a node by position

⸻

Level 2 — Basic Manipulation

* Insert at beginning
* Insert at end
* Insert at position
* Delete beginning
* Delete end
* Delete at position
* Delete by value
* Update a node
* Find the nth node

⸻

Level 3 — Core Interview Patterns

* Reverse Linked List
* Find middle node
* Detect cycle
* Find cycle starting point
* Remove cycle
* Find nth node from end
* Remove nth node from end
* Compare two Linked Lists
* Merge two sorted Linked Lists

⸻

Level 4 — Advanced Problems

* Palindrome Linked List
* Intersection of two Linked Lists
* Add two numbers represented by Linked Lists
* Sort a Linked List
* Remove duplicates
* Partition Linked List
* Reverse nodes in groups
* Reorder Linked List
* Rotate Linked List
* Merge multiple sorted Linked Lists

⸻

🎯 Interview Checklist

Before considering Linked Lists complete, I should be able to:

* Explain what a Linked List is
* Explain why nodes are used
* Explain head
* Explain tail
* Explain next
* Explain null
* Create a Node manually
* Create a Singly Linked List
* Traverse a Linked List
* Search a Linked List
* Insert at beginning
* Insert at end
* Insert at a position
* Delete from beginning
* Delete from end
* Delete a specific node
* Reverse a Linked List
* Find the middle node
* Find nth node from the end
* Detect a cycle
* Explain Floyd’s Cycle Detection
* Merge two sorted Linked Lists
* Detect common edge cases
* Analyze time complexity
* Analyze space complexity
* Solve Linked List problems without memorizing solutions

⸻

⚠️ Common Mistakes

1. Losing the reference

Incorrect reference manipulation can disconnect part of the list.

Always carefully track:

previous
current
next

⸻

2. Forgetting the empty list

Always consider:

head == null

⸻

3. Ignoring a single-node list

Example:

10 → null

Many bugs appear when the list contains only one node.

⸻

4. Incorrect head update

Operations involving the first node may require:

head = head.next;

⸻

5. Creating unnecessary nodes

Many interview problems can be solved by manipulating existing references.

⸻

6. Not checking null

Before accessing:

current.next

make sure current is not null.

⸻

🧠 Edge Cases to Test

Every Linked List implementation should be tested against:

1. Empty list
2. One node
3. Two nodes
4. Multiple nodes
5. Insert at beginning
6. Insert at end
7. Insert at invalid position
8. Delete beginning
9. Delete end
10. Delete the only node
11. Search existing value
12. Search missing value
13. Duplicate values
14. Negative values
15. Large input

⸻

💡 Problem-Solving Method

For every Linked List problem:

Step 1 — Understand

Ask:

What exactly is being changed?

Step 2 — Draw

Draw the nodes before and after.

Before:
10 → 20 → 30
After:
10 → 30

Step 3 — Identify pointers

Ask:

Which references must change?

Step 4 — Handle edge cases

Check:

empty
one node
head
tail
null
duplicates

Step 5 — Write the algorithm

Describe the steps in plain English before coding.

Step 6 — Code

Implement the logic in Java.

Step 7 — Dry Run

Trace the references manually.

Step 8 — Complexity

Always record:

Time Complexity:
Space Complexity:

⸻

📝 DSA Notes Rule

For each important problem, notes should contain:

Problem
↓
What is being asked?
↓
Observation
↓
Pattern
↓
Approach
↓
Dry Run
↓
Java Code
↓
Time Complexity
↓
Space Complexity
↓
Edge Cases
↓
Mistake / Lesson Learned

Do not write pages of code into notes.

The goal is to remember:

WHY → HOW → PATTERN → WHEN TO USE

not simply memorize the final solution.

⸻

📂 Suggested Folder Structure

linked-list/
│
├── README.md
│
├── basics/
│   ├── NodeCreation.java
│   ├── CreateLinkedList.java
│   ├── TraverseLinkedList.java
│   ├── CountNodes.java
│   └── SearchLinkedList.java
│
├── singly-linked-list/
│   ├── InsertAtBeginning.java
│   ├── InsertAtEnd.java
│   ├── InsertAtPosition.java
│   ├── DeleteFromBeginning.java
│   ├── DeleteFromEnd.java
│   └── DeleteAtPosition.java
│
├── doubly-linked-list/
│   ├── CreateDoublyLinkedList.java
│   ├── Insert.java
│   └── Delete.java
│
├── circular-linked-list/
│   ├── CreateCircularLinkedList.java
│   ├── Insert.java
│   └── Delete.java
│
├── patterns/
│   ├── ReverseLinkedList.java
│   ├── FastSlowPointer.java
│   ├── DetectCycle.java
│   └── DummyNode.java
│
└── problems/
    ├── FindMiddle.java
    ├── ReverseList.java
    ├── MergeSortedLists.java
    ├── RemoveNthFromEnd.java
    ├── PalindromeLinkedList.java
    └── IntersectionOfLists.java

⸻

🚀 Learning Goal

The objective of this section is not merely to learn how a Linked List works.

The objective is to develop the ability to:

Understand the structure
        ↓
Visualize references
        ↓
Identify the pattern
        ↓
Choose the correct pointers
        ↓
Manipulate references safely
        ↓
Handle edge cases
        ↓
Analyze complexity
        ↓
Solve unseen problems

⸻

🏆 Completion Standard

Linked List is considered mastered when I can solve a new Linked List problem by myself, explain:

1. What the problem is asking
2. What pattern applies
3. Why that pattern applies
4. How the references move
5. Why the algorithm is correct
6. What happens in edge cases
7. Time complexity
8. Space complexity

without relying on memorized code.

⸻

🔗 Related DSA Topics

Next related topics:

* Arrays
* Strings
* Stack
* Queue
* Recursion
* Hashing
* Trees
* Graphs
* Dynamic Programming

⸻

📈 Progress

Fundamentals

* Node
* Head
* Tail
* Traversal
* Searching
* Length

Operations

* Insert
* Delete
* Update
* Reverse

Patterns

* Two Pointers
* Fast & Slow Pointer
* Previous / Current / Next
* Dummy Node
* In-place Manipulation

Interview Problems

* Middle of Linked List
* Reverse Linked List
* Cycle Detection
* Nth Node from End
* Merge Sorted Lists
* Palindrome Linked List
* Intersection
* Reorder List
* Reverse in Groups

⸻

Core Principle:
Don’t memorize Linked List solutions.
Learn how references move, recognize the underlying pattern, and derive the solution.

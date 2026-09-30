🥞 Stack — Java Collections

Stack is a LIFO (Last In, First Out) data structure.

The element added last is the element removed first.

Java provides Stack through:

import java.util.Stack;

Example:

Push order:
10 → 20 → 30 → 40
Top
 ↓
40
30
20
10

The first element removed is 40.

⸻

📌 What is a Stack?

A Stack is a linear data structure that follows:

LIFO
↓
Last In, First Out

Real-world example:

        ┌────┐
Top →   │ 40 │  ← Last added
        ├────┤
        │ 30 │
        ├────┤
        │ 20 │
        ├────┤
        │ 10 │  ← First added
        └────┘

If we remove an element:

40

is removed first.

⸻

🧠 Java Stack

Java’s Stack class is:

java.util.Stack

It extends:

Vector
  ↓
Stack

Therefore:

Object
   ↓
AbstractCollection
   ↓
Vector
   ↓
Stack

Stack is also a List because Vector implements List.

⸻

⚠️ Important Modern Java Note

Stack is a legacy class.

For new code, Java’s documentation generally recommends using:

Deque

with:

ArrayDeque

for stack behavior.

Example:

Deque<Integer> stack = new ArrayDeque<>();

However, learning Stack is still important because:

* It is part of the Java Collections Framework.
* It appears in legacy Java code.
* It is common in beginner/interview discussions.
* Understanding it teaches the fundamental LIFO concept.

⸻

🔹 Creating a Stack

import java.util.Stack;
public class StackBasics {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
    }
}

Output:

[10, 20, 30]

The rightmost element is the top:

Top
 ↓
30
20
10

⸻

➕ push()

push() adds an element to the top of the Stack.

stack.push(10);
stack.push(20);
stack.push(30);

Result:

Top
 ↓
30
20
10

Typical complexity:

O(1) amortized

⸻

👀 peek()

peek() returns the top element without removing it.

System.out.println(stack.peek());

Output:

30

Stack remains:

30
20
10

Typical complexity:

O(1)

⸻

❌ pop()

pop() removes and returns the top element.

int removed = stack.pop();
System.out.println(removed);

Output:

30

Before:

Top
 ↓
30
20
10

After:

Top
 ↓
20
10

Typical complexity:

O(1)

⸻

🔍 empty()

Checks whether the Stack contains no elements.

stack.empty();

Example:

if (stack.empty()) {
    System.out.println("Stack is empty");
}

Typical complexity:

O(1)

⸻

📏 size()

Returns the number of elements.

System.out.println(stack.size());

Example:

Stack:
30
20
10
size = 3

Typical complexity:

O(1)

⸻

🔎 search()

search() returns the 1-based position from the top.

Example:

Stack<Integer> stack = new Stack<>();
stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);

Stack:

Top
 ↓
40  ← position 1
30  ← position 2
20  ← position 3
10  ← position 4

Therefore:

stack.search(40); // 1
stack.search(30); // 2
stack.search(20); // 3
stack.search(10); // 4

If the element does not exist:

stack.search(99);

returns:

-1

Typical complexity:

O(n)

⸻

🧹 clear()

Removes every element.

stack.clear();

Before:

[10, 20, 30]

After:

[]

⸻

🔍 contains()

Checks whether an element exists.

stack.contains(20);

Returns:

true

or:

false

Typical complexity:

O(n)

⸻

🧪 Basic Stack Example

import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack: " + stack);
        System.out.println("Top: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Size: " + stack.size());
    }
}

Expected behavior:

Stack: [10, 20, 30, 40]
Top: 40
Removed: 40
Stack after pop: [10, 20, 30]
Size: 3

⸻

🧠 Core Stack Operations

Remember these five first:

push()
   ↓
Add to top
peek()
   ↓
Look at top
pop()
   ↓
Remove top
empty()
   ↓
Check empty
search()
   ↓
Find position from top

The most important relationship is:

push → add
peek → see
pop  → remove

⸻

📊 Complexity

Operation	Complexity
push()	O(1) amortized
pop()	O(1)
peek()	O(1)
empty()	O(1)
size()	O(1)
search()	O(n)
contains()	O(n)
clear()	O(n)

⸻

⚠️ Empty Stack

Calling:

stack.pop();

on an empty Stack throws:

EmptyStackException

Similarly:

stack.peek();

on an empty Stack also throws:

EmptyStackException

Therefore:

if (!stack.empty()) {
    System.out.println(stack.peek());
}

is safer when emptiness is uncertain.

⸻

🧠 Stack Overflow vs EmptyStackException

Do not confuse these concepts.

EmptyStackException

Trying to perform an operation such as pop() or peek() when the Stack is empty.

Empty Stack
    ↓
pop()
    ↓
EmptyStackException

Stack Overflow

A different concept, usually associated with excessive call-stack usage such as uncontrolled recursion.

method()
  ↓
method()
  ↓
method()
  ↓
...
  ↓
StackOverflowError

They are not the same thing.

⸻

🔄 Stack and LIFO

Suppose:

stack.push(10);
stack.push(20);
stack.push(30);
stack.push(40);

Insertion order:

10 → 20 → 30 → 40

Removal order:

40 → 30 → 20 → 10

Therefore:

Insertion:  10 20 30 40
                     ↓
Removal:    40 30 20 10

This is:

LIFO

⸻

⚖️ Stack vs Queue

Feature	Stack	Queue
Principle	LIFO	FIFO
Add	Top	Rear
Remove	Top	Front
Example	Stack of plates	Line of people
Main operations	push, pop	offer, poll

Stack

10
20
30 ← remove first

Queue

10 → 20 → 30
↑           ↑
remove      add

⸻

🔥 Stack vs Array

An array provides direct indexed access:

array[3]

A Stack conceptually restricts access to one end:

       TOP
        ↓
       [40]
       [30]
       [20]
       [10]

Stack is about access discipline, not merely storage.

⸻

🔥 Stack vs Linked List

A Linked List can be used to implement Stack behavior.

For example:

Top
 ↓
30 → 20 → 10 → null

Push:

40 → 30 → 20 → 10

Pop:

30 → 20 → 10

The important concept is:

Stack = ADT / behavior

It defines:

LIFO

The underlying implementation can vary.

⸻

🧠 Stack as an ADT

Stack is commonly discussed as an Abstract Data Type (ADT).

The ADT defines the behavior:

LIFO

It does not require one specific implementation.

Possible implementations:

Stack ADT
   │
   ├── Array
   ├── Linked List
   └── Deque

In modern Java:

Deque<Integer> stack = new ArrayDeque<>();

is usually preferred over:

Stack<Integer> stack = new Stack<>();

for new stack implementations.

⸻

🚀 Modern Java Stack

Preferred approach:

import java.util.ArrayDeque;
import java.util.Deque;
public class ModernStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }
}

Output:

30
30

The important API methods are:

push()
peek()
pop()

⸻

⚠️ Stack and ArrayDeque Difference

Feature	Stack	ArrayDeque
Type	Class	Class
Legacy	Yes	No
Implements Deque	No	Yes
Synchronized methods	Yes	No
Stack behavior	Yes	Yes
Allows null	Yes	No
Typical modern stack choice	No	Yes

⸻

🧩 Important Stack Patterns

Stack is much more important in DSA than simply knowing the Java class.

Learn these patterns.

Pattern 1 — Matching Brackets

Example:

{ [ ( ) ] }

Use Stack to remember opening brackets.

(
[
{

When a closing bracket appears, compare it with the top.

Used for:

* Parentheses validation
* Bracket matching
* Syntax checking

⸻

Pattern 2 — Reverse Data

A Stack can reverse the order of elements.

Example:

Input:
10 20 30 40

Push all:

40
30
20
10

Pop:

40 30 20 10

⸻

Pattern 3 — Undo Operations

Many undo systems conceptually use a Stack.

Action 1
Action 2
Action 3

Undo:

Action 3

Then:

Action 2

This follows LIFO.

⸻

Pattern 4 — Expression Evaluation

Stacks are heavily used for expression processing.

Examples:

2 + 3 * 4

and:

(2 + 3) * 4

Important concepts:

* Operators
* Operands
* Precedence
* Associativity
* Parentheses

⸻

Pattern 5 — Monotonic Stack

A monotonic stack maintains elements in increasing or decreasing order.

Example use cases:

* Next Greater Element
* Next Smaller Element
* Previous Greater Element
* Previous Smaller Element
* Daily Temperatures
* Stock Span
* Largest Rectangle in Histogram

This is one of the highest-value Stack patterns for DSA.

⸻

Pattern 6 — Previous / Next Element

Example:

[2, 1, 5, 3]

Questions may ask:

Next greater element
Previous greater element
Next smaller element
Previous smaller element

A Stack can reduce many of these problems from O(n²) to O(n).

⸻

🧪 Practice Progression

Level 1 — Stack Basics

* Create Stack
* push()
* peek()
* pop()
* empty()
* size()
* contains()
* search()
* clear()

⸻

Level 2 — Implementation

Implement Stack using:

* Array
* Linked List
* ArrayDeque

Understand what happens internally during:

push
pop
peek

⸻

Level 3 — Basic DSA Problems

* Reverse a string using Stack
* Reverse a sequence
* Check balanced parentheses
* Remove adjacent duplicates
* Implement Stack using Queue
* Implement Queue using Stack

⸻

Level 4 — Interview Patterns

* Next Greater Element
* Next Smaller Element
* Previous Greater Element
* Previous Smaller Element
* Stock Span
* Daily Temperatures
* Evaluate Postfix Expression
* Evaluate Prefix Expression
* Infix to Postfix
* Min Stack

⸻

Level 5 — Advanced

* Largest Rectangle in Histogram
* Maximal Rectangle
* Asteroid Collision
* Remove K Digits
* Decode String
* Trapping Rain Water using Stack

⸻

🧠 Problem-Solving Method

For every Stack problem:

Step 1 — Identify the order

Ask:

Is the most recently encountered element important?

If yes, Stack may be relevant.

⸻

Step 2 — Look for matching

Ask:

Do I need to match opening and closing elements?

Examples:

()
[]
{}

⸻

Step 3 — Look for previous/next relationships

Ask:

Do I need the next/previous greater or smaller element?

If yes:

Think Monotonic Stack

⸻

Step 4 — Draw the Stack

Example:

Top
 ↓
30
20
10

Track every:

push
pop
peek

⸻

Step 5 — Dry Run

Never skip the dry run when learning Stack.

Create a table:

Input	Stack	Action
10	[10]	Push
20	[10,20]	Push
30	[10,20,30]	Push
—	[10,20]	Pop

⸻

Step 6 — Analyze Complexity

Always write:

Time Complexity:
Space Complexity:

⸻

⚠️ Common Mistakes

1. Confusing LIFO and FIFO

Stack:

LIFO

Queue:

FIFO

⸻

2. Calling pop() on an empty Stack

This throws:

EmptyStackException

⸻

3. Confusing peek() and pop()

peek()

looks at the top.

pop()

removes the top.

⸻

4. Assuming Stack means only java.util.Stack

Stack is a data-structure concept.

java.util.Stack is only one Java implementation.

⸻

5. Ignoring ArrayDeque

For modern Java code, know:

Deque<Integer> stack = new ArrayDeque<>();

⸻

🎯 Interview Questions

Beginner

1. What is a Stack?
2. What does LIFO mean?
3. What is the top of a Stack?
4. What does push() do?
5. What does pop() do?
6. What does peek() do?
7. What happens when you pop an empty Stack?
8. What is the time complexity of push()?
9. What is the time complexity of pop()?
10. What is the time complexity of peek()?

Intermediate

11. Why is Stack considered a legacy Java class?
12. What is the difference between Stack and Queue?
13. What is the difference between peek() and pop()?
14. What is the difference between remove() and pop()?
15. How can a Stack be implemented using an array?
16. How can a Stack be implemented using a Linked List?
17. How does Deque implement Stack behavior?
18. Why is ArrayDeque commonly preferred over Stack?

Advanced

19. What is a monotonic Stack?
20. How does Stack help with Next Greater Element?
21. How can balanced parentheses be checked using Stack?
22. How can a Stack be used to evaluate expressions?
23. How can you implement a Min Stack?
24. How can Stack reduce an O(n²) Next Greater Element solution to O(n)?

⸻

🏆 Completion Checklist

Java Stack

* Understand LIFO
* Create a Stack
* push()
* pop()
* peek()
* empty()
* size()
* search()
* contains()
* clear()
* Handle empty Stack
* Understand EmptyStackException

Implementation

* Stack using Array
* Stack using Linked List
* Stack using Deque
* Understand ArrayDeque

DSA

* Balanced Parentheses
* Reverse using Stack
* Next Greater Element
* Next Smaller Element
* Previous Greater Element
* Previous Smaller Element
* Stock Span
* Daily Temperatures
* Min Stack
* Expression Evaluation
* Monotonic Stack
* Largest Rectangle in Histogram

⸻

📈 Mastery Standard

Stack is not mastered when I can only write:

stack.push();
stack.pop();
stack.peek();

It is mastered when I can look at a new problem and recognize:

LIFO requirement
      ↓
Stack candidate
      ↓
What should remain on the Stack?
      ↓
When should I push?
      ↓
When should I pop?
      ↓
What does the top represent?
      ↓
Can I make it monotonic?
      ↓
Analyze O(n) / O(n²)

⸻

🧠 Final Mental Model

Remember:

                 STACK
                   │
                   ▼
                  LIFO
                   │
          ┌────────┴────────┐
          ▼                 ▼
        PUSH               POP
          │                 │
       Add top           Remove top
          │                 │
          └────────┬────────┘
                   ▼
                 PEEK
                   │
              See the top

For DSA:

Stack
  ↓
LIFO
  ↓
Matching
  ↓
Previous / Next
  ↓
Monotonic Stack
  ↓
O(n) problem-solving patterns

Core Principle:
Don’t memorize Stack problems. Learn what the top of the Stack represents, when an element should be pushed, and when it should be popped. Once that becomes automatic, many seemingly different Stack problems reduce to the same underlying pattern.

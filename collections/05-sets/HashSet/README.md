🔐 HashSet — Java Collections

HashSet is a collection that stores unique elements.

It is part of the Java Collections Framework and implements the Set interface.

import java.util.HashSet;

The core property of a HashSet is:

No duplicate elements

Example:

HashSet<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(10);
System.out.println(numbers);

The value 10 is stored only once.

⸻

📌 What is HashSet?

A HashSet is a collection used when you primarily care about:

* Uniqueness
* Fast membership checks
* Adding elements
* Removing elements

Conceptually:

HashSet
   ↓
Set
   ↓
Unique elements

Unlike List, a Set does not represent a collection where duplicate occurrences are meaningful.

⸻

🧠 HashSet Characteristics

Property	HashSet
Interface	Set
Duplicates	❌ Not allowed
null	One null element allowed
Maintains insertion order	❌ No
Indexed access	❌ No
Allows generics	✅ Yes
Average add()	O(1)
Average remove()	O(1)
Average contains()	O(1)
Package	java.util

HashSet does not guarantee iteration order. Never write code that depends on the order in which elements happen to be displayed.

⸻

🔹 Creating a HashSet

import java.util.HashSet;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
    }
}

⸻

➕ add()

Adds an element to the HashSet.

HashSet<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);

Result contains:

10
20
30

⸻

🚫 Duplicate Elements

If you add the same element again:

numbers.add(10);
numbers.add(10);
numbers.add(10);

the HashSet still contains only one 10.

HashSet:
10

add() returns a boolean:

boolean added = numbers.add(10);

If the element was successfully added:

true

If it was already present:

false

Example:

HashSet<Integer> numbers = new HashSet<>();
System.out.println(numbers.add(10)); // true
System.out.println(numbers.add(10)); // false

⸻

🔍 contains()

Checks whether an element exists.

numbers.contains(20);

Example:

if (numbers.contains(20)) {
    System.out.println("20 exists");
}

Average time complexity:

O(1)

Worst-case complexity can degrade depending on collisions and implementation details.

⸻

❌ remove()

Removes an element.

numbers.remove(20);

Example:

Before:
[10, 20, 30]
remove(20)
After:
[10, 30]

Average complexity:

O(1)

⸻

📏 size()

Returns the number of unique elements.

numbers.size();

Example:

HashSet<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(10);
System.out.println(numbers.size());

Output:

2

⸻

🧹 clear()

Removes all elements.

numbers.clear();

After:

[]

⸻

🔎 isEmpty()

Checks whether the HashSet contains no elements.

numbers.isEmpty();

Returns:

true

or:

false

⸻

🔁 Iterating Through HashSet

Enhanced for loop

for (Integer number : numbers) {
    System.out.println(number);
}

⸻

Iterator

import java.util.Iterator;
Iterator<Integer> iterator = numbers.iterator();
while (iterator.hasNext()) {
    System.out.println(iterator.next());
}

⸻

⚠️ HashSet Has No Index

This is invalid:

numbers.get(0);

Why?

Because HashSet is not an indexed collection.

If you need:

element at index 0
element at index 1
element at index 2

you are usually looking for a List.

⸻

🧠 HashSet vs ArrayList

Feature	HashSet	ArrayList
Interface	Set	List
Duplicates	❌	✅
Maintains insertion order	❌	✅
Indexed access	❌	✅
contains() average	O(1)	O(n)
add() average	O(1)	O(1) amortized
Main purpose	Uniqueness / membership	Ordered collection

Think:

Need uniqueness?
        ↓
HashSet
Need order + duplicates + index?
        ↓
ArrayList

⸻

🧠 HashSet vs LinkedHashSet vs TreeSet

These three are extremely important.

Feature	HashSet	LinkedHashSet	TreeSet
Duplicates	❌	❌	❌
Insertion order	❌	✅	❌
Sorted order	❌	❌	✅
Average add	O(1)	O(1)	O(log n)
Average contains	O(1)	O(1)	O(log n)
Allows one null	Yes	Yes	Generally no
Main purpose	Fast uniqueness	Uniqueness + insertion order	Sorted unique elements

Mental model:

HashSet
   ↓
Unique + fast lookup
LinkedHashSet
   ↓
Unique + insertion order
TreeSet
   ↓
Unique + sorted order

⸻

🔥 How HashSet Works Internally

This is one of the most important concepts for Java interviews.

Conceptually:

HashSet
   ↓
backed by HashMap
   ↓
hash table
   ↓
hashCode()
   ↓
bucket
   ↓
equals()

A HashSet internally uses a HashMap to store its elements.

Conceptually, an element is used as a key in the backing map.

⸻

🧮 hashCode()

Every Java object inherits a hashCode() method from Object.

Example:

String name = "Java";
System.out.println(name.hashCode());

The hash code is used to help determine where an object should be placed in a hash-based collection.

Simplified model:

Object
   ↓
hashCode()
   ↓
hash value
   ↓
bucket

⸻

🪣 Buckets

A hash-based collection organizes its internal table into buckets.

Conceptually:

Bucket 0 → ...
Bucket 1 → ...
Bucket 2 → ...
Bucket 3 → ...
Bucket 4 → ...

When an element is added:

element
   ↓
hashCode()
   ↓
hash
   ↓
bucket

The actual implementation includes additional details for converting hash information into a table location.

⸻

🔗 Hash Collision

Two different objects can have the same hash code.

Example:

Object A
   ↓
hashCode()
   ↓
100
Object B
   ↓
hashCode()
   ↓
100

This is called a:

Hash Collision

A collision does not mean the objects are equal.

The collection must still distinguish them using equality checks.

⸻

⚖️ hashCode() + equals()

This is one of the most important Java concepts for HashSet.

The general contract is:

If:
a.equals(b) == true
then:
a.hashCode() == b.hashCode()

The reverse is NOT guaranteed.

That means:

Same hashCode
     ≠
Objects are equal

But:

Objects are equal
     ⇒
Same hashCode

⸻

🔥 How HashSet Checks Duplicates

When adding an object, think conceptually:

add(object)
    ↓
hashCode()
    ↓
Find candidate bucket
    ↓
Compare with existing elements
    ↓
equals()
    ↓
Already equal?
   /      \
 Yes      No
  ↓        ↓
Reject    Add

This is why understanding both:

hashCode()
equals()

is essential for using custom objects correctly in HashSet.

⸻

👨‍💻 HashSet with Custom Objects

Consider:

class Student {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

Now:

HashSet<Student> students = new HashSet<>();
students.add(new Student(1, "A"));
students.add(new Student(1, "A"));

You might expect only one student.

But without appropriate equals() and hashCode() implementations, the two distinct objects are generally treated as different objects.

⸻

✅ Correct equals() and hashCode()

For a value-based Student identity:

import java.util.Objects;
class Student {
    private final int id;
    private final String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student other)) {
            return false;
        }
        return id == other.id &&
               Objects.equals(name, other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

Now:

HashSet<Student> students = new HashSet<>();
students.add(new Student(1, "A"));
students.add(new Student(1, "A"));
System.out.println(students.size());

Output:

1

⸻

🧠 Important Rule

When overriding:

equals()

you should also correctly override:

hashCode()

Do not do this:

@Override
public boolean equals(Object obj) {
    // custom equality
}

while leaving an incompatible inherited hashCode() implementation.

That can break the behavior expected by hash-based collections.

⸻

⚠️ Mutable Objects and HashSet

Be careful when fields used by equals() and hashCode() are changed after insertion.

Example concept:

HashSet
   ↓
Student
   ↓
id + name determine hash

If name changes after insertion:

Before:
name = "A"
After:
name = "B"

the object’s hash-related identity may change.

This can make the object difficult to locate correctly in the HashSet.

Best practice

Prefer immutable fields for properties used in:

equals()
hashCode()

⸻

🧩 Important HashSet Methods

Method	Purpose
add()	Add unique element
remove()	Remove element
contains()	Check existence
size()	Number of elements
isEmpty()	Check empty
clear()	Remove all
iterator()	Iterate
addAll()	Add elements from another collection
removeAll()	Remove matching elements
retainAll()	Keep only common elements
containsAll()	Check whether all elements exist
toArray()	Convert to array

⸻

🔀 Set Operations

HashSet is useful for mathematical-style set operations.

Suppose:

A = {1, 2, 3, 4}
B = {3, 4, 5, 6}

⸻

Union

Elements from both sets:

A ∪ B
{1, 2, 3, 4, 5, 6}

Java:

Set<Integer> union = new HashSet<>(A);
union.addAll(B);

⸻

Intersection

Elements common to both:

A ∩ B
{3, 4}

Java:

Set<Integer> intersection = new HashSet<>(A);
intersection.retainAll(B);

⸻

Difference

Elements in A but not B:

A - B
{1, 2}

Java:

Set<Integer> difference = new HashSet<>(A);
difference.removeAll(B);

⸻

🧪 Practical Example — Remove Duplicates

Given:

[10, 20, 10, 30, 20, 40]

Use:

HashSet<Integer> unique = new HashSet<>();
for (int number : numbers) {
    unique.add(number);
}

The HashSet stores only unique values.

⸻

🧪 Practical Example — Detect Duplicate

HashSet<Integer> seen = new HashSet<>();
for (int number : numbers) {
    if (seen.contains(number)) {
        System.out.println("Duplicate: " + number);
        break;
    }
    seen.add(number);
}

This is a very common DSA pattern:

seen HashSet
     ↓
Have I seen this before?
     ↓
Yes → duplicate
No  → add it

⸻

🚀 Important DSA Pattern — Frequency

HashSet is excellent when you only need to know:

Have I seen this value?

But if you need:

How many times did it occur?

use a:

HashMap<value, frequency>

Example:

HashSet:
{apple, banana, mango}
HashMap:
{
    apple  → 3
    banana → 2
    mango  → 5
}

Mental rule:

Need uniqueness?
       ↓
HashSet
Need frequency/count?
       ↓
HashMap

⸻

⏱️ Time Complexity

Average-case complexity:

Operation	Average	Worst Case
add()	O(1)	O(n)
remove()	O(1)	O(n)
contains()	O(1)	O(n)
size()	O(1)	O(1)
isEmpty()	O(1)	O(1)

Modern Java’s hash-table implementation can use balanced-tree structures for sufficiently large collision-heavy buckets, so exact worst-case behavior is more nuanced than simply saying “always O(n).” For interview purposes, remember average O(1) for the primary hash operations and understand collision behavior.

⸻

🧠 HashSet Mental Model

Remember:

                 HashSet
                    │
                    ▼
                   Set
                    │
                    ▼
              Unique values
                    │
                    ▼
              Hash-based lookup
                    │
          ┌─────────┴─────────┐
          ▼                   ▼
      hashCode()           equals()
          │                   │
          ▼                   ▼
       Bucket             Equality

⸻

⚠️ Common Mistakes

1. Assuming HashSet preserves insertion order

Do not rely on:

add:
10
20
30

producing iteration:

10
20
30

Use LinkedHashSet when insertion order matters.

⸻

2. Trying to use an index

This is invalid:

set.get(0);

A Set does not provide indexed access.

⸻

3. Forgetting equals() and hashCode()

For custom objects, incorrect equality/hash behavior can cause duplicate-looking objects to coexist or make lookups fail.

⸻

4. Assuming same hashCode means equal

Incorrect:

hashCode same
     ↓
must be equal

Correct:

equals true
     ↓
hashCode must be same

but:

hashCode same
     ↓
may still be different objects

⸻

5. Modifying hash-relevant fields

Changing fields involved in equals()/hashCode() while the object is inside a HashSet can make collection behavior surprising.

Prefer immutable identity fields.

⸻

⚖️ When Should You Use HashSet?

Use HashSet when:

You need unique elements
        +
Fast average membership checks
        +
Ordering is not required

Examples:

* Remove duplicates
* Detect duplicates
* Check whether an item has been seen
* Track visited nodes
* Track unique IDs
* Membership testing
* Set union/intersection/difference

⸻

❌ When Should You NOT Use HashSet?

Do not choose HashSet when:

You need duplicates

Use:

List

You need insertion order

Use:

LinkedHashSet

You need sorted elements

Use:

TreeSet

You need key → value mapping

Use:

HashMap

You need indexed access

Use:

ArrayList

⸻

🎯 Interview Questions

Beginner

1. What is HashSet?
2. Why doesn’t HashSet allow duplicates?
3. Does HashSet maintain insertion order?
4. Can HashSet contain null?
5. Does HashSet support index-based access?
6. What is the average complexity of add()?
7. What is the average complexity of contains()?
8. What is the difference between Set and List?

Intermediate

9. How does HashSet work internally?
10. What is a hash table?
11. What is a bucket?
12. What is a hash collision?
13. Why are hashCode() and equals() important?
14. What happens when two objects have the same hash code?
15. Why should equals() and hashCode() be overridden together?
16. What happens if an object’s hash-relevant fields are changed after insertion?
17. Difference between HashSet, LinkedHashSet, and TreeSet?
18. Why is HashSet useful for duplicate detection?

Advanced

19. How does HashSet internally use HashMap?
20. Explain the duplicate detection process.
21. Explain hash collision handling.
22. Explain why equal objects must have equal hash codes.
23. What happens if two equal objects return different hash codes?
24. How does resizing work in a hash-based collection?
25. What is load factor?
26. What is initial capacity?
27. What is the relationship between capacity and performance?
28. Why is average lookup O(1)?
29. Why can hash-based operations degrade in collision-heavy situations?

⸻

🧪 Practice Progression

Level 1 — API

* Create HashSet
* Add elements
* Add duplicates
* Remove elements
* Search using contains()
* Check size
* Check empty
* Clear
* Iterate

Level 2 — Problem Solving

* Remove duplicates from an array
* Detect duplicate values
* Find whether two arrays share an element
* Find common elements
* Find unique elements
* Find union
* Find intersection
* Find difference

Level 3 — Custom Objects

* Store Student objects
* Override equals()
* Override hashCode()
* Test duplicate Student objects
* Understand mutable-key problems
* Use immutable identity fields

Level 4 — DSA

* Contains Duplicate
* Longest Consecutive Sequence
* Intersection of Arrays
* Happy Number
* Valid Sudoku
* Two Sum using HashSet/HashMap concepts
* Detect visited nodes
* Cycle-related problems

⸻

🏆 Completion Checklist

Fundamentals

* What is HashSet?
* What is Set?
* Why are duplicates prohibited?
* Does HashSet preserve order?
* Does HashSet allow null?
* Why is there no get(index)?

API

* add()
* remove()
* contains()
* size()
* isEmpty()
* clear()
* iterator()
* addAll()
* removeAll()
* retainAll()
* containsAll()

Internal Working

* Hash table
* Buckets
* hashCode()
* equals()
* Hash collision
* Resizing
* Capacity
* Load factor
* Average O(1)

Interview

* HashSet vs ArrayList
* HashSet vs LinkedHashSet
* HashSet vs TreeSet
* HashSet vs HashMap
* equals() / hashCode() contract
* Mutable objects in HashSet
* Duplicate detection pattern

⸻

📈 Mastery Standard

HashSet is mastered when I can look at a problem and immediately ask:

Do I need uniqueness?
        ↓
Do I need fast membership checking?
        ↓
Is ordering irrelevant?
        ↓
YES
        ↓
HashSet candidate

For custom objects:

Custom Object
     ↓
How is equality defined?
     ↓
equals()
     +
hashCode()
     ↓
Correct HashSet behavior

For DSA:

Need to remember what I have already seen?
             ↓
          HashSet
             ↓
     contains() / add()
             ↓
       Often O(n) total

⸻

🧠 Final Mental Model

                    HashSet
                       │
                       ▼
              Unique Elements
                       │
                       ▼
               Hash-based lookup
                       │
          ┌────────────┴────────────┐
          ▼                         ▼
     hashCode()                  equals()
          │                         │
          ▼                         ▼
      Find bucket             Confirm equality
          │                         │
          └────────────┬────────────┘
                       ▼
              Add / Reject

The most important rules to remember:

1. HashSet stores unique elements.
2. HashSet does not guarantee iteration order.
3. Average add/contains/remove → O(1).
4. HashSet internally uses HashMap.
5. hashCode() helps locate candidates.
6. equals() determines equality.
7. If a.equals(b) is true,
   a.hashCode() must equal b.hashCode().
8. Same hashCode does NOT mean objects are equal.
9. Avoid mutating fields used by equals()/hashCode()
   while the object is stored in the HashSet.
10. For modern Java:
    HashSet → uniqueness
    LinkedHashSet → uniqueness + insertion order
    TreeSet → uniqueness + sorted order

Core Principle:
Don’t memorize HashSet as simply “a collection that removes duplicates.” Understand uniqueness + hashing + buckets + hashCode() + equals() + average O(1) lookup. These concepts form the foundation for understanding HashMap, hashing-based DSA problems, and many Java backend interview questions.

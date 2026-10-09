Java LinkedHashSet — Complete Guide

Topic: Java Collections Framework
Collection Type: Set
Package: java.util
Underlying Data Structure: Hash table and linked list
Primary Purpose: Store unique elements while preserving insertion order
Level: Beginner to Advanced
Author: Aradhya Thakur
Year: 2026

⸻

1. What Is LinkedHashSet?

LinkedHashSet is a class in Java’s Collections Framework that stores unique elements and maintains their insertion order.

It combines two important properties:

1. Uniqueness: Duplicate elements are not stored.
2. Insertion order: Elements are traversed in the order they were inserted.

Example

import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Aradhya");
        names.add("Rahul");
        names.add("Priya");
        names.add("Aradhya");
        names.add("Aman");
        System.out.println(names);
    }
}

Output:

[Aradhya, Rahul, Priya, Aman]

Notice that:

* "Aradhya" appears only once.
* Its original insertion position is preserved.
* Adding "Aradhya" again does not create another element.

⸻

2. Why Do We Need LinkedHashSet?

Consider this array:

String[] names = {
    "Aradhya",
    "Rahul",
    "Priya",
    "Aradhya",
    "Aman",
    "Rahul",
    "Neha"
};

Suppose you need to remove duplicates without changing the order of the first occurrences.

Using an ordinary array or ArrayList, you would need additional logic to check for duplicates.

A LinkedHashSet handles both requirements:

import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        String[] names = {
            "Aradhya",
            "Rahul",
            "Priya",
            "Aradhya",
            "Aman",
            "Rahul",
            "Neha"
        };
        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }
        System.out.println(uniqueNames);
    }
}

Output:

[Aradhya, Rahul, Priya, Aman, Neha]

Key takeaway

Use LinkedHashSet when you need unique elements in insertion order.

⸻

3. Important Characteristics

Property	LinkedHashSet
Allows duplicates	No
Maintains insertion order	Yes
Maintains sorted order	No
Allows one null element	Yes
Supports index-based access	No
Supports generics	Yes
Implements Set	Yes
Average add() complexity	O(1)
Average contains() complexity	O(1)
Average remove() complexity	O(1)

The time complexities are average-case expectations, not unconditional guarantees.

Important distinction

Insertion order is not the same as sorted order.

LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
numbers.add(30);
numbers.add(10);
numbers.add(20);
System.out.println(numbers);

Output:

[30, 10, 20]

The elements are not sorted numerically. They appear in insertion order.

⸻

4. Class Hierarchy and Declaration

LinkedHashSet belongs to the Java Collections Framework.

Its simplified class hierarchy is:

Iterable
   |
Collection
   |
Set
   |
HashSet
   |
LinkedHashSet

More precisely, LinkedHashSet extends HashSet and implements Set, Cloneable, and Serializable through its inheritance structure.

Import

import java.util.LinkedHashSet;

Create a LinkedHashSet

LinkedHashSet<String> names = new LinkedHashSet<>();

Here:

* LinkedHashSet is the collection class.
* String is the element type.
* names is the reference variable.
* new LinkedHashSet<>() creates the collection object.

Using the Set interface

You can program to the interface:

import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Aradhya");
        names.add("Rahul");
        System.out.println(names);
    }
}

This makes it easier to change the implementation later if your requirements change.

⸻

5. Basic Operations

5.1 add() — Insert an Element

LinkedHashSet<String> names = new LinkedHashSet<>();
names.add("Aradhya");
names.add("Rahul");
names.add("Priya");
System.out.println(names);

Output:

[Aradhya, Rahul, Priya]

The add() method returns a boolean.

* true: The element was added.
* false: An equal element already existed.

Example:

System.out.println(names.add("Aman"));
System.out.println(names.add("Aradhya"));

Output:

true
false

"Aman" was new, but "Aradhya" was already present.

5.2 contains() — Check Whether an Element Exists

System.out.println(names.contains("Rahul"));
System.out.println(names.contains("Neha"));

Output:

true
false

Average time complexity: O(1).

5.3 remove() — Delete an Element

names.remove("Rahul");
System.out.println(names);

Output:

[Aradhya, Priya]

Removing an element does not disturb the relative order of the remaining elements.

5.4 size() — Count Elements

System.out.println(names.size());

Returns the number of unique elements currently stored.

5.5 isEmpty() — Check Whether the Set Is Empty

System.out.println(names.isEmpty());

Returns true if there are no elements.

5.6 clear() — Remove All Elements

names.clear();
System.out.println(names);
System.out.println(names.isEmpty());

Output:

[]
true

5.7 iterator() — Traverse the Set

import java.util.Iterator;
import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Aradhya");
        names.add("Rahul");
        names.add("Priya");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

Output:

Aradhya
Rahul
Priya

5.8 toArray() — Convert the Set to an Array

Object[] array = names.toArray();
for (Object element : array) {
    System.out.println(element);
}

For a typed array:

String[] array = names.toArray(new String[0]);

⸻

6. How Does LinkedHashSet Work Internally?

Understanding its internal behavior is important for Java interviews.

Conceptually, LinkedHashSet combines:

1. Hash-based lookup: Helps find elements efficiently.
2. Linked ordering: Maintains insertion order during iteration.

In standard OpenJDK implementations, LinkedHashSet uses HashSet machinery backed by a LinkedHashMap. The linked map maintains links between entries.

Conceptual representation

Suppose you insert:

LinkedHashSet<String> names = new LinkedHashSet<>();
names.add("Aradhya");
names.add("Rahul");
names.add("Priya");

The insertion order can be visualized as:

First inserted                         Last inserted
    Aradhya  <---->  Rahul  <---->  Priya

This illustrates the linked ordering, not the complete internal hash-table layout.

What happens when you call add()?

Consider:

names.add("Rahul");

Conceptually, Java:

1. Computes a hash based on the element’s hashCode().
2. Uses the hash to locate a candidate bucket.
3. Checks whether an equal element is already present.
4. If an equal element exists, does not add a duplicate.
5. Otherwise, adds the element and links it into insertion order.

The implementation details involve hash spreading, bucket selection, and equality checks; the exact steps depend on the Java implementation.

What happens when you add a duplicate?

names.add("Aradhya");

If an equal "Aradhya" already exists, the set remains unchanged.

The method returns false.

The duplicate is not added again at the end.

Important: Adding an existing element does not move it to the end of a LinkedHashSet.

⸻

7. Understanding hashCode() and equals()

These methods are essential for understanding HashSet, LinkedHashSet, and HashMap.

Rule 1: Equal Objects Must Have Equal Hash Codes

If:

a.equals(b) == true

then:

a.hashCode() == b.hashCode()

must also be true.

Rule 2: Equal Hash Codes Do Not Guarantee Equal Objects

Two different objects can have the same hash code.

Java must still use equality checks to determine whether they represent the same element.

Example with Strings

LinkedHashSet<String> names = new LinkedHashSet<>();
names.add(new String("Aradhya"));
names.add(new String("Aradhya"));
System.out.println(names.size());

Output:

1

Although two different String objects were created, their values are equal.

String correctly implements equals() and hashCode(), so the set treats them as duplicates.

Example with a Custom Class

import java.util.LinkedHashSet;
import java.util.Objects;
class Student {
    private final int id;
    private final String name;
    public Student(int id, String name) {
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
        return id == other.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Student> students = new LinkedHashSet<>();
        students.add(new Student(101, "Aradhya"));
        students.add(new Student(102, "Rahul"));
        students.add(new Student(101, "Aarav"));
        System.out.println(students);
        System.out.println("Size: " + students.size());
    }
}

Output:

[Student{id=101, name='Aradhya'}, Student{id=102, name='Rahul'}]
Size: 2

Why?

The equals() method defines students with the same ID as equal. Therefore, the third student is treated as a duplicate of the first.

Notice that the original student with ID 101 remains in the set.

This example uses modern Java pattern matching for instanceof, available in Java 16 and later.

⸻

8. Why Mutable Objects Can Cause Problems

Suppose a custom object’s fields participate in equals() and hashCode().

If those fields change after insertion, the object may no longer be found where the hash-based collection expects it to be.

Example of the risky pattern:

// Conceptual example:
// A student's ID participates in equals() and hashCode().
LinkedHashSet<Student> students = new LinkedHashSet<>();
Student student = new Student(101, "Aradhya");
students.add(student);
// If a field used by equals() and hashCode() changes here,
// subsequent contains() or remove() operations may fail.

The Student class above uses final fields, so its ID cannot be changed after construction.

Best practice: Avoid mutating fields used by equals() and hashCode() while an object is stored in a hash-based collection.

⸻

9. LinkedHashSet vs HashSet vs TreeSet

These three collections all implement the Set interface, but they serve different needs.

Feature	HashSet	LinkedHashSet	TreeSet
Duplicate elements	Not allowed	Not allowed	Not allowed
Iteration order	No guaranteed order	Insertion order	Sorted order
Typical implementation	Hash table	Hash table with linked ordering	Balanced search tree
Average add()	O(1)	O(1)	O(log n)
Average contains()	O(1)	O(1)	O(log n)
Average remove()	O(1)	O(1)	O(log n)
Supports null	Yes, one	Yes, one	Generally no with natural ordering
Index-based access	No	No	No

Complexities shown are typical expectations; they are not guarantees for every input or implementation.

When Should You Choose Each?

Choose HashSet when:

* You need unique elements.
* Iteration order does not matter.
* You want to avoid the linked-ordering overhead.

Choose LinkedHashSet when:

* You need unique elements.
* The order of first insertion must be preserved.
* You want efficient average-case membership checks.

Choose TreeSet when:

* You need unique elements in sorted order.
* You need operations such as first(), last(), or range queries.

Example

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] numbers = {30, 10, 20, 10};
        for (int number : numbers) {
            hashSet.add(number);
            linkedHashSet.add(number);
            treeSet.add(number);
        }
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}

Guaranteed behavior:

LinkedHashSet: [30, 10, 20]
TreeSet: [10, 20, 30]

The HashSet output order is not guaranteed.

⸻

10. LinkedHashSet vs ArrayList

Feature	ArrayList	LinkedHashSet
Duplicates	Allowed	Not allowed
Insertion order	Preserved	Preserved
Index-based access	Yes	No
Average membership check	O(n)	O(1)
Typical append/add	Amortized O(1)	Average O(1)
Removing an element	May require shifting elements	Average O(1) by value
Duplicate checking	Must be handled separately if required	Built in

Example

import java.util.ArrayList;
import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        set.add("Java");
        set.add("Python");
        set.add("Java");
        System.out.println(list);
        System.out.println(set);
    }
}

Output:

[Java, Python, Java]
[Java, Python]

Use ArrayList when duplicates and indexed access are important.

Use LinkedHashSet when uniqueness and insertion order are important.

⸻

11. Removing Duplicates from an Array

This is a common interview problem.

Problem

Given:

int[] arr = {4, 2, 4, 7, 2, 9, 7, 1};

Return the unique values in the order they first appear.

Solution

import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 7, 2, 9, 7, 1};
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();
        for (int number : arr) {
            uniqueNumbers.add(number);
        }
        System.out.println(uniqueNumbers);
    }
}

Output:

[4, 2, 7, 9, 1]

Complexity

Let n be the length of the input array and u be the number of unique values.

* Expected time: O(n)
* Auxiliary space: O(u)

The O(n) expected time assumes average-case hash-table operations.

⸻

12. Detecting Duplicate Elements

Problem

Determine whether an array contains any duplicate value.

Solution

import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 2};
        Set<Integer> seen = new HashSet<>();
        for (int number : arr) {
            if (!seen.add(number)) {
                System.out.println("Duplicate found: " + number);
                return;
            }
        }
        System.out.println("No duplicates found");
    }
}

Output:

Duplicate found: 2

Why does this work?

Set.add() returns:

* true if the value was not already present.
* false if an equal value already existed.

Therefore:

if (!seen.add(number))

detects the first duplicate encountered.

Important: This problem uses HashSet because iteration order is not needed. Use LinkedHashSet instead if you also need to preserve the order of unique values.

Expected time complexity: O(n).

Auxiliary space complexity: O(n) in the worst case.

⸻

13. Set Operations

LinkedHashSet inherits the standard set operations through the Set interface.

13.1 Union

Union contains every element present in either set.

import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> a = new LinkedHashSet<>();
        LinkedHashSet<Integer> b = new LinkedHashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(3);
        b.add(4);
        b.add(5);
        LinkedHashSet<Integer> union = new LinkedHashSet<>(a);
        union.addAll(b);
        System.out.println(union);
    }
}

Output:

[1, 2, 3, 4, 5]

13.2 Intersection

Intersection contains only the elements shared by both sets.

LinkedHashSet<Integer> intersection = new LinkedHashSet<>(a);
intersection.retainAll(b);
System.out.println(intersection);

Output:

[3]

13.3 Difference

Difference contains the elements present in the first set but not the second.

LinkedHashSet<Integer> difference = new LinkedHashSet<>(a);
difference.removeAll(b);
System.out.println(difference);

Output:

[1, 2]

These operations modify the destination set, not the original source set when a copy is created as shown.

⸻

14. Can We Access Elements by Index?

No. LinkedHashSet does not provide index-based methods such as:

get(0);
get(1);

These methods are not part of the Set interface.

If you need indexed access

Convert the set to a list:

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Aradhya");
        names.add("Rahul");
        names.add("Priya");
        List<String> list = new ArrayList<>(names);
        System.out.println(list.get(0));
    }
}

Output:

Aradhya

The list preserves the set’s iteration order.

However, converting to a list creates another collection and uses additional memory.

⸻

15. Can LinkedHashSet Contain Null?

Yes. A LinkedHashSet permits one null element.

LinkedHashSet<String> values = new LinkedHashSet<>();
values.add("Java");
values.add(null);
values.add("Python");
values.add(null);
System.out.println(values);

Output:

[Java, null, Python]

The second null is rejected as a duplicate.

⸻

16. Iteration and Concurrent Modification

You can traverse a LinkedHashSet using a for-each loop:

for (String name : names) {
    System.out.println(name);
}

However, directly adding or removing elements from the set during ordinary iteration can cause a ConcurrentModificationException.

Incorrect pattern:

for (String name : names) {
    if (name.equals("Rahul")) {
        names.remove(name);
    }
}

For conditional removal, use removeIf():

names.removeIf(name -> name.startsWith("A"));

Or use an iterator and its remove() method when you need explicit traversal control.

Remember that fail-fast behavior is best-effort; it is not a thread-safety guarantee.

⸻

17. Time and Space Complexity

Let n be the number of elements stored.

Operation	Average Time Complexity
add(element)	O(1)
contains(element)	O(1)
remove(element)	O(1)
size()	O(1)
isEmpty()	O(1)
clear()	O(n)
Iterate through all elements	O(n)

Why are add, contains, and remove average O(1)?

Hashing helps locate the relevant bucket without scanning every element.

However, hash collisions and resizing can affect individual operations. These complexities describe typical average-case performance.

Space Complexity

Storing n elements requires O(n) space.

LinkedHashSet also maintains ordering links, which create additional per-entry overhead compared with a basic HashSet.

⸻

18. Common Mistakes

Mistake 1: Expecting Sorted Order

LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
numbers.add(50);
numbers.add(10);
numbers.add(30);
System.out.println(numbers);

Output:

[50, 10, 30]

The values are in insertion order, not sorted order.

Mistake 2: Expecting Duplicates

LinkedHashSet<String> names = new LinkedHashSet<>();
names.add("Java");
names.add("Java");
System.out.println(names.size());

Output:

1

Mistake 3: Expecting Index-Based Access

names.get(0);

This does not compile because LinkedHashSet has no get(int) method.

Mistake 4: Forgetting equals() and hashCode()

Custom objects may not be treated as duplicates according to the business rule you intended unless their equality behavior is implemented correctly.

Mistake 5: Thinking Reinsertion Changes the Order

LinkedHashSet<String> names = new LinkedHashSet<>();
names.add("Java");
names.add("Python");
names.add("Java");
System.out.println(names);

Output:

[Java, Python]

Adding an existing element does not move it to the end.

Mistake 6: Assuming It Is Automatically Thread-Safe

LinkedHashSet is not inherently thread-safe. If multiple threads modify the same set, use an appropriate synchronization strategy or concurrent collection based on the requirements.

⸻

19. When Should You Use LinkedHashSet?

Good Use Cases

* Removing duplicates while preserving first-occurrence order.
* Maintaining unique usernames in encounter order.
* Tracking which items have already been processed while retaining processing order.
* Preserving unique tags or labels in the order they were received.
* Deduplicating API input values without reordering them.
* Maintaining an ordered collection of unique IDs.

When Not to Use It

Avoid LinkedHashSet when:

* Duplicates must be preserved: use ArrayList.
* Sorted order is required: consider TreeSet.
* Order does not matter and reduced ordering overhead is preferred: consider HashSet.
* Index-based access is required: use a List.
* You need to count occurrences: use a Map, such as HashMap.

⸻

20. Interview Questions

Beginner

1. What is LinkedHashSet?
2. Which interface does it implement?
3. Does it allow duplicate elements?
4. Does it preserve insertion order?
5. Does it store elements in sorted order?
6. Can it contain null?
7. Does it support index-based access?
8. What does add() return when an element already exists?

Intermediate

9. What is the difference between HashSet and LinkedHashSet?
10. What is the difference between LinkedHashSet and TreeSet?
11. How does LinkedHashSet preserve insertion order?
12. Why are equals() and hashCode() important?
13. What happens when two different objects have the same hash code?
14. What is the expected time complexity of contains()?
15. Why might a custom object fail to behave as an expected duplicate?
16. Why can mutating a hash-relevant field cause problems?

Advanced

17. How is LinkedHashSet implemented in OpenJDK?
18. What additional overhead does it have compared with HashSet?
19. Why is its iteration order predictable while HashSet order is not guaranteed?
20. What can happen if a set is structurally modified during iteration?
21. Is LinkedHashSet thread-safe?
22. How would you remove duplicates while preserving order?
23. When would you choose LinkedHashSet over HashSet?
24. Why is a HashMap appropriate for frequency counting but a LinkedHashSet is not?

⸻

21. Practice Challenges

Solve these independently before looking for solutions.

Level 1: Basics

Challenge 1: Add and Observe

Create a LinkedHashSet<Integer> and insert:

10, 20, 30, 20, 40, 10, 50

Determine:

* The final contents.
* The final size.
* The return value of each add() call.

Challenge 2: Membership

Insert:

Java, Python, C++, Java

Check whether "Python" and "JavaScript" exist.

Challenge 3: Remove an Element

Insert:

A, B, C, D

Remove "B" and predict the final order.

Level 2: Logic Building

Challenge 4: Remove Duplicates from an Array

Input:

int[] arr = {5, 2, 5, 8, 2, 9, 1, 8};

Expected unique values in encounter order:

[5, 2, 8, 9, 1]

Challenge 5: Detect the First Duplicate

Input:

int[] arr = {4, 7, 2, 9, 7, 4};

Find the first duplicate encountered while scanning from left to right.

Expected output:

First duplicate: 7

Challenge 6: Count Unique Values

Input:

int[] arr = {1, 2, 2, 3, 3, 3, 4, 4};

Expected output:

Unique count: 4

Level 3: Interview Practice

Challenge 7: Preserve First Occurrences

Given a list of names containing duplicates, return the unique names in the order of their first appearance.

Challenge 8: Common Elements

Given two arrays, find their common unique values. Preserve the order in which those values appear in the first array.

Challenge 9: Custom Objects

Create a Student class with id and name.

Make two students with the same ID but different names. Define equality by ID, then determine how many students remain in a LinkedHashSet.

Challenge 10: Predict the Output

Without running the code, predict every output:

import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        System.out.println(set.add("A"));
        System.out.println(set.add("B"));
        System.out.println(set.add("A"));
        set.remove("A");
        set.add("A");
        System.out.println(set);
        System.out.println(set.size());
    }
}

Explain why the final insertion of "A" changes its position.

⸻

22. Recommended Folder Structure

collections/
└── set/
    ├── hashset/
    │   ├── README.md
    │   └── HashSetBasics.java
    │
    ├── linkedhashset/
    │   ├── README.md
    │   ├── LinkedHashSetBasics.java
    │   ├── RemoveDuplicates.java
    │   ├── DetectDuplicates.java
    │   ├── SetOperations.java
    │   └── LinkedHashSetMasteryChallenge.java
    │
    └── treeset/
        ├── README.md
        └── TreeSetBasics.java

⸻

23. Mastery Checklist

Before marking LinkedHashSet as complete, make sure you can:

* Explain what LinkedHashSet solves.
* Explain the difference between insertion order and sorted order.
* Use add(), remove(), contains(), size(), and clear().
* Explain why duplicate insertion returns false.
* Predict output without running simple programs.
* Explain the roles of hashCode() and equals().
* Explain the difference between HashSet, LinkedHashSet, and TreeSet.
* Remove duplicates from an array while preserving order.
* Detect duplicates using Set.add().
* Explain average-case time complexity.
* Explain why mutable hash-relevant fields are dangerous.
* Explain why LinkedHashSet is not thread-safe by default.
* Complete the practice challenges without copying a solution.

⸻

24. Final Mental Model

Remember these principles:

1. Set means uniqueness: equal elements are not stored as separate entries.
2. LinkedHashSet preserves insertion order: iteration follows the order in which distinct elements were first inserted.
3. HashSet does not guarantee iteration order.
4. TreeSet maintains sorted order.
5. hashCode() helps locate a candidate bucket; equals() determines equality.
6. Equal objects must have equal hash codes.
7. Average-case add(), contains(), and remove() are O(1).
8. Reinserting an existing element does not move it to the end.
9. Mutable fields used by equals() and hashCode() can break expected lookup behavior.
10. Choose a collection based on the operations and ordering your problem requires.

One-Line Summary

LinkedHashSet = unique elements + predictable insertion order + average O(1) hash-based operations.

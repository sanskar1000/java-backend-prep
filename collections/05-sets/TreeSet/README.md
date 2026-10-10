Java TreeSet — Complete Guide

Topic: Java Collections Framework
Collection Type: Sorted Set
Package: java.util
Underlying Data Structure: Red-Black Tree
Primary Purpose: Store unique elements in sorted order
Level: Beginner to Advanced
Author: Aradhya Thakur
Year: 2026

⸻

1. What Is TreeSet?

TreeSet is a class in Java’s Collections Framework that stores unique elements in sorted order.

Unlike HashSet, which does not guarantee iteration order, TreeSet orders elements according to their natural ordering or a supplied Comparator.

Example

import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);
    }
}

Output:

[10, 20, 30, 40]

Notice that:

* The numbers are sorted in ascending order.
* The duplicate 10 is stored only once.
* The collection automatically maintains its sorted order.

One-line definition

TreeSet = unique elements + sorted order + O(log n) basic operations.

⸻

2. Why Do We Need TreeSet?

Suppose you have these numbers:

int[] numbers = {50, 10, 40, 20, 10, 30};

Your requirements are:

1. Remove duplicates.
2. Keep the elements sorted.
3. Efficiently check whether an element exists.
4. Find the smallest or largest element.

A TreeSet provides these capabilities without requiring you to implement sorting and duplicate removal manually.

import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {50, 10, 40, 20, 10, 30};
        TreeSet<Integer> uniqueNumbers = new TreeSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }
        System.out.println(uniqueNumbers);
        System.out.println("Smallest: " + uniqueNumbers.first());
        System.out.println("Largest: " + uniqueNumbers.last());
    }
}

Output:

[10, 20, 30, 40, 50]
Smallest: 10
Largest: 50

⸻

3. Important Characteristics

Property	TreeSet
Allows duplicate elements	No
Maintains sorted order	Yes
Maintains insertion order	No
Allows null with natural ordering	No
Supports index-based access	No
Implements NavigableSet	Yes
Implements SortedSet	Yes
Average add() complexity	O(log n)
Average contains() complexity	O(log n)
Average remove() complexity	O(log n)
Provides first and last elements	Yes
Supports range queries	Yes

The complexity for the fundamental operations is O(log n) in Java’s standard TreeSet implementation.

Important distinction

Sorted order is not insertion order.

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(50);
numbers.add(10);
numbers.add(30);
System.out.println(numbers);

Output:

[10, 30, 50]

The values are ordered numerically regardless of their insertion order.

⸻

4. Class Hierarchy

The simplified hierarchy is:

Iterable
   |
Collection
   |
Set
   |
SortedSet
   |
NavigableSet
   |
TreeSet

TreeSet implements the NavigableSet interface, which extends SortedSet.

This gives TreeSet methods for:

* Sorted traversal
* First and last elements
* Nearest lower or higher elements
* Inclusive and exclusive range queries
* Ascending and descending views

Import

import java.util.TreeSet;

Create a TreeSet

TreeSet<Integer> numbers = new TreeSet<>();

Program to an interface

import java.util.NavigableSet;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
    }
}

Output:

[10, 20, 30]

Using an interface makes it easier to change the implementation when another implementation meets your requirements.

⸻

5. Basic Operations

5.1 add() — Insert an Element

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(30);
numbers.add(10);
numbers.add(20);
System.out.println(numbers);

Output:

[10, 20, 30]

The add() method returns a boolean:

* true if the element was added.
* false if an equivalent element already existed according to the set’s ordering.

Example:

System.out.println(numbers.add(40));
System.out.println(numbers.add(20));

Output:

true
false

5.2 contains() — Check Whether an Element Exists

System.out.println(numbers.contains(20));
System.out.println(numbers.contains(99));

Output:

true
false

Time complexity: O(log n).

5.3 remove() — Remove an Element

numbers.remove(20);
System.out.println(numbers);

Output:

[10, 30]

The remaining elements stay sorted.

5.4 size() — Count Elements

System.out.println(numbers.size());

Returns the number of elements in the set.

5.5 isEmpty() — Check Whether It Is Empty

System.out.println(numbers.isEmpty());

Returns true if the set contains no elements.

5.6 clear() — Remove All Elements

numbers.clear();
System.out.println(numbers);
System.out.println(numbers.isEmpty());

Output:

[]
true

5.7 first() — Get the Smallest Element

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(40);
numbers.add(10);
numbers.add(30);
System.out.println(numbers.first());

Output:

10

If the set is empty, first() throws NoSuchElementException.

5.8 last() — Get the Largest Element

System.out.println(numbers.last());

Output:

40

If the set is empty, last() throws NoSuchElementException.

5.9 pollFirst() — Retrieve and Remove the Smallest Element

System.out.println(numbers.pollFirst());
System.out.println(numbers);

For the set {10, 30, 40}, the output is:

10
[30, 40]

Returns null if the set is empty.

5.10 pollLast() — Retrieve and Remove the Largest Element

System.out.println(numbers.pollLast());

This returns and removes the largest element, or returns null if the set is empty.

⸻

6. How Does TreeSet Work Internally?

Java’s standard TreeSet implementation is backed by a TreeMap, which uses a Red-Black Tree, a self-balancing binary search tree.

A binary search tree maintains an ordering relationship between its elements. A Red-Black Tree adds balancing rules to prevent the tree from becoming excessively tall.

Conceptual example

Insert these values:

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(40);
numbers.add(20);
numbers.add(60);
numbers.add(10);
numbers.add(30);
numbers.add(50);
numbers.add(70);

One possible balanced-tree representation is:

                 40
               /    \
             20      60
            /  \    /  \
           10  30  50  70

This is a conceptual illustration of a balanced binary search tree, not a guarantee of the exact internal tree shape after every insertion.

Binary search tree ordering

For natural integer ordering:

* Values smaller than a node belong in its left subtree.
* Values larger than a node belong in its right subtree.

The implementation also maintains Red-Black Tree balancing properties.

What happens during add()?

When you execute:

numbers.add(25);

Conceptually, Java:

1. Compares 25 with the current node.
2. Moves left or right according to the ordering.
3. Continues until it finds the appropriate insertion position.
4. Checks whether the new element compares equal to an existing element.
5. Inserts the element if it is new.
6. Rebalances the tree if necessary.

Because the tree remains balanced, fundamental operations take O(log n) time.

Why not use an ordinary binary search tree?

An ordinary binary search tree can become skewed.

For example, inserting already-sorted values into a naive binary search tree could produce a structure like:

10
  \
   20
     \
      30
        \
         40

Searching this structure can degrade to O(n).

A Red-Black Tree maintains balance so that the height remains O(log n).

⸻

7. Natural Ordering

By default, TreeSet sorts elements according to their natural ordering.

For common types:

Type	Natural Ordering
Integer	Ascending numerical order
Double	Ascending numerical order
String	Lexicographical order
Character	Character value order

Example with Integers

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(90);
numbers.add(10);
numbers.add(50);
numbers.add(20);
System.out.println(numbers);

Output:

[10, 20, 50, 90]

Example with Strings

TreeSet<String> names = new TreeSet<>();
names.add("Rahul");
names.add("Aradhya");
names.add("Priya");
names.add("Aman");
System.out.println(names);

Output:

[Aman, Aradhya, Priya, Rahul]

String ordering is lexicographical, based on the strings’ natural comparison rules. It is not a language-aware alphabetical sort.

Important requirement

When using natural ordering, elements must be mutually comparable.

Trying to insert objects of incompatible types, or custom objects without an appropriate natural ordering, can cause ClassCastException.

⸻

8. Comparable — Define Natural Ordering for Custom Objects

Comparable<T> allows a class to define its natural ordering through the compareTo() method.

Example: Sort Students by ID

import java.util.TreeSet;
class Student implements Comparable<Student> {
    private final int id;
    private final String name;
    private final int marks;
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + '\''
                + ", marks=" + marks + '}';
    }
}
public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student(103, "Priya", 85));
        students.add(new Student(101, "Aradhya", 92));
        students.add(new Student(102, "Rahul", 78));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

Output:

Student{id=101, name='Aradhya', marks=92}
Student{id=102, name='Rahul', marks=78}
Student{id=103, name='Priya', marks=85}

How does it work?

This method defines the natural ordering:

@Override
public int compareTo(Student other) {
    return Integer.compare(this.id, other.id);
}

* Negative result: this student comes before the other student.
* Zero: both students are equivalent according to this ordering.
* Positive result: this student comes after the other student.

Critical TreeSet rule

If compareTo() returns 0, TreeSet treats the two elements as equivalent for set membership.

Therefore, two students with different names and marks but the same ID will not both be stored in this TreeSet.

That is true even if their equals() method would return false.

If your business rule is that students are distinct by some other property, the ordering must reflect that requirement.

⸻

9. Comparator — Define Custom Ordering

Comparator<T> allows you to define an ordering separately from the class itself.

Use it when you want to sort objects in a different way or when the class does not implement Comparable.

Example: Sort Students by Marks

import java.util.Comparator;
import java.util.TreeSet;
class Student {
    private final int id;
    private final String name;
    private final int marks;
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    @Override
    public String toString() {
        return "Student{id=" + id
                + ", name='" + name + '\''
                + ", marks=" + marks + '}';
    }
}
public class Main {
    public static void main(String[] args) {
        Comparator<Student> byMarks =
                Comparator.comparingInt(Student::getMarks);
        TreeSet<Student> students = new TreeSet<>(byMarks);
        students.add(new Student(103, "Priya", 85));
        students.add(new Student(101, "Aradhya", 92));
        students.add(new Student(102, "Rahul", 78));
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

Output:

Student{id=102, name='Rahul', marks=78}
Student{id=103, name='Priya', marks=85}
Student{id=101, name='Aradhya', marks=92}

Sort in descending order

TreeSet<Integer> numbers =
        new TreeSet<>(Comparator.reverseOrder());
numbers.add(10);
numbers.add(40);
numbers.add(20);
System.out.println(numbers);

Output:

[40, 20, 10]

Sort by multiple fields

Suppose students should be ordered by:

1. Marks in descending order.
2. ID in ascending order when marks are equal.

Comparator<Student> byMarksThenId =
        Comparator.comparingInt(Student::getMarks)
                .reversed()
                .thenComparingInt(Student::getId);

Use this comparator when constructing the TreeSet.

Important: If the comparator returns 0 for two students, the set treats them as equivalent and will not store both. Adding a tie-breaker such as ID helps distinguish students with equal marks.

⸻

10. Comparable vs Comparator

Feature	Comparable	Comparator
Package	java.lang	java.util
Main method	compareTo()	compare()
Defines	Natural ordering	A chosen ordering
Implementation	Usually inside the class	Can be a separate object or lambda
Number of orderings	Typically one natural ordering	Multiple alternative orderings
Best use	Default object order	Custom or alternative order

Remember

* Comparable: the object defines its natural order.
* Comparator: another object defines how two objects should be compared.

For Java backend development, both are useful when sorting domain objects or building sorted collections.

⸻

11. TreeSet and equals() / hashCode()

TreeSet differs from HashSet and LinkedHashSet in an important way.

Hash-based sets use hashCode() and equals() to manage uniqueness.

TreeSet uses its comparator or natural ordering to determine whether two elements are equivalent for set membership.

Example

import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add(new String("Java"));
        names.add(new String("Java"));
        System.out.println(names.size());
    }
}

Output:

1

The strings compare as equal under their natural ordering.

Important contract

For a SortedSet such as TreeSet, the ordering should be consistent with equals() when possible.

If a comparator returns 0 for two objects that are not equal according to equals(), the TreeSet still treats them as equivalent and retains only one.

This can make TreeSet behave differently from other Set implementations.

Best practice: Design compareTo() or Comparator so that comparison equality matches your intended definition of duplicate elements.

⸻

12. NavigableSet Methods

TreeSet implements NavigableSet, which provides powerful navigation operations.

Suppose:

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);

12.1 lower(value)

Returns the greatest element strictly less than the specified value.

System.out.println(numbers.lower(30));

Output:

20

12.2 floor(value)

Returns the greatest element less than or equal to the specified value.

System.out.println(numbers.floor(30));

Output:

30

12.3 ceiling(value)

Returns the smallest element greater than or equal to the specified value.

System.out.println(numbers.ceiling(35));

Output:

40

12.4 higher(value)

Returns the smallest element strictly greater than the specified value.

System.out.println(numbers.higher(30));

Output:

40

Summary

Method	Meaning
lower(x)	Greatest element < x
floor(x)	Greatest element <= x
ceiling(x)	Smallest element >= x
higher(x)	Smallest element > x

These methods return null when no qualifying element exists.

They are especially useful for nearest-value and range-related problems.

⸻

13. Range Views

TreeSet supports range operations through NavigableSet and SortedSet.

Using the following set:

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
numbers.add(50);

13.1 subSet()

Return a view of a range.

System.out.println(numbers.subSet(20, true, 40, false));

Output:

[20, 30]

The arguments specify:

* Lower bound: 20, inclusive.
* Upper bound: 40, exclusive.

The four-argument form is:

subSet(fromElement, fromInclusive, toElement, toInclusive)

13.2 headSet()

Return elements before a boundary.

System.out.println(numbers.headSet(30, true));

Output:

[10, 20, 30]

13.3 tailSet()

Return elements from a boundary onward.

System.out.println(numbers.tailSet(30, false));

Output:

[40, 50]

Important warning

Range methods generally return backed views, not independent copies.

Changes to a view can affect the original set, and changes to the original set can be reflected in the view.

For an independent set, create a copy:

TreeSet<Integer> copy =
        new TreeSet<>(numbers.subSet(20, true, 40, false));

⸻

14. Descending Order

You can traverse elements from largest to smallest.

System.out.println(numbers.descendingSet());

Output:

[50, 40, 30, 20, 10]

To iterate in descending order:

for (Integer number : numbers.descendingSet()) {
    System.out.println(number);
}

This is useful when you need reverse-sorted traversal without manually sorting another collection.

The descending set is a view of the original set.

⸻

15. TreeSet vs HashSet vs LinkedHashSet

Feature	HashSet	LinkedHashSet	TreeSet
Duplicates	Not allowed	Not allowed	Not allowed
Guaranteed iteration order	No	Insertion order	Sorted order
Typical implementation	Hash table	Hash table with linked ordering	Red-Black Tree
Basic add()	Average O(1)	Average O(1)	O(log n)
Basic contains()	Average O(1)	Average O(1)	O(log n)
Basic remove()	Average O(1)	Average O(1)	O(log n)
first() / last()	No	No	Yes
Range queries	No	No	Yes
Requires comparable elements or a comparator	No	No	Yes

Choose HashSet when

You need uniqueness and do not care about iteration order.

Choose LinkedHashSet when

You need uniqueness and insertion order.

Choose TreeSet when

You need uniqueness, sorted order, and navigation or range operations.

⸻

16. Practical DSA Applications

16.1 Remove Duplicates and Sort

Problem:

int[] arr = {5, 2, 8, 2, 1, 5, 9};

Expected result:

[1, 2, 5, 8, 9]

Solution:

import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 1, 5, 9};
        TreeSet<Integer> uniqueSorted = new TreeSet<>();
        for (int number : arr) {
            uniqueSorted.add(number);
        }
        System.out.println(uniqueSorted);
    }
}

Expected time: O(n log n).

Auxiliary space: O(u), where u is the number of unique values.

16.2 Find the Smallest and Largest Unique Values

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(25);
numbers.add(10);
numbers.add(80);
numbers.add(40);
System.out.println(numbers.first());
System.out.println(numbers.last());

Output:

10
80

Remember to check whether the set is empty before calling first() or last().

16.3 Find the Next Greater Value

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
numbers.add(40);
System.out.println(numbers.higher(25));

Output:

30

This is useful when you need the next available value greater than a target.

16.4 Find the Closest Available Value

For a target value, you can examine the closest candidate below and above it.

int target = 26;
Integer lower = numbers.floor(target);
Integer higher = numbers.ceiling(target);

Compare the distances when both candidates exist.

Be careful with integer overflow when computing differences for extreme integer values. For unrestricted int inputs, convert to long before subtraction.

16.5 Maintain Unique Sorted Scores

TreeSet<Integer> scores = new TreeSet<>();
scores.add(75);
scores.add(90);
scores.add(80);
scores.add(90);
System.out.println(scores);

Output:

[75, 80, 90]

This is useful when only distinct scores in sorted order matter.

If you need repeated scores or frequencies, use a different structure such as ArrayList or HashMap.

⸻

17. Time and Space Complexity

Let n be the number of elements in the set.

Operation	Time Complexity
add()	O(log n)
contains()	O(log n)
remove()	O(log n)
first()	O(log n) worst case
last()	O(log n) worst case
lower()	O(log n)
floor()	O(log n)
ceiling()	O(log n)
higher()	O(log n)
Full iteration	O(n)
size()	O(1)
clear()	O(n)

These are the typical bounds for Java’s Red-Black Tree-backed implementation. first() and last() are O(log n) in the worst case because locating an extreme element may require traversing the tree height; their exact performance can depend on implementation details.

Space complexity

Storing n elements requires O(n) space.

The tree also stores structural information needed to maintain the ordering and balance.

Why is add() O(log n)?

Because a balanced tree has height O(log n), finding the insertion position and restoring balance can be performed within O(log n) time.

⸻

18. Common Mistakes

Mistake 1: Assuming TreeSet Preserves Insertion Order

TreeSet<Integer> numbers = new TreeSet<>();
numbers.add(50);
numbers.add(10);
numbers.add(30);
System.out.println(numbers);

Output:

[10, 30, 50]

It sorts the values.

Mistake 2: Using TreeSet Without a Valid Ordering

class Student {
    int id;
    String name;
}
// TreeSet<Student> students = new TreeSet<>();

If Student does not implement Comparable and no Comparator is supplied, attempting to insert ordinary Student objects will generally result in ClassCastException.

Mistake 3: Forgetting Comparison-Based Uniqueness

If compareTo() or the comparator returns 0, the set treats the two elements as equivalent.

It does not matter that another field differs.

Mistake 4: Expecting get(index)

numbers.get(0);

This does not compile. TreeSet is not a list and does not provide index-based access.

Mistake 5: Passing null

A TreeSet using natural ordering does not support null.

With a custom comparator, null support depends on the comparator. For example, Comparator.nullsFirst(...) can explicitly define an ordering that permits null.

Mistake 6: Modifying a Set While Iterating

Ordinary structural modifications during iteration may cause ConcurrentModificationException.

Use an iterator’s remove() method when removing during iterator traversal, or use an appropriate alternative strategy.

Mistake 7: Using TreeSet for Frequency Counting

A TreeSet stores unique elements, not occurrence counts.

Use HashMap<T, Integer> when you need to count how often each value appears.

⸻

19. When Should You Use TreeSet?

Good use cases

* Maintaining unique values in sorted order.
* Finding minimum and maximum values.
* Finding the nearest higher or lower value.
* Performing range queries.
* Maintaining unique IDs in sorted order.
* Processing distinct scores in ascending order.
* Maintaining a dynamically changing sorted collection.

When not to use it

Avoid TreeSet when:

* You need duplicates: use a list or a multiset-style structure.
* You need insertion order: use LinkedHashSet.
* You only need uniqueness and average O(1) membership operations: consider HashSet.
* You need frequency counts: use HashMap.
* You need frequent indexed access: use a List.

⸻

20. Interview Questions

Beginner

1. What is TreeSet?
2. Does TreeSet allow duplicate elements?
3. Does it preserve insertion order?
4. What is natural ordering?
5. What happens when you insert integers into a TreeSet?
6. Can a natural-ordering TreeSet contain null?
7. What does first() return?
8. What does last() return?

Intermediate

9. What is the difference between HashSet, LinkedHashSet, and TreeSet?
10. What is a Red-Black Tree?
11. Why is TreeSet.add() O(log n)?
12. What is the difference between Comparable and Comparator?
13. What happens when compareTo() returns 0?
14. What is the difference between lower() and floor()?
15. What is the difference between ceiling() and higher()?
16. How does subSet() work?
17. Why can a custom object cause ClassCastException?

Advanced

18. How does TreeSet maintain sorted order?
19. How is TreeSet implemented in standard OpenJDK?
20. Why should ordering be consistent with equals()?
21. What happens if a comparator treats two distinct objects as equivalent?
22. What are backed views, and how do range views behave?
23. How would you find the nearest available value to a target?
24. When would you use TreeSet instead of a priority queue?
25. How would you sort custom objects by multiple fields?
26. Why is TreeSet less suitable than HashSet for simple membership checks when order is unnecessary?

⸻

21. Practice Challenges

Try solving these independently before checking the output.

Level 1: Fundamentals

Challenge 1: Insert and Sort

Insert:

50, 20, 40, 10, 30, 20

Determine:

* The final contents.
* The final size.
* The return value of each add() call.

Challenge 2: Find the Extremes

Insert:

90, 10, 70, 30, 50

Find the smallest and largest elements.

Challenge 3: Remove an Element

Insert:

10, 20, 30, 40, 50

Remove 30 and predict the final set.

Level 2: Navigation

Challenge 4: Lower and Floor

Given:

10, 20, 30, 40, 50

Predict:

set.lower(30);
set.floor(30);
set.lower(35);
set.floor(35);

Challenge 5: Ceiling and Higher

Using the same set, predict:

set.ceiling(30);
set.higher(30);
set.ceiling(35);
set.higher(50);

Challenge 6: Range Query

Given:

10, 20, 30, 40, 50, 60

Find the result of:

set.subSet(20, true, 50, false);
set.headSet(40, false);
set.tailSet(30, true);

Level 3: Custom Ordering

Challenge 7: Descending Order

Create a TreeSet<Integer> that stores unique values in descending order.

Challenge 8: Student Sorting

Create a Student class and sort students by ID using Comparable.

Challenge 9: Multiple Comparators

Sort students by:

1. Marks descending.
2. ID ascending when marks are equal.

Challenge 10: Understand Uniqueness

Create two students with the same ID but different names. If the comparator compares only IDs, predict how many students remain.

Explain why.

Level 4: Interview Problems

Challenge 11: Remove Duplicates and Sort

Input:

int[] arr = {8, 3, 5, 3, 1, 8, 2};

Expected result:

[1, 2, 3, 5, 8]

Challenge 12: Next Greater Element

Given a set of unique integers and a target, find the smallest element strictly greater than the target.

Use higher().

Challenge 13: Nearest Value

Given a sorted set and a target, find the closest stored value.

Consider:

* The target already exists.
* Only a lower candidate exists.
* Only a higher candidate exists.
* Both candidates exist.
* The set is empty.
* Two candidates have equal distance.

Define how ties should be handled.

Challenge 14: Predict the Output

import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        System.out.println(numbers.add(30));
        System.out.println(numbers.add(10));
        System.out.println(numbers.add(20));
        System.out.println(numbers.add(20));
        System.out.println(numbers);
        System.out.println(numbers.lower(20));
        System.out.println(numbers.higher(20));
    }
}

Predict every output and explain why.

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
    │   └── LinkedHashSetBasics.java
    │
    └── treeset/
        ├── README.md
        ├── TreeSetBasics.java
        ├── ComparableExample.java
        ├── ComparatorExample.java
        ├── NavigationMethods.java
        ├── RangeQueries.java
        └── TreeSetMasteryChallenge.java

⸻

23. Mastery Checklist

Before marking TreeSet as complete, make sure you can:

* Explain why TreeSet exists.
* Explain the difference between insertion order and sorted order.
* Use add(), remove(), contains(), first(), and last().
* Explain Red-Black Tree balancing at a high level.
* Explain why fundamental operations take O(log n).
* Implement Comparable for a custom class.
* Create a custom Comparator.
* Sort objects by multiple fields.
* Explain comparison-based uniqueness.
* Explain lower(), floor(), ceiling(), and higher().
* Use range methods correctly.
* Explain why range views are backed by the original set.
* Compare HashSet, LinkedHashSet, and TreeSet.
* Solve the practice challenges without copying solutions.

⸻

24. Final Mental Model

Remember these principles:

1. TreeSet stores unique elements in sorted order.
2. Natural ordering or a Comparator defines the order.
3. Java’s standard TreeSet implementation uses a Red-Black Tree through TreeMap.
4. Fundamental operations take O(log n) time.
5. TreeSet determines equivalence using its ordering, not directly through equals().
6. If comparison returns 0, the set treats the elements as equivalent.
7. Comparable defines natural ordering; Comparator defines a chosen ordering.
8. first() and last() retrieve the smallest and largest elements.
9. lower(), floor(), ceiling(), and higher() support navigation.
10. Range methods provide useful views over sorted data.
11. Choose TreeSet when sorted uniqueness and navigation justify its overhead.

One-Line Summary

TreeSet = unique elements + sorted order + Red-Black Tree + O(log n) operations.

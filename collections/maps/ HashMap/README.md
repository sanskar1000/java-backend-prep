Java HashMap — Complete Guide

Topic: Java Collections Framework
Package: java.util
Collection Type: Map
Underlying Data Structure: Hash Table
Primary Purpose: Store key-value pairs and retrieve values efficiently using keys
Level: Beginner to Advanced
Author: Aradhya Thakur
Java Version: Java 17+

⸻

1. What Is HashMap?

HashMap is a class in Java’s Collections Framework that stores data as key-value pairs.

Each key maps to a value.

For example:

Key	Value
101	Aradhya
102	Rahul
103	Priya

Here:

* The key identifies the entry.
* The value contains the associated data.
* Keys must be unique according to the map’s key-equality rules.
* Multiple keys can have the same value.
* One null key and multiple null values are permitted.

Example

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(101, "Aradhya");
        students.put(102, "Rahul");
        students.put(103, "Priya");
        System.out.println(students);
        System.out.println(students.get(102));
    }
}

Possible output:

{101=Aradhya, 102=Rahul, 103=Priya}
Rahul

The map’s iteration order is not guaranteed, so the order displayed by the first statement may differ.

One-line definition

HashMap = key-value storage + unique keys + efficient average-case lookup.

⸻

2. Why Do We Need HashMap?

Suppose you have an array:

int[] numbers = {10, 20, 10, 30, 20, 10};

You want to count how often each number appears.

Expected result:

10 -> 3
20 -> 2
30 -> 1

You could maintain separate arrays for the numbers and their counts, but that would require additional searching and bookkeeping.

A HashMap lets you associate each number with its frequency.

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 10};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : numbers) {
            frequency.put(
                    number,
                    frequency.getOrDefault(number, 0) + 1
            );
        }
        System.out.println(frequency);
    }
}

Possible output:

{10=3, 20=2, 30=1}

The order is not guaranteed.

This pattern is fundamental to DSA problems involving:

* Frequency counting
* Duplicate detection
* Anagrams
* Two Sum
* Grouping elements
* Caching
* Fast key-based lookup

⸻

3. Important Characteristics

Property	HashMap
Stores key-value pairs	Yes
Duplicate keys	Not allowed
Duplicate values	Allowed
Allows one null key	Yes
Allows multiple null values	Yes
Guarantees insertion order	No
Guarantees sorted order	No
Supports generics	Yes
Average put() complexity	O(1)
Average get() complexity	O(1)
Average remove() complexity	O(1)
Inherently thread-safe	No

The O(1) complexities are average-case expectations, not guarantees for every operation or input.

Important distinction

A HashMap does not preserve insertion order.

If insertion order matters, consider LinkedHashMap.

If keys must be sorted, consider TreeMap.

⸻

4. Class Hierarchy and Declaration

HashMap implements the Map interface.

A simplified relationship is:

Iterable
   |
Collection
Map
 |
 +---- HashMap
 |
 +---- LinkedHashMap
 |
 +---- TreeMap

Important: Map is not a subtype of Collection. A map is a separate branch of the Collections Framework.

Import

import java.util.HashMap;
import java.util.Map;

Create a HashMap

HashMap<Integer, String> students = new HashMap<>();

Prefer programming to the interface

Map<Integer, String> students = new HashMap<>();

This allows you to change the implementation later without changing code that only depends on the Map interface.

Generic types

Map<String, Integer> scores = new HashMap<>();
Map<Integer, String> names = new HashMap<>();
Map<String, Boolean> status = new HashMap<>();

Generics specify the key and value types.

Map<K, V>

Here:

* K represents the key type.
* V represents the value type.

Java generics cannot use primitive types directly.

Use wrapper classes such as Integer, Double, and Boolean instead of int, double, and boolean.

⸻

5. Basic Operations

Consider this map:

Map<Integer, String> students = new HashMap<>();
students.put(101, "Aradhya");
students.put(102, "Rahul");
students.put(103, "Priya");

5.1 put() — Insert or Update

students.put(104, "Aman");

Adds a new entry if the key is absent.

If the key already exists, put() replaces its associated value.

students.put(102, "Rahul Sharma");
System.out.println(students.get(102));

Output:

Rahul Sharma

Important: A map can contain only one mapping for a given key at a time.

5.2 get() — Retrieve a Value

System.out.println(students.get(101));

Output:

Aradhya

If the key is absent, get() returns null.

Because null values are permitted, a null result alone cannot tell you whether a key is absent or explicitly mapped to null.

Use containsKey() when that distinction matters.

5.3 containsKey() — Check Whether a Key Exists

System.out.println(students.containsKey(101));
System.out.println(students.containsKey(999));

Output:

true
false

Average time complexity: O(1).

5.4 containsValue() — Check Whether a Value Exists

System.out.println(students.containsValue("Rahul Sharma"));

Output:

true

Unlike containsKey(), containsValue() generally requires scanning entries.

Time complexity: O(n).

5.5 remove() — Delete an Entry

students.remove(103);

Removes the mapping associated with key 103.

You can also conditionally remove a mapping:

students.remove(102, "Rahul Sharma");

This removes the entry only if the key is associated with the specified value.

5.6 size() — Count Entries

System.out.println(students.size());

Returns the number of key-value mappings.

It does not count the number of distinct values.

5.7 isEmpty() — Check Whether the Map Is Empty

System.out.println(students.isEmpty());

Returns true if the map has no entries.

5.8 clear() — Remove All Entries

students.clear();
System.out.println(students);

Output:

{}

5.9 getOrDefault() — Retrieve a Value or Default

Map<String, Integer> scores = new HashMap<>();
scores.put("Aradhya", 90);
System.out.println(scores.getOrDefault("Aradhya", 0));
System.out.println(scores.getOrDefault("Rahul", 0));

Output:

90
0

This method is especially useful for frequency counting.

Important: If a key exists and is explicitly mapped to null, getOrDefault() returns null, not the default value.

⸻

6. How Does HashMap Work Internally?

Understanding the internal working of HashMap is essential for Java interviews.

In Java 17, HashMap uses a hash-table structure built around an array of buckets.

Each bucket can contain:

* No entries
* A linked chain of entries
* A balanced tree of entries under certain collision conditions

Conceptual representation

Suppose you insert:

Map<Integer, String> map = new HashMap<>();
map.put(101, "Aradhya");
map.put(102, "Rahul");
map.put(103, "Priya");

Conceptually, the map maintains entries containing keys and values in its internal table.

HashMap
   |
   v
Bucket Array
   |
   +---- Bucket 0
   |
   +---- Bucket 1 ----> Entry(key=101, value="Aradhya")
   |
   +---- Bucket 2 ----> Entry(key=102, value="Rahul")
   |
   +---- Bucket 3 ----> Entry(key=103, value="Priya")
   |
   +---- Other buckets

This is an illustration only. The actual bucket positions depend on the hash calculations, table capacity, and collision handling.

What happens when you call put(key, value)?

Consider:

map.put("Java", 100);

Conceptually, Java:

1. Computes the key’s hashCode().
2. Spreads the hash bits to improve bucket distribution.
3. Calculates the bucket index.
4. Checks entries already in that bucket.
5. Uses key equality to determine whether the key already exists.
6. Updates the value if an equal key exists.
7. Otherwise, inserts a new entry.
8. Resizes the table when its capacity threshold is exceeded.

The actual implementation contains additional details and optimizations.

What happens when you call get(key)?

Integer value = map.get("Java");

Conceptually, Java:

1. Calculates the hash for the key.
2. Finds the candidate bucket.
3. Examines entries in that bucket.
4. Uses hash and equality checks to locate the matching key.
5. Returns the associated value, or null if no mapping exists.

This avoids searching every entry when hashing distributes keys effectively.

⸻

7. Hashing and Bucket Index Calculation

In a hash table, a hash helps determine where an entry should be stored.

A simplified conceptual formula is:

bucketIndex = hash % capacity

However, Java 17’s HashMap does not simply use that formula.

For a non-null key, its implementation spreads the key’s hash bits and calculates the bucket index using a bitwise operation equivalent to:

index = (capacity - 1) & hash;

This relies on the table capacity being a power of two.

A simplified version of the hash-spreading logic is:

int hash = key.hashCode();
hash = hash ^ (hash >>> 16);

This is an explanatory fragment, not the complete HashMap implementation. The actual implementation also handles null keys and other details.

Why spread the hash bits?

The transformation helps incorporate higher-order bits into the bucket calculation, improving distribution for some hash patterns.

Better distribution generally reduces collisions and improves expected performance.

⸻

8. What Is a Hash Collision?

A collision occurs when different keys map to the same bucket.

For example, suppose:

Key A ----\
           \
            ---> Same bucket
           /
Key B ----/

Two different keys may produce the same bucket index.

That does not automatically mean they are equal.

How does HashMap handle collisions?

Java 17’s HashMap can store colliding entries in a linked chain.

When a bucket becomes sufficiently large and the table is large enough, the implementation can convert the bucket into a balanced tree structure.

This reduces lookup costs for heavily collided buckets under the relevant implementation conditions.

Important distinction

* Same bucket does not mean same key.
* Same hash code does not mean equal objects.
* Different keys can have the same hash code.
* equals() helps determine whether keys represent the same mapping identity.

⸻

9. The hashCode() and equals() Contract

This is one of the most important concepts in Java Collections.

Rule 1: Equal Objects Must Have Equal Hash Codes

If:

a.equals(b) == true

then:

a.hashCode() == b.hashCode()

must also be true.

Rule 2: Equal Hash Codes Do Not Guarantee Equal Objects

Two different objects may have the same hash code.

Therefore, HashMap cannot rely on hashCode() alone to identify keys.

Example with Strings

Map<String, Integer> map = new HashMap<>();
map.put(new String("Java"), 100);
map.put(new String("Java"), 200);
System.out.println(map.size());
System.out.println(map.get("Java"));

Output:

1
200

Both string objects represent equal keys.

The second put() updates the existing mapping instead of creating a second entry.

Why does this matter?

If a custom key class overrides equals() but violates the hash-code contract, a HashMap may fail to behave according to the intended key-equality rule.

Best practice: Whenever you override equals(), override hashCode() consistently.

⸻

10. Using Custom Objects as Keys

Consider a Student class.

You want two students with the same ID to represent the same map key.

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
class Student {
    private final int id;
    private final String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
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
        Map<Student, String> students = new HashMap<>();
        Student first = new Student(101, "Aradhya");
        Student second = new Student(101, "Rahul");
        students.put(first, "Java");
        students.put(second, "Spring Boot");
        System.out.println(students.size());
        System.out.println(students.get(first));
    }
}

Output:

1
Spring Boot

Why?

The equals() method defines students with the same ID as equal.

The hashCode() method calculates the hash using the same field.

Therefore, the second insertion updates the value associated with the existing logical key.

Important rule

The fields used by equals() and hashCode() should remain stable while the object is being used as a key.

If those fields change after insertion, the map may no longer find the entry using the modified key state.

Best practice: Prefer immutable objects as map keys.

⸻

11. What Is Capacity and Load Factor?

Two important HashMap concepts are capacity and load factor.

Capacity

Capacity is the length of the internal bucket array.

Load factor

The load factor determines how full the table can become before resizing is triggered.

The default load factor is:

0.75

For the standard Java 17 implementation, the default initial capacity is:

16

The initial table is allocated lazily in the standard implementation, so constructing a HashMap does not necessarily allocate the bucket array immediately.

Example

Map<Integer, String> map = new HashMap<>(16, 0.75f);

This specifies an initial capacity of 16 and a load factor of 0.75.

Conceptually:

Resize threshold = capacity × load factor

For a capacity of 16:

16 × 0.75 = 12

The table’s threshold is therefore initially 12 once the table has been allocated.

When the threshold is exceeded, the map typically increases its capacity and redistributes entries.

Why resize?

Resizing helps maintain efficient hash-based operations as the number of entries grows.

However, resizing requires additional work and can be expensive for that individual operation.

Can we specify capacity?

Yes.

Map<Integer, String> map = new HashMap<>(100);

This is useful when you have a reasonable estimate of how many entries you expect.

The constructor argument represents an initial capacity request; it is not a strict maximum size or a guarantee of the exact internal array length.

⸻

12. Important Methods for Writing Better Java Code

12.1 putIfAbsent()

Adds a mapping only if the key is absent or currently mapped to null.

Map<String, Integer> map = new HashMap<>();
map.put("Java", 100);
map.putIfAbsent("Java", 200);
map.putIfAbsent("Python", 150);
System.out.println(map);

Output:

{Java=100, Python=150}

The existing non-null value for "Java" remains unchanged.

12.2 replace()

Replace a value only if the key exists.

map.replace("Java", 300);

You can also specify the expected old value:

map.replace("Java", 300, 400);

The second form replaces the value only if it is currently 300.

12.3 computeIfAbsent()

Compute a value only when the key is absent or currently mapped to null.

Map<String, Integer> scores = new HashMap<>();
scores.computeIfAbsent("Aradhya", name -> 90);
System.out.println(scores);

Output:

{Aradhya=90}

This method is particularly useful for creating collections inside maps.

Example:

Map<String, java.util.List<String>> groups = new HashMap<>();
groups.computeIfAbsent("Java", key -> new java.util.ArrayList<>())
      .add("HashMap");
groups.computeIfAbsent("Java", key -> new java.util.ArrayList<>())
      .add("HashSet");
System.out.println(groups);

Output:

{Java=[HashMap, HashSet]}

12.4 merge()

merge() is useful for updating an existing value or inserting a new one.

Map<String, Integer> frequency = new HashMap<>();
frequency.merge("Java", 1, Integer::sum);
frequency.merge("Java", 1, Integer::sum);
frequency.merge("Python", 1, Integer::sum);
System.out.println(frequency);

Output:

{Java=2, Python=1}

When the key is absent or mapped to null, the supplied value is inserted. Otherwise, the remapping function combines the existing and supplied values.

If the remapping function returns null, the mapping is removed.

12.5 getOrDefault()

This is a common frequency-counting pattern:

frequency.put(
        "Java",
        frequency.getOrDefault("Java", 0) + 1
);

Use getOrDefault() when you want a simple fallback.

Use merge() when its update semantics make the code clearer.

⸻

13. How to Iterate Through a HashMap

A map is not directly iterable through the Iterable interface like a list or set.

Instead, you can iterate through its keys, values, or entries.

13.1 Iterate Through Keys

for (Integer key : students.keySet()) {
    System.out.println(key);
}

keySet() returns a view of the keys.

13.2 Iterate Through Values

for (String value : students.values()) {
    System.out.println(value);
}

values() returns a view of the values.

13.3 Iterate Through Key-Value Pairs

for (Map.Entry<Integer, String> entry : students.entrySet()) {
    System.out.println(
            entry.getKey() + " -> " + entry.getValue()
    );
}

This is generally the preferred approach when you need both keys and values.

13.4 Use forEach()

students.forEach((key, value) ->
        System.out.println(key + " -> " + value)
);

Important warning

Do not assume that any of these traversal methods produces insertion order or sorted order.

The order is unspecified for HashMap.

⸻

14. HashMap vs HashSet

You have already studied HashSet. Understanding the difference is essential.

Feature	HashMap	HashSet
Stores	Key-value pairs	Unique elements
Duplicate keys/elements	Keys are unique	Elements are unique
Values	Yes	No separate values
Primary purpose	Associate keys with values	Track uniqueness
Typical use	Frequency counting	Duplicate detection
Internal relationship	Hash table of mappings	Implemented using HashMap machinery

HashSet example

Set<Integer> uniqueNumbers = new HashSet<>();
uniqueNumbers.add(10);
uniqueNumbers.add(20);
uniqueNumbers.add(10);

Purpose: track which numbers exist.

HashMap example

Map<Integer, Integer> frequency = new HashMap<>();
frequency.put(10, 2);
frequency.put(20, 1);

Purpose: associate each number with its frequency.

Remember

HashSet answers: “Have I seen this?”

HashMap answers: “What value is associated with this key?”

⸻

15. HashMap vs LinkedHashMap vs TreeMap

Feature	HashMap	LinkedHashMap	TreeMap
Stores key-value pairs	Yes	Yes	Yes
Duplicate keys	No	No	No
Iteration order	No guarantee	Insertion order by default	Sorted by key
Typical implementation	Hash table	Hash table with linked ordering	Red-Black Tree
Average get()	O(1)	O(1)	O(log n)
Average put()	O(1)	O(1)	O(log n)
Allows null key	Yes	Yes	Generally no with natural ordering

Choose HashMap when

You need efficient key-value lookup and do not require ordering.

Choose LinkedHashMap when

You need key-value lookup and predictable iteration order.

Choose TreeMap when

You need keys in sorted order and navigation or range operations.

⸻

16. DSA Pattern: Frequency Counting

Frequency counting is one of the most important applications of HashMap.

Problem

Given:

int[] arr = {5, 2, 5, 8, 2, 5, 9};

Count each number’s occurrences.

Expected result:

5 -> 3
2 -> 2
8 -> 1
9 -> 1

Solution

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 8, 2, 5, 9};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : arr) {
            frequency.put(
                    number,
                    frequency.getOrDefault(number, 0) + 1
            );
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}

The printed order is not guaranteed.

Dry run

Number	Previous Frequency	New Frequency
5	0	1
2	0	1
5	1	2
8	0	1
2	1	2
5	2	3
9	0	1

Complexity

* Expected time: O(n)
* Auxiliary space: O(u)

Here:

* n is the number of input elements.
* u is the number of distinct values.

⸻

17. DSA Pattern: Find the Most Frequent Element

Problem

Find the element that appears most frequently.

int[] arr = {5, 5, 8, 8, 8, 3};

Expected answer:

Most frequent element: 8
Frequency: 3

Solution

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 8, 8, 8, 3};
        findMostFrequent(arr);
    }
    static void findMostFrequent(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        Map<Integer, Integer> frequency = new HashMap<>();
        int mostFrequent = arr[0];
        int maximumFrequency = 0;
        for (int number : arr) {
            int count = frequency.getOrDefault(number, 0) + 1;
            frequency.put(number, count);
            if (count > maximumFrequency) {
                maximumFrequency = count;
                mostFrequent = number;
            }
        }
        System.out.println("Most frequent element: " + mostFrequent);
        System.out.println("Frequency: " + maximumFrequency);
    }
}

Output:

Most frequent element: 8
Frequency: 3

How does it work?

1. Start with an empty frequency map.
2. Traverse the array.
3. Retrieve the existing count or use zero.
4. Increment the count.
5. Store the updated count.
6. Update the maximum frequency when a larger count is found.

This implementation returns the element whose frequency first reaches the maximum during the left-to-right traversal. If multiple values tie, it keeps the one that reaches that frequency first.

Complexity

* Expected time: O(n)
* Auxiliary space: O(u)

⸻

18. DSA Pattern: Two Sum

Problem

Given an array and a target, find two indices whose values sum to the target.

Input:

int[] nums = {2, 7, 11, 15};
int target = 9;

Expected result:

[0, 1]

Solution

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}

Output:

[0, 1]

How does it work?

For each element:

1. Calculate the complement: target - current.
2. Check whether that complement has already been seen.
3. If it exists, return both indices.
4. Otherwise, store the current value and its index.

The current element is checked before it is inserted, preventing an element from being used twice for the same pair.

Complexity

* Expected time: O(n)
* Auxiliary space: O(n)

⸻

19. DSA Pattern: Character Frequency

Problem

Count the frequency of each character in a string.

Input:

banana

Expected frequencies:

b -> 1
a -> 3
n -> 2

Solution

import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String text = "banana";
        Map<Character, Integer> frequency = new HashMap<>();
        for (char ch : text.toCharArray()) {
            frequency.put(
                    ch,
                    frequency.getOrDefault(ch, 0) + 1
            );
        }
        System.out.println(frequency);
    }
}

The printed order is not guaranteed.

Complexity

For a string of length n:

* Expected time: O(n)
* Auxiliary space: O(k), where k is the number of distinct characters.

For full Unicode text, remember that Java char represents a UTF-16 code unit, not necessarily an entire Unicode code point. Use code-point processing if the problem requires counting Unicode code points rather than UTF-16 code units.

⸻

20. DSA Pattern: Grouping Values

Suppose you want to group words by their first character.

Input:

apple, ant, banana, ball, cat

Expected grouping:

a -> [apple, ant]
b -> [banana, ball]
c -> [cat]

Solution

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        String[] words = {
                "apple", "ant", "banana", "ball", "cat"
        };
        Map<Character, List<String>> groups = new HashMap<>();
        for (String word : words) {
            char key = word.charAt(0);
            groups.computeIfAbsent(key, k -> new ArrayList<>())
                  .add(word);
        }
        System.out.println(groups);
    }
}

The map’s key iteration order is not guaranteed, but each list preserves the order in which its words were added.

Important pattern

map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);

This is a common Java pattern for grouping items by a key.

⸻

21. HashMap and Null Values

HashMap permits one null key and multiple null values.

Map<String, String> map = new HashMap<>();
map.put(null, "Unknown");
map.put("A", null);
map.put("B", null);
System.out.println(map);

This is valid.

Distinguishing absent keys from null mappings

Consider:

Map<String, String> map = new HashMap<>();
map.put("A", null);
System.out.println(map.get("A"));
System.out.println(map.get("B"));

Both calls return null.

But the keys have different states:

* "A" exists and is mapped to null.
* "B" does not exist.

Use:

map.containsKey("A");
map.containsKey("B");

to distinguish them.

Practical recommendation

Although HashMap permits null, avoid using null as a value unless it has a clear meaning in your application.

This makes business logic and debugging easier.

⸻

22. Mutable Keys and Common Bugs

Suppose a custom object’s fields participate in its hashCode() calculation.

If those fields change after the object is inserted into a map, later lookups may fail.

Conceptual example:

// Assume Student's ID participates in equals() and hashCode().
Student student = new Student(101, "Aradhya");
Map<Student, String> map = new HashMap<>();
map.put(student, "Java");
// If the ID used by equals() and hashCode() changes here,
// the map may no longer find the mapping using the new state.

This is why immutable keys are strongly recommended.

Common immutable key types include:

* String
* Integer
* Long
* UUID

These types are often convenient for maps because their equality-relevant state cannot be changed after construction.

⸻

23. Is HashMap Thread-Safe?

No. HashMap is not inherently thread-safe for concurrent modifications.

If multiple threads access a shared map and at least one thread modifies it, you must consider synchronization and visibility requirements.

Possible alternatives include:

Collections.synchronizedMap()

Map<String, Integer> map =
        java.util.Collections.synchronizedMap(new HashMap<>());

This wraps a map with synchronized access.

When iterating over the returned map or its views, follow the wrapper’s synchronization requirements.

ConcurrentHashMap

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
ConcurrentMap<String, Integer> map = new ConcurrentHashMap<>();

ConcurrentHashMap is designed for concurrent access.

However, it does not permit null keys or values.

Important: A thread-safe map does not automatically make every multi-step business operation atomic. Choose operations such as putIfAbsent(), compute(), or merge() when they fit the required behavior.

⸻

24. Time and Space Complexity

Let:

* n = number of mappings.
* u = number of distinct keys encountered.

Operation	Average Expected Complexity
put()	O(1)
get()	O(1)
containsKey()	O(1)
remove()	O(1)
containsValue()	O(n)
size()	O(1)
isEmpty()	O(1)
Iterate over entries	O(n)
clear()	O(n)

These complexities assume reasonably distributed hashes. Individual operations may take longer because of collisions, resizing, or other implementation details.

In Java 17, heavily collided buckets can be treeified under the implementation’s conditions, improving worst-case behavior for those buckets.

Space complexity

A map storing u mappings requires O(u) space.

For frequency counting:

* Expected time: O(n)
* Auxiliary space: O(u)

⸻

25. Common Mistakes

Mistake 1: Assuming HashMap Preserves Insertion Order

Do not rely on the displayed order of entries.

Use LinkedHashMap if insertion order matters.

Mistake 2: Confusing Keys and Values

map.put("Java", 100);

Here:

* "Java" is the key.
* 100 is the value.

The key is used to retrieve the associated value.

Mistake 3: Expecting Duplicate Keys

map.put("Java", 100);
map.put("Java", 200);

The map contains one "Java" key associated with 200.

Mistake 4: Forgetting the hashCode() Contract

Custom keys must implement equality and hashing consistently.

Mistake 5: Using containsValue() for Frequent Lookup

containsValue() generally scans the entries.

If frequent lookup is required, consider whether the data should be indexed differently.

Mistake 6: Using a Map to Store Duplicate Keys

If a key can have multiple associated values, use a collection as the map value:

Map<String, List<String>> groups = new HashMap<>();

Mistake 7: Modifying a Key After Insertion

Changing fields used by equals() and hashCode() can break expected lookup behavior.

Mistake 8: Using HashMap for Thread-Safe Shared State

Use an appropriate synchronization strategy or concurrent map when multiple threads share mutable state.

⸻

26. When Should You Use HashMap?

Good use cases

* Frequency counting.
* Two Sum and complement lookup.
* Duplicate tracking with additional metadata.
* Caching results.
* Grouping elements by category.
* Storing user IDs and user details.
* Mapping product IDs to products.
* Mapping configuration names to values.
* Building indexes for efficient lookup.
* Memoization in recursive or dynamic programming solutions.

When not to use it

Avoid HashMap when:

* You only need a collection of unique elements: consider HashSet.
* You require insertion order: consider LinkedHashMap.
* You require sorted keys or range queries: consider TreeMap.
* You require safe concurrent access: consider ConcurrentHashMap or another suitable synchronization strategy.
* You need multiple values per key: use a map whose values are collections or a suitable multimap implementation.

⸻

27. Interview Questions

Beginner

1. What is HashMap?
2. What is a key-value pair?
3. Can HashMap contain duplicate keys?
4. Can HashMap contain duplicate values?
5. Can HashMap contain a null key?
6. Can HashMap contain multiple null values?
7. What happens when you insert an existing key?
8. What does get() return when a key is absent?
9. What is the difference between keySet(), values(), and entrySet()?

Intermediate

10. How does HashMap work internally?
11. What is hashing?
12. What is a hash collision?
13. Why are equals() and hashCode() important?
14. What is capacity?
15. What is the load factor?
16. What happens when the map resizes?
17. Why is get() average O(1)?
18. What is the difference between HashMap and HashSet?
19. What is the difference between HashMap and LinkedHashMap?
20. What is the difference between getOrDefault() and putIfAbsent()?
21. When would you use computeIfAbsent()?
22. How does merge() help with frequency counting?

Advanced

23. How does Java 17 spread hash bits?
24. How does HashMap calculate a bucket index?
25. Under what conditions can a bucket be treeified?
26. What happens if two unequal keys have the same hash code?
27. Why should keys preferably be immutable?
28. What happens if equals() is overridden without a consistent hashCode()?
29. Why is HashMap not thread-safe?
30. What is the difference between HashMap and ConcurrentHashMap?
31. How would you implement a frequency counter?
32. How would you solve Two Sum using HashMap?
33. How would you group strings by an attribute?
34. How would you find the most frequent element?
35. Why is containsValue() generally O(n)?

⸻

28. Practice Challenges

Try to solve these independently before looking at solutions.

Level 1: Fundamentals

Challenge 1: Create a Student Map

Create a map of student IDs and names.

Insert:

101 -> Aradhya
102 -> Rahul
103 -> Priya

Print every key-value pair.

Challenge 2: Update a Value

Insert:

Java -> 100
Python -> 80

Update the Java score to 95.

Predict the final map.

Challenge 3: Check Key Existence

Create a map of product IDs and product names.

Check whether IDs 101 and 999 exist.

Challenge 4: Predict the Output

Map<String, Integer> map = new HashMap<>();
map.put("A", 10);
map.put("B", 20);
map.put("A", 30);
System.out.println(map.size());
System.out.println(map.get("A"));

Explain why.

Level 2: Frequency Counting

Challenge 5: Count Frequencies

Input:

int[] arr = {2, 3, 2, 5, 3, 2, 7};

Expected frequencies:

2 -> 3
3 -> 2
5 -> 1
7 -> 1

Challenge 6: Find the Most Frequent Element

Input:

int[] arr = {5, 5, 8, 8, 8, 3};

Find the element with the highest frequency.

Challenge 7: Count Character Frequencies

Input:

programming

Count the occurrences of each character.

Challenge 8: First Non-Repeating Character

Given a string, return the first character whose frequency is one.

Hint: Count the frequencies first, then scan the string again.

Level 3: Problem-Solving

Challenge 9: Two Sum

Input:

int[] nums = {2, 7, 11, 15};
int target = 9;

Return the indices of two values that sum to the target.

Challenge 10: Check Whether Two Strings Are Anagrams

Use frequency counting to determine whether two strings contain the same characters with the same frequencies.

Define whether case and whitespace should matter.

Challenge 11: Group Words

Group a list of words by their first character.

Challenge 12: Find Common Elements

Given two arrays, use a map or set to find their common unique values.

Challenge 13: Top K Frequent Elements

Given an integer array and k, return the k most frequent values.

Consider how to handle ties.

Challenge 14: Custom Object Keys

Create a Student class whose equality is based on ID.

Use student objects as map keys and explain what happens when two objects have the same ID.

Level 4: Interview-Level Reasoning

Challenge 15: Predict the Output

Map<String, Integer> map = new HashMap<>();
map.put("Java", 10);
map.put("Python", 20);
System.out.println(map.getOrDefault("Java", 0));
System.out.println(map.getOrDefault("C++", 0));
map.merge("Java", 5, Integer::sum);
map.merge("C++", 15, Integer::sum);
System.out.println(map);

Explain the behavior of getOrDefault() and merge().

Challenge 16: Mutable Key Analysis

Create a mutable custom class and use an instance as a map key.

Investigate what happens when a field used by hashCode() changes after insertion.

Explain why immutable keys are safer.

Challenge 17: Compare Collections

Given a problem, justify whether HashMap, HashSet, LinkedHashMap, or TreeMap is the best fit.

Do not choose based only on familiarity; explain the required operations and ordering.

⸻

29. Recommended Folder Structure

collections/
└── map/
    ├── hashmap/
    │   ├── README.md
    │   ├── HashMapBasics.java
    │   ├── FrequencyCounter.java
    │   ├── MostFrequentElement.java
    │   ├── TwoSum.java
    │   ├── CharacterFrequency.java
    │   ├── GroupingExample.java
    │   ├── CustomObjectKey.java
    │   └── HashMapMasteryChallenge.java
    │
    ├── linkedhashmap/
    │   ├── README.md
    │   └── LinkedHashMapBasics.java
    │
    └── treemap/
        ├── README.md
        └── TreeMapBasics.java

⸻

30. Mastery Checklist

Before marking HashMap as complete, make sure you can:

* Explain keys and values.
* Use put(), get(), remove(), and containsKey().
* Explain what happens when an existing key is inserted.
* Use getOrDefault() for frequency counting.
* Use computeIfAbsent() for grouping.
* Use merge() for updating counts.
* Iterate through entrySet().
* Explain hashing and bucket selection.
* Explain collisions.
* Explain the equals() and hashCode() contract.
* Explain capacity, load factor, and resizing.
* Explain why mutable keys are dangerous.
* Compare HashMap, HashSet, LinkedHashMap, and TreeMap.
* Solve frequency-counting problems without copying code.
* Solve Two Sum using a map.
* Explain why HashMap is not thread-safe.
* Explain the difference between average-case and worst-case complexity.

⸻

31. Final Mental Model

Remember these principles:

1. HashMap stores key-value pairs.
2. Each key maps to at most one value at a time.
3. Keys are unique according to the map’s key-equality rules.
4. Values may repeat.
5. hashCode() helps locate a candidate bucket.
6. equals() determines whether keys represent the same logical key.
7. Equal objects must have equal hash codes.
8. Hash collisions are normal and are handled internally.
9. Average put(), get(), and remove() complexity is O(1).
10. Capacity and load factor influence resizing.
11. Use immutable keys whenever practical.
12. Use HashMap for frequency counting, lookup, grouping, and key-value associations.
13. Use LinkedHashMap when insertion order matters.
14. Use TreeMap when sorted keys and navigation are required.
15. Use an appropriate concurrent map or synchronization strategy for shared mutable state.

One-Line Summary

HashMap = unique keys + associated values + hash-based lookup + average O(1) basic operations.

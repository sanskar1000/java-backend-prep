ArrayList

ArrayList is a resizable-array implementation of the List interface in Java.

It maintains insertion order, allows duplicate elements, and provides fast index-based access.

📚 Concepts Covered

* ArrayList basics
* List interface and ArrayList implementation
* Adding elements
* Accessing elements by index
* Updating elements
* Removing elements
* Searching with contains()
* Size vs capacity
* Internal resizing
* initialCapacity
* ensureCapacity()
* Amortized time complexity
* Element shifting

🔹 Basic Example

import java.util.ArrayList;
import java.util.List;
public class ArrayListBasics {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aradhya");
        names.add("Rahul");
        names.add("Priya");
        System.out.println(names);
        System.out.println(names.get(1));
    }
}

Output

[Aradhya, Rahul, Priya]
Rahul

🔹 Size vs Capacity

Size

Size is the number of elements currently stored in the ArrayList.

ArrayList<Integer> numbers = new ArrayList<>(50);
numbers.add(10);
numbers.add(20);
System.out.println(numbers.size()); // 2

The capacity may be larger than the size.

Capacity

Capacity refers to the amount of internal storage available before the ArrayList needs to grow.

Size     = actual elements
Capacity = internal storage

Capacity is not the same as size.

🔹 Initial Capacity

ArrayList<Integer> numbers = new ArrayList<>(100);

This creates an empty list with an initial capacity intended for 100 elements.

It does not create 100 elements.

size = 0
capacity ≈ 100

Therefore:

numbers.get(0);

would throw an IndexOutOfBoundsException because the list contains no elements.

🔹 ensureCapacity()

ArrayList<Integer> numbers = new ArrayList<>();
numbers.ensureCapacity(100);

ensureCapacity() can be used to prepare internal storage for a known or expected number of elements.

It does not add elements and does not increase the list’s size.

ensureCapacity() → capacity
add()            → size

⏱️ Time Complexity

Operation	Complexity
get(index)	O(1)
set(index, element)	O(1)
add(element) at end	O(1) amortized
add(index, element)	O(n)
remove(index)	O(n) generally
contains(element)	O(n)
indexOf(element)	O(n)

Why is get(index) O(1)?

ArrayList uses array-based storage, so an element can be accessed directly using its index.

Why can insertion be O(n)?

When inserting into the middle, elements after the insertion point may need to shift right.

Why can removal be O(n)?

When removing from the middle, elements after the removed element may need to shift left.

Why is append O(1) amortized?

Most additions do not require resizing. Occasionally, the internal storage grows and existing elements may need to be copied. The cost of these occasional expensive operations is spread across many additions.

🧠 Key Takeaways

* ArrayList implements List.
* ArrayList maintains insertion order.
* Duplicate elements are allowed.
* Index-based access is fast.
* size means actual stored elements.
* capacity means internal storage available before growth.
* Capacity can be greater than size.
* initialCapacity does not create elements.
* ensureCapacity() does not add elements.
* Insertion/removal in the middle may require shifting.
* Appending is O(1) amortized.
* Searching an unsorted ArrayList is O(n).

💼 Backend Relevance

ArrayList is commonly useful when:

* ordered data is required
* duplicates are allowed
* frequent index-based access is needed
* most additions occur at the end
* data is retrieved more often than it is inserted into the middle

Examples include:

* API response lists
* DTO collections
* database query results
* lists of users/products/orders
* temporary in-memory data

🎯 Interview Questions

1. Why is ArrayList get(index) O(1)?
2. Why can add(index, element) be O(n)?
3. Why can remove(index) be O(n)?
4. What is the difference between size and capacity?
5. Does new ArrayList<>(100) create 100 elements?
6. What does ensureCapacity() do?
7. Why is ArrayList append considered amortized O(1)?
8. What is the difference between searching by index and searching by value?

🔑 Complexity Summary

get(index)             → O(1)
set(index, element)    → O(1)
add(element)           → O(1) amortized
add(index, element)    → O(n)
remove(index)          → O(n)
contains(element)      → O(n)

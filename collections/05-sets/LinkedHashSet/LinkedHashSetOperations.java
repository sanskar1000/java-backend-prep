import java.util.LinkedHashSet;

/**
 * ------------------------------------------------------------
 * Program Name : LinkedHashSetOperations
 * Topic        : Java Collections - LinkedHashSet
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic operations of
 * LinkedHashSet, including adding, checking, removing,
 * clearing elements, and checking the size and state of
 * the set.
 *
 * LinkedHashSet:
 * • Does not allow duplicate elements.
 * • Maintains insertion order.
 * • Allows one null element.
 *
 * Key Concepts:
 * • add()
 * • contains()
 * • remove()
 * • size()
 * • isEmpty()
 * • clear()
 * • Duplicate handling
 * • Insertion order
 *
 * Important:
 * Adding an existing element does not create a duplicate.
 * Removing an element and adding it again places it at
 * the end because LinkedHashSet maintains insertion order.
 *
 * Time Complexity:
 * • add()      → O(1) average
 * • contains() → O(1) average
 * • remove()   → O(1) average
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class LinkedHashSetOperations {

    public static void main(String[] args) {

        LinkedHashSet<String> languages = new LinkedHashSet<>();

        // TODO 1:
        // Add Java, Python, C++, JavaScript, Go
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("Go");

        // TODO 2:
        // Add "Java" again.
        // Observe that duplicate elements are not added.
        languages.add("Java");

        // TODO 3:
        // Print the set.
        System.out.println("Set: " + languages);

        // TODO 4:
        // Check whether "Python" exists.
        System.out.println("Contains Python: "
                + languages.contains("Python"));

        // TODO 5:
        // Check whether "Ruby" exists.
        System.out.println("Contains Ruby: "
                + languages.contains("Ruby"));

        // TODO 6:
        // Remove "C++".
        System.out.println("Removed C++: "
                + languages.remove("C++"));

        // TODO 7:
        // Print the set after removal.
        System.out.println("After removal: " + languages);

        // TODO 8:
        // Add "C++" again.
        // It will appear at the end.
        System.out.println("Added C++ again: "
                + languages.add("C++"));

        // TODO 9:
        // Print the final set.
        System.out.println("Final set: " + languages);

        // TODO 10:
        // Print the size.
        System.out.println("Size: " + languages.size());

        // TODO 11:
        // Check whether the set is empty.
        System.out.println("Is empty: " + languages.isEmpty());

        // TODO 12:
        // Clear the set.
        languages.clear();

        // TODO 13:
        // Check whether the set is empty now.
        System.out.println("Is empty after clear: "
                + languages.isEmpty());
    }
}

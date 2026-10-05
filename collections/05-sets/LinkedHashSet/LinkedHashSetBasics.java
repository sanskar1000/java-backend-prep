import java.util.LinkedHashSet;

/**
 * Demonstrates the basic operations of LinkedHashSet in Java.
 *
 * <p>LinkedHashSet is a Set implementation that:</p>
 * <ul>
 *     <li>Does not allow duplicate elements.</li>
 *     <li>Maintains elements in insertion order.</li>
 *     <li>Provides average O(1) time complexity for add(), remove(),
 *         and contains().</li>
 * </ul>
 *
 * <p>This program demonstrates:</p>
 * <ul>
 *     <li>Adding elements using add()</li>
 *     <li>Automatic removal of duplicate elements</li>
 *     <li>Maintaining insertion order</li>
 *     <li>Finding the number of elements using size()</li>
 *     <li>Checking elements using contains()</li>
 *     <li>Removing elements using remove()</li>
 *     <li>Re-adding a removed element</li>
 *     <li>Understanding why a removed and re-added element
 *         appears at the end</li>
 * </ul>
 *
 * <p>Time Complexity:</p>
 * <ul>
 *     <li>add() - O(1) average</li>
 *     <li>remove() - O(1) average</li>
 *     <li>contains() - O(1) average</li>
 *     <li>size() - O(1)</li>
 * </ul>
 *
 * <p>Space Complexity: O(n)</p>
 *
 * @author Aradhya Thakur
 * @version 1.0
 * @since 2026
 */
public class LinkedHashSetBasics {

    public static void main(String[] args) {

        /*
         * Create a LinkedHashSet of String elements.
         *
         * LinkedHashSet:
         * 1. Does not allow duplicates.
         * 2. Maintains insertion order.
         */
        LinkedHashSet<String> language = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet.
        language.add("Java");
        language.add("Python");
        language.add("JavaScript");

        /*
         * "Java" is already present.
         * Therefore, this duplicate is ignored.
         */
        language.add("Java");

        language.add("C++");

        /*
         * "Python" is already present.
         * Therefore, this duplicate is ignored.
         */
        language.add("Python");

        language.add("Go");

        // Display elements in their insertion order.
        System.out.println("Language : " + language);

        // Returns the total number of unique elements.
        System.out.println("Size : " + language.size());

        // Check whether "Java" exists in the set.
        System.out.println("Contains Java : " + language.contains("Java"));

        // Check whether "Ruby" exists in the set.
        System.out.println("Contains Ruby : " + language.contains("Ruby"));

        /*
         * Remove "Python" from the set.
         *
         * After removal, Python no longer exists in the set.
         */
        System.out.println("Remove Python : " + language.remove("Python"));

        /*
         * Add "Python" again.
         *
         * Python was removed before this operation, so this is
         * considered a new insertion.
         *
         * Therefore, Python is added at the END of the set.
         */
        System.out.println("Add Python again : " + language.add("Python"));

        // Display the final LinkedHashSet.
        System.out.println("Final set : " + language);
    }
}

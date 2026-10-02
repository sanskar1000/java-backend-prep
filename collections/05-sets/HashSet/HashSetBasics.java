import java.util.HashSet;

/**
 * ------------------------------------------------------------
 * Program Name : HashSetBasics
 * Topic        : Java Collections - HashSet
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic operations of HashSet
 * in Java.
 *
 * HashSet:
 * - Stores unique elements.
 * - Does not allow duplicate elements.
 * - Does not guarantee insertion order.
 * - Allows one null element.
 *
 * Operations Covered:
 * - add()       : Adds an element if it does not already exist
 * - size()      : Returns the number of unique elements
 * - contains()  : Checks whether an element exists
 * - remove()    : Removes an element
 *
 * Important:
 * add() returns:
 * true  -> element was successfully added
 * false -> element already existed
 *
 * remove() returns:
 * true  -> element was found and removed
 * false -> element was not present
 *
 * Time Complexity:
 * add()       : O(1) average
 * contains()  : O(1) average
 * remove()    : O(1) average
 * size()      : O(1)
 *
 * Worst-case lookup complexity can degrade depending on
 * hash collisions and implementation details.
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class HashSetBasics {

    public static void main(String[] args) {

        // Create an empty HashSet of Integer values.
        HashSet<Integer> hashSet = new HashSet<>();

        // --------------------------------------------------------
        // Add elements
        // --------------------------------------------------------

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        // Duplicate values are ignored.
        hashSet.add(20);
        hashSet.add(40);
        hashSet.add(10);
        hashSet.add(50);
        hashSet.add(30);
        hashSet.add(60);
        hashSet.add(20);

        // Only unique values are stored.
        System.out.println("HashSet : " + hashSet);

        // Display the number of unique elements.
        System.out.println("Size    : " + hashSet.size());

        // --------------------------------------------------------
        // Search for elements
        // --------------------------------------------------------

        System.out.println("Contains 20? : " + hashSet.contains(20));
        System.out.println("Contains 35? : " + hashSet.contains(35));
        System.out.println("Contains 60? : " + hashSet.contains(60));

        // --------------------------------------------------------
        // Remove an element
        // --------------------------------------------------------

        System.out.println("Remove 40?   : " + hashSet.remove(40));

        // --------------------------------------------------------
        // Try to add an existing element
        // --------------------------------------------------------

        // 20 already exists, so add() returns false.
        System.out.println("Add 20?      : " + hashSet.add(20));

        // Display the final HashSet.
        System.out.println("Final Set    : " + hashSet);
    }
}

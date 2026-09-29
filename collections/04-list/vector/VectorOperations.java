import java.util.Vector;

/**
 * ------------------------------------------------------------
 * Program Name : VectorOperations
 * Topic        : Java Collections - Vector
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates common operations performed on
 * a Vector in Java.
 *
 * Operations Covered:
 * - add(element)         : Adds an element at the end
 * - add(index, element)  : Inserts an element at an index
 * - get(index)           : Retrieves an element
 * - set(index, element)  : Updates an element
 * - remove(index)        : Removes an element by index
 * - remove(Object)       : Removes an element by value
 * - contains(Object)     : Checks whether an element exists
 * - size()               : Returns the number of elements
 * - capacity()           : Returns the current capacity
 *
 * Important:
 * For Vector<Integer>, these two remove operations are different:
 *
 * remove(2)
 *     -> Removes the element at index 2.
 *
 * remove(Integer.valueOf(10))
 *     -> Removes the element whose value is 10.
 *
 * Time Complexity:
 * add(element)        : O(1) amortized
 * add(index, element) : O(n)
 * get(index)          : O(1)
 * set(index, element) : O(1)
 * remove(index)       : O(n)
 * remove(Object)      : O(n)
 * contains(Object)    : O(n)
 * size()              : O(1)
 * capacity()          : O(1)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class VectorOperations {

    public static void main(String[] args) {

        // Create a Vector with an initial capacity of 3.
        Vector<Integer> numbers = new Vector<>(3);

        // Add elements to the Vector.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Initial Vector      : " + numbers);

        // Insert 56 at index 3.
        numbers.add(3, 56);
        System.out.println("Element at index 3  : " + numbers.get(3));

        // Update the element at index 3.
        numbers.set(3, 78);

        // Remove the element at index 2.
        numbers.remove(2);

        // Remove the element with value 10.
        numbers.remove(Integer.valueOf(10));

        // Check whether 45 exists.
        System.out.println("Contains 45?        : " + numbers.contains(45));

        // Display current size.
        System.out.println("Size                : " + numbers.size());

        // Display current capacity.
        System.out.println("Capacity            : " + numbers.capacity());

        // Display the final Vector.
        System.out.println("Final Vector        : " + numbers);
    }
}

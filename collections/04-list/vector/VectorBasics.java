import java.util.Vector;

/**
 * ------------------------------------------------------------
 * Program Name : VectorBasics
 * Topic        : Java Collections - Vector
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic operations of the
 * Vector class in Java.
 *
 * Vector is a legacy, growable array implementation of the
 * List interface. Its methods are synchronized, making it
 * thread-safe for individual operations.
 *
 * Operations Covered:
 * - add()        : Adds elements to the Vector
 * - size()       : Returns the number of elements
 * - capacity()   : Returns the current internal capacity
 * - get()        : Accesses an element using its index
 * - contains()   : Checks whether an element exists
 *
 * Example:
 * Vector:
 * [10, 20, 30, 40]
 *
 * Size:
 * 4
 *
 * Element at index 2:
 * 30
 *
 * Contains 20:
 * true
 *
 * Time Complexity:
 * add(element) : O(1) amortized
 * get(index)   : O(1)
 * contains()   : O(n)
 * size()       : O(1)
 * capacity()   : O(1)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class VectorBasics {

    public static void main(String[] args) {

        // Create a Vector that stores Integer values.
        Vector<Integer> numbers = new Vector<>();

        // Add elements to the Vector.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display the Vector.
        System.out.println("Vector              : " + numbers);

        // Display the number of elements.
        System.out.println("Size                : " + numbers.size());

        // Display the current internal capacity.
        System.out.println("Capacity            : " + numbers.capacity());

        // Access the element at index 2.
        System.out.println("Element at index 2  : " + numbers.get(2));

        // Check whether the Vector contains 20.
        System.out.println("Contains 20?        : " + numbers.contains(20));
    }
}

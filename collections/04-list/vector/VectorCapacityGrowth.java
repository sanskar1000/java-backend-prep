import java.util.Vector;

/**
 * ------------------------------------------------------------
 * Program Name : VectorCapacityGrowth
 * Topic        : Java Collections - Vector
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the difference between the size
 * and capacity of a Vector and shows how its capacity grows
 * when the current capacity is exceeded.
 *
 * Key Concepts:
 * - Vector initial capacity
 * - size()
 * - capacity()
 * - Dynamic capacity growth
 * - Adding elements beyond current capacity
 *
 * Important:
 * Size represents the number of elements currently stored.
 *
 * Capacity represents the amount of space currently available
 * in the internal array before the Vector needs to grow.
 *
 * In this example:
 * Initial capacity = 3
 *
 * After adding 3 elements:
 * Size     = 3
 * Capacity = 3
 *
 * After adding the 4th element:
 * Size     = 4
 * Capacity grows automatically.
 *
 * Time Complexity:
 * add(element) : O(1) amortized
 * size()       : O(1)
 * capacity()   : O(1)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class VectorCapacityGrowth {

    public static void main(String[] args) {

        // Create a Vector with an initial capacity of 3.
        Vector<Integer> numbers = new Vector<>(3);

        // Display initial size and capacity.
        System.out.println("Initial State");
        System.out.println("Size     : " + numbers.size());
        System.out.println("Capacity : " + numbers.capacity());

        // Add three elements.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nAfter adding 3 elements");
        System.out.println("Size     : " + numbers.size());
        System.out.println("Capacity : " + numbers.capacity());

        // Add one more element.
        // The current capacity is exceeded, so Vector grows.
        numbers.add(40);

        System.out.println("\nAfter adding 4th element");
        System.out.println("Size     : " + numbers.size());
        System.out.println("Capacity : " + numbers.capacity());
    }
}

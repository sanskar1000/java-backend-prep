import java.util.TreeSet;

/**
 * ------------------------------------------------------------
 * Program Name : TreeSet Basics
 * Topic        : Java Collections - TreeSet
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Demonstrates the basic operations and characteristics of
 * TreeSet, including sorted order, duplicate prevention,
 * searching, removal, first/last elements, and clearing.
 *
 * Key Concepts:
 * • TreeSet stores unique elements.
 * • TreeSet maintains elements in sorted order.
 * • Duplicate elements are ignored.
 * • add() returns false when the element already exists.
 * • first() returns the smallest element.
 * • last() returns the largest element.
 * • contains() checks whether an element exists.
 * • TreeSet is useful when unique elements must remain sorted.
 *
 * Example:
 * Input  : 50, 20, 40, 20, 10, 30
 * Output : [10, 20, 30, 40, 50]
 *
 * Time Complexity:
 * • add()      : O(log n)
 * • remove()   : O(log n)
 * • contains() : O(log n)
 * • first()    : O(log n) / effectively constant navigation
 * • last()     : O(log n) / effectively constant navigation
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */
public class TreeSetBasics {

    public static void main(String[] args) {

        // TODO 1:
        // Create a TreeSet of Integer named numbers.
        TreeSet<Integer> numbers = new TreeSet<>();

        // TODO 2:
        // Add the following numbers:
        // 50, 20, 40, 20, 10, 30
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);

        // TODO 3:
        // Print the TreeSet.
        // Notice that the elements are automatically sorted
        // and the duplicate 20 is ignored.
        System.out.println("TreeSet : " + numbers);

        // Expected:
        // [10, 20, 30, 40, 50]

        // TODO 4:
        // Try adding 40 again.
        // add() returns false because 40 already exists.
        System.out.println("Add 40 Again : " + numbers.add(40));

        // TODO 5:
        // Print the size of the TreeSet.
        System.out.println("Size : " + numbers.size());

        // TODO 6:
        // Check whether the TreeSet contains 30.
        System.out.println("Contains 30 : " + numbers.contains(30));

        // TODO 7:
        // Check whether the TreeSet contains 100.
        System.out.println("Contains 100 : " + numbers.contains(100));

        // TODO 8:
        // Remove 20 and print the return value.
        System.out.println("Remove 20 : " + numbers.remove(20));

        // TODO 9:
        // Print the TreeSet after removing 20.
        System.out.println("After Removing 20 : " + numbers);

        // TODO 10:
        // Print the smallest element.
        System.out.println("Smallest : " + numbers.first());

        // TODO 11:
        // Print the largest element.
        System.out.println("Largest : " + numbers.last());

        // TODO 12:
        // Check whether the TreeSet is empty.
        System.out.println("Is Empty : " + numbers.isEmpty());

        // TODO 13:
        // Clear the TreeSet.
        numbers.clear();

        // TODO 14:
        // Check whether the TreeSet is empty after clear().
        System.out.println("Is Empty After Clear : " + numbers.isEmpty());
    }
}

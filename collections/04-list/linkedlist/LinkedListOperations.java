import java.util.LinkedList;

/**
 * ------------------------------------------------------------
 * Program Name : LinkedListOperations
 * Topic        : Java Collections - LinkedList
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates common operations performed on
 * a LinkedList in Java.
 *
 * Operations Covered:
 * - add(element)          : Adds an element at the end
 * - add(index, element)   : Inserts an element at an index
 * - remove(index)         : Removes an element using its index
 * - remove(Object)        : Removes an element using its value
 * - contains(Object)      : Checks whether an element exists
 *
 * Important:
 * When using LinkedList<Integer>, these two operations are
 * different:
 *
 * remove(1)
 *     -> Removes the element at index 1.
 *
 * remove(Integer.valueOf(85))
 *     -> Removes the element whose value is 85.
 *
 * Time Complexity:
 * add(element)        : O(1) at the end
 * add(index, element) : O(n)
 * remove(index)       : O(n)
 * remove(Object)      : O(n)
 * contains(Object)    : O(n)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class LinkedListOperations {

    public static void main(String[] args) {

        // Create a LinkedList that stores Integer values.
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add initial elements.
        numbers.add(45);
        numbers.add(75);
        numbers.add(85);
        numbers.add(95);
        numbers.add(25);

        System.out.println("Initial List        : " + numbers);

        // Add an element at the end.
        numbers.add(67);
        System.out.println("After add(67)       : " + numbers);

        // Insert 100 at index 2.
        numbers.add(2, 100);
        System.out.println("After add(2, 100)   : " + numbers);

        // Remove the element at index 1.
        numbers.remove(1);
        System.out.println("After remove(1)     : " + numbers);

        // Remove the element with value 85.
        numbers.remove(Integer.valueOf(85));
        System.out.println("After remove(85)    : " + numbers);

        // Check whether 30 exists in the LinkedList.
        System.out.println("Contains 30?        : " + numbers.contains(30));

        // Display the final LinkedList.
        System.out.println("Final List          : " + numbers);
    }
}

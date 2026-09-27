import java.util.LinkedList;

/**
 * ------------------------------------------------------------
 * Program Name : LinkedListEndOperations
 * Topic        : Java Collections - LinkedList
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates LinkedList operations performed
 * at the beginning and end of the list.
 *
 * Operations Covered:
 * - addFirst()   : Adds an element at the beginning
 * - addLast()    : Adds an element at the end
 * - getFirst()   : Returns the first element
 * - getLast()    : Returns the last element
 * - removeFirst(): Removes the first element
 * - removeLast() : Removes the last element
 * - peekFirst()  : Returns the first element without removing it
 * - peekLast()   : Returns the last element without removing it
 *
 * Time Complexity:
 * addFirst()    : O(1)
 * addLast()     : O(1)
 * getFirst()    : O(1)
 * getLast()     : O(1)
 * removeFirst() : O(1)
 * removeLast()  : O(1)
 * peekFirst()   : O(1)
 * peekLast()    : O(1)
 *
 * Space Complexity : O(n)
 *
 * Important:
 * peekFirst() and peekLast() only inspect the elements.
 * They do not remove elements from the LinkedList.
 * ------------------------------------------------------------
 */

public class LinkedListEndOperations {

    public static void main(String[] args) {

        // Create a LinkedList of Integer values.
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add initial elements.
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // --------------------------------------------------------
        // Add elements at the beginning and end
        // --------------------------------------------------------

        numbers.addFirst(50);
        System.out.println("After addFirst(50): " + numbers);

        numbers.addLast(10);
        System.out.println("After addLast(10) : " + numbers);

        // --------------------------------------------------------
        // Access the first and last elements
        // --------------------------------------------------------

        System.out.println("First element     : " + numbers.getFirst());
        System.out.println("Last element      : " + numbers.getLast());

        // --------------------------------------------------------
        // Remove elements from the beginning and end
        // --------------------------------------------------------

        numbers.removeFirst();
        System.out.println("After removeFirst : " + numbers);

        numbers.removeLast();
        System.out.println("After removeLast  : " + numbers);

        // --------------------------------------------------------
        // Inspect first and last elements without removing them
        // --------------------------------------------------------

        System.out.println("peekFirst()       : " + numbers.peekFirst());
        System.out.println("peekLast()        : " + numbers.peekLast());

        // The list remains unchanged after peek operations.
        System.out.println("Final List        : " + numbers);
    }
}

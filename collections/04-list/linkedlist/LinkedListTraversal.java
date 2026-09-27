import java.util.Iterator;
import java.util.LinkedList;

/**
 * ------------------------------------------------------------
 * Program Name : LinkedListTraversal
 * Topic        : Java Collections - LinkedList
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates three different ways to traverse
 * a LinkedList in Java.
 *
 * Traversal Methods:
 * 1. Index-based for loop
 * 2. Enhanced for-each loop
 * 3. Iterator
 *
 * Important:
 * LinkedList does not provide efficient random access.
 * Therefore, repeatedly using get(index) can result in O(n²)
 * time when traversing the entire list.
 *
 * Time Complexity:
 * Index-based traversal : O(n²)
 * For-each traversal     : O(n)
 * Iterator traversal     : O(n)
 *
 * Space Complexity : O(1) auxiliary space
 * ------------------------------------------------------------
 */

public class LinkedListTraversal {

    public static void main(String[] args) {

        // Create a LinkedList that stores Integer values.
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(45);
        numbers.add(75);
        numbers.add(85);
        numbers.add(95);
        numbers.add(25);

        // --------------------------------------------------------
        // 1. Traversal using an index-based for loop
        // --------------------------------------------------------

        System.out.println("Index-based traversal:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // --------------------------------------------------------
        // 2. Traversal using enhanced for-each loop
        // --------------------------------------------------------

        System.out.println("\nFor-each traversal:");

        for (Integer number : numbers) {
            System.out.println(number);
        }

        // --------------------------------------------------------
        // 3. Traversal using Iterator
        // --------------------------------------------------------

        System.out.println("\nIterator traversal:");

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

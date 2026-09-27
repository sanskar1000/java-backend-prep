import java.util.LinkedList;

/**
 * ------------------------------------------------------------
 * Program Name : LinkedListBasics
 * Topic        : Java Collections - LinkedList
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic operations of a
 * LinkedList in Java.
 *
 * Operations Covered:
 * - add()       : Adds elements to the LinkedList
 * - size()      : Returns the number of elements
 * - getFirst()  : Returns the first element
 * - getLast()   : Returns the last element
 *
 * Example:
 * Input List:
 * [10, 20, 30, 40, 50]
 *
 * Output:
 * Numbers : [10, 20, 30, 40, 50]
 * Size    : 5
 * First   : 10
 * Last    : 50
 *
 * Important:
 * LinkedList maintains insertion order and allows duplicate
 * elements.
 *
 * Time Complexity:
 * add(element) : O(1) when adding at the end
 * size()       : O(1)
 * getFirst()   : O(1)
 * getLast()    : O(1)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class LinkedListBasics {

    public static void main(String[] args) {

        // Create a LinkedList that stores Integer values.
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements to the LinkedList.
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the complete LinkedList.
        System.out.println("Numbers : " + numbers);

        // Display the number of elements.
        System.out.println("Size    : " + numbers.size());

        // Access the first element.
        System.out.println("First   : " + numbers.getFirst());

        // Access the last element.
        System.out.println("Last    : " + numbers.getLast());
    }
}

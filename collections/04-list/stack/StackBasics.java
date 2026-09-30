import java.util.Stack;

/**
 * ------------------------------------------------------------
 * Program Name : StackBasics
 * Topic        : Java Collections - Stack
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the basic operations of the
 * Stack class in Java.
 *
 * A Stack follows the LIFO principle:
 *
 * LIFO = Last In, First Out
 *
 * The element that is added last is removed first.
 *
 * Operations Covered:
 * - push()   : Adds an element to the top of the stack
 * - pop()    : Removes and returns the top element
 * - peek()   : Returns the top element without removing it
 * - empty()  : Checks whether the stack is empty
 * - search() : Searches for an element from the top
 *
 * Important:
 * search() returns the 1-based position of an element from
 * the top of the stack.
 *
 * Example:
 *
 * Stack:
 * [10, 20, 30, 40, 50]
 *                    ↑
 *                   TOP
 *
 * search(50) -> 1
 * search(40) -> 2
 *
 * Time Complexity:
 * push()   : O(1)
 * pop()    : O(1)
 * peek()   : O(1)
 * empty()  : O(1)
 * search() : O(n)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StackBasics {

    public static void main(String[] args) {

        // Create an empty Stack that stores Integer values.
        Stack<Integer> stack = new Stack<>();

        // Add elements to the top of the stack.
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        // Display the complete stack.
        System.out.println("Stack       : " + stack);

        // Remove and return the top element.
        System.out.println("Popped      : " + stack.pop());

        // View the current top element without removing it.
        System.out.println("Top element : " + stack.peek());

        // Check whether the stack is empty.
        System.out.println("Is empty?   : " + stack.empty());

        // Search for 40 from the top of the stack.
        System.out.println("Position of 40 from top : " + stack.search(40));
    }
}

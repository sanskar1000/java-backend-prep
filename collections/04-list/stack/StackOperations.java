import java.util.Stack;

/**
 * ------------------------------------------------------------
 * Program Name : StackOperations
 * Topic        : Java Collections - Stack
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates the fundamental operations of a
 * Stack in Java.
 *
 * A Stack follows the LIFO principle:
 *
 * LIFO = Last In, First Out
 *
 * The element added last is removed first.
 *
 * Operations Covered:
 * - push()   : Adds an element to the top
 * - peek()   : Returns the top element without removing it
 * - pop()    : Removes and returns the top element
 * - search() : Searches for an element from the top
 * - empty()  : Checks whether the stack is empty
 *
 * Important:
 * Stack follows LIFO order.
 *
 * search() returns the 1-based position of an element
 * measured from the top of the stack.
 *
 * Time Complexity:
 * push()   : O(1)
 * peek()   : O(1)
 * pop()    : O(1)
 * search() : O(n)
 * empty()  : O(1)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class StackOperations {

    public static void main(String[] args) {

        // Create an empty Stack of Integer values.
        Stack<Integer> stack = new Stack<>();

        // Add elements to the top of the stack.
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the initial stack.
        System.out.println("Initial Stack : " + stack);

        // View the top element without removing it.
        System.out.println("Top element   : " + stack.peek());

        // Remove and return the top element.
        System.out.println("Popped element : " + stack.pop());

        // Display the stack after pop().
        System.out.println("After pop      : " + stack);

        // View the new top element.
        System.out.println("Top element   : " + stack.peek());

        // Remove the current top element.
        System.out.println("Popped element : " + stack.pop());

        // Display the stack after the second pop().
        System.out.println("After pop      : " + stack);

        // Search for 10 from the top of the stack.
        System.out.println("Position of 10 : " + stack.search(10));

        // Check whether the stack is empty.
        System.out.println("Is empty?      : " + stack.empty());
    }
}

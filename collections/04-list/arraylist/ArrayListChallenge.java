import java.util.ArrayList;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayListChallenge
 * Topic        : Java Collections - ArrayList
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program demonstrates commonly used ArrayList operations
 * in Java using an ArrayList of Integer values.
 *
 * Operations Covered:
 * 1. add()       - Adds elements to the ArrayList
 * 2. get()       - Accesses an element using its index
 * 3. set()       - Updates an element at a specific index
 * 4. remove()    - Removes an element using its index
 * 5. add(index)  - Inserts an element at a specific index
 * 6. contains()  - Checks whether an element exists
 * 7. indexOf()   - Finds the first index of an element
 * 8. size()      - Returns the number of elements
 * 9. for loop    - Traverses the ArrayList using indexes
 *
 * Important:
 * ArrayList uses zero-based indexing.
 * Therefore, the first element is at index 0.
 *
 * Example:
 * Initial List:
 * [10, 25, 7, 40, 15, 30, 25, 5]
 *
 * Time Complexity:
 * add(element)       : O(1) amortized
 * get(index)         : O(1)
 * set(index, value)  : O(1)
 * remove(index)      : O(n)
 * add(index, value)  : O(n)
 * contains(value)    : O(n)
 * indexOf(value)     : O(n)
 * size()             : O(1)
 *
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class ArrayListChallenge {

    public static void main(String[] args) {

        // Create an ArrayList that stores Integer values.
        ArrayList<Integer> numbers = new ArrayList<>();

        // --------------------------------------------------------
        // 1. add() - Add elements to the ArrayList
        // --------------------------------------------------------

        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(40);
        numbers.add(15);
        numbers.add(30);
        numbers.add(25);
        numbers.add(5);

        // --------------------------------------------------------
        // 2. get() - Access an element using its index
        // --------------------------------------------------------

        System.out.println("Index 3: " + numbers.get(3));

        // --------------------------------------------------------
        // 3. set() - Update an element at a specific index
        // --------------------------------------------------------

        numbers.set(2, 100);
        System.out.println("After set(): " + numbers);

        // --------------------------------------------------------
        // 4. remove() - Remove an element using its index
        // --------------------------------------------------------

        numbers.remove(4);
        System.out.println("After remove(): " + numbers);

        // --------------------------------------------------------
        // 5. add(index, value) - Insert an element at an index
        // --------------------------------------------------------

        numbers.add(2, 50);
        System.out.println("After add(index, value): " + numbers);

        // --------------------------------------------------------
        // 6. contains() - Check whether an element exists
        // --------------------------------------------------------

        System.out.println("Contains 25: " + numbers.contains(25));
        System.out.println("Contains 99: " + numbers.contains(99));

        // --------------------------------------------------------
        // 7. indexOf() - Find the first occurrence of an element
        // --------------------------------------------------------

        System.out.println("Index of 30: " + numbers.indexOf(30));
        System.out.println("Index of 500: " + numbers.indexOf(500));

        // --------------------------------------------------------
        // 8. size() + get() - Traverse the ArrayList
        // --------------------------------------------------------

        System.out.println("\nArrayList elements:");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}

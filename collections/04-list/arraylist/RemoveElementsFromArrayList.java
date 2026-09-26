import java.util.ArrayList;

/**
 * ------------------------------------------------------------
 * Program Name : RemoveElementsFromArrayList
 * Topic        : Java Collections - ArrayList
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program removes all occurrences of a specific value
 * from an ArrayList.
 *
 * The program demonstrates how to safely remove elements
 * while traversing an ArrayList using an index-based loop.
 *
 * Key Concept:
 * When an element is removed, the elements after it shift
 * one position to the left. Therefore, the index is decreased
 * by one after removal so that the shifted element is checked.
 *
 * Example:
 * Input:
 * [10, 20, 20, 30, 20, 40]
 *
 * Value to remove:
 * 20
 *
 * Output:
 * [10, 30, 40]
 *
 * Time Complexity : O(n²) in the worst case
 * Space Complexity: O(1) auxiliary space
 * ------------------------------------------------------------
 */

public class RemoveElementsFromArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of Integer values.
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List : " + numbers);

        // Remove all occurrences of 20.
        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) == 20) {

                numbers.remove(i);

                /*
                 * After removal, the next element shifts into
                 * the current index. Decrease i so that the
                 * shifted element is checked.
                 */
                i--;
            }
        }

        System.out.println("Updated List  : " + numbers);
    }
}

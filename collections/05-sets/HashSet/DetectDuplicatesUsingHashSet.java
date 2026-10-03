import java.util.HashSet;

/**
 * ------------------------------------------------------------
 * Program Name : DetectDuplicatesUsingHashSet
 * Topic        : Java Collections - HashSet
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program detects duplicate elements in an integer array
 * using HashSet.
 *
 * HashSet stores only unique elements. The add() method returns
 * a boolean value that can be used to detect duplicates:
 *
 * true  -> Element was not present and was added.
 * false -> Element was already present.
 *
 * Approach:
 * 1. Traverse the array.
 * 2. Try to add each element to the HashSet.
 * 3. If add() returns false, the element is a duplicate.
 *
 * Example:
 *
 * Input:
 * [10, 20, 30, 20, 40, 10]
 *
 * Output:
 * 20 has duplicates
 * 10 has duplicates
 *
 * Time Complexity : O(n) average
 * Space Complexity: O(n)
 * ------------------------------------------------------------
 */

public class DetectDuplicatesUsingHashSet {

    public static void main(String[] args) {

        // Input array containing duplicate values.
        int[] numbers = {
                10, 20, 30, 20, 40, 10, 50, 30, 60, 20
        };

        // HashSet stores only unique elements.
        HashSet<Integer> hashSet = new HashSet<>();

        // Traverse every element of the array.
        for (int i = 0; i < numbers.length; i++) {

            /*
             * add() returns:
             * true  -> element was added successfully.
             * false -> element already exists.
             */
            boolean added = hashSet.add(numbers[i]);

            // If the element was already present, it is a duplicate.
            if (!added) {
                System.out.println(
                        numbers[i] + " has duplicates"
                );
            }
        }
    }
}

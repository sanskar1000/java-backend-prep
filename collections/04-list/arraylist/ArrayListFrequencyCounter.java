import java.util.ArrayList;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayListFrequencyCounter
 * Topic        : Java Collections - ArrayList
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds duplicate elements in an ArrayList and
 * counts how many times each duplicate element occurs.
 *
 * Approach:
 * - Traverse the ArrayList using nested loops.
 * - For each element, count its occurrences.
 * - Use a second ArrayList to keep track of elements whose
 *   frequency has already been processed.
 * - Print only elements that occur more than once.
 *
 * Example:
 * Input:
 * [10, 25, 7, 40, 15, 30, 25, 5]
 *
 * Output:
 * 25 occurs 2 times
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(n) for the processed-elements list
 * ------------------------------------------------------------
 */

public class ArrayListFrequencyCounter {

    public static void main(String[] args) {

        // Create an ArrayList to store integer values.
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25);
        numbers.add(7);
        numbers.add(40);
        numbers.add(15);
        numbers.add(30);
        numbers.add(25);
        numbers.add(5);

        System.out.println("Numbers : " + numbers);

        // Stores elements whose frequency has already been calculated.
        ArrayList<Integer> processed = new ArrayList<>();

        // Traverse every element in the ArrayList.
        for (int i = 0; i < numbers.size(); i++) {

            int currentNumber = numbers.get(i);

            // Skip the element if its frequency was already calculated.
            if (processed.contains(currentNumber)) {
                continue;
            }

            int count = 1;

            // Compare the current element with all following elements.
            for (int j = i + 1; j < numbers.size(); j++) {

                if (currentNumber == numbers.get(j)) {
                    count++;
                }
            }

            // Print only duplicate elements.
            if (count > 1) {
                System.out.println(
                        currentNumber + " occurs " + count + " times"
                );
            }

            // Mark the current element as processed.
            processed.add(currentNumber);
        }
    }
}

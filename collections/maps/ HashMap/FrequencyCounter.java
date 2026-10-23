import java.util.HashMap;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayFrequencyCounter
 * Topic        : Arrays and HashMap
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program counts the frequency of each element in an
 * integer array using HashMap.
 *
 * Key Concepts:
 * • Arrays
 * • HashMap
 * • getOrDefault() method
 * • Loops
 * • Methods and return values
 *
 * Approach:
 * 1. Create an integer array.
 * 2. Create an empty HashMap to store numbers and frequencies.
 * 3. Traverse the array using a for loop.
 * 4. Use getOrDefault() to retrieve the current frequency.
 * 5. Increment the frequency and update the HashMap.
 * 6. Return and print the frequency map.
 *
 * Example:
 * Input  : [10, 20, 10]
 * Output : {20=1, 10=2}
 *
 * Note:
 * HashMap does not guarantee the order of its entries.
 *
 * Time Complexity  : O(n) average
 * Space Complexity : O(k)
 *
 * n = Number of elements in the array
 * k = Number of distinct elements
 * ------------------------------------------------------------
 */

public class ArrayFrequencyCounter {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10};

        System.out.println(countFrequency(numbers));
    }

    // Counts the frequency of each number in the array
    static HashMap<Integer, Integer> countFrequency(int[] numbers) {

        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            frequency.put(
                    numbers[i],
                    frequency.getOrDefault(numbers[i], 0) + 1
            );
        }

        return frequency;
    }
}

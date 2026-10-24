import java.util.HashMap;

/**
 * ------------------------------------------------------------
 * Program Name : MostFrequentElement
 * Topic        : Arrays and HashMap
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds the most frequent element in an integer
 * array and prints its frequency.
 *
 * Key Concepts:
 * - Arrays
 * - HashMap
 * - getOrDefault()
 * - Frequency counting
 * - Maximum value tracking
 * - Null and empty array validation
 *
 * Approach:
 * 1. Check whether the array is null or empty.
 * 2. Create a HashMap to store element frequencies.
 * 3. Traverse the array and update each element's frequency.
 * 4. Track the element with the highest frequency.
 * 5. Print the most frequent element and its frequency.
 *
 * Example:
 * Input  : [5, 5, 8, 8, 8, 3]
 * Output :
 * Most frequent element : 8
 * Frequency : 3
 *
 * Time Complexity  : O(n) average
 * Space Complexity : O(k)
 *
 * n = Number of elements in the array
 * k = Number of distinct elements
 * ------------------------------------------------------------
 */

public class MostFrequentElement {

    public static void main(String[] args) {

        int[] numbers = {5, 5, 8, 8, 8, 3};

        findMostFrequent(numbers);
    }

    static void findMostFrequent(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        HashMap<Integer, Integer> frequency = new HashMap<>();

        int mostFrequent = numbers[0];
        int maxFrequency = 0;

        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];

            int count = frequency.getOrDefault(number, 0) + 1;

            frequency.put(number, count);

            if (count > maxFrequency) {
                maxFrequency = count;
                mostFrequent = number;
            }
        }

        System.out.println("Most frequent element : " + mostFrequent);
        System.out.println("Frequency : " + maxFrequency);
    }
}

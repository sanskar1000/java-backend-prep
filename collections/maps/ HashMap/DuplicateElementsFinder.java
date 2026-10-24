import java.util.HashMap;
import java.util.HashSet;

/**
 * ------------------------------------------------------------
 * Program Name : DuplicateElementsFinder
 * Topic        : Arrays, HashMap, and HashSet
 * Level        : Beginner
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program finds and prints duplicate elements in an
 * integer array. Each duplicate is printed only once.
 *
 * Key Concepts:
 * - Arrays
 * - HashMap
 * - HashSet
 * - containsKey()
 * - contains()
 * - put()
 * - Duplicate detection
 *
 * Example:
 * Input  : [10, 20, 10, 30, 20, 10, 40]
 * Output :
 * 10
 * 20
 *
 * Time Complexity  : O(n) average
 * Space Complexity : O(n)
 *
 * n = Number of elements in the array
 * ------------------------------------------------------------
 */

public class DuplicateElementsFinder {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10, 40};

        findDuplicates(numbers);
    }

    static void findDuplicates(int[] numbers) {

        HashMap<Integer, Integer> frequency = new HashMap<>();
        HashSet<Integer> printed = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];

            if (frequency.containsKey(number)) {

                if (!printed.contains(number)) {
                    System.out.println(number);
                    printed.add(number);
                }

                frequency.put(number, frequency.get(number) + 1);

            } else {
                frequency.put(number, 1);
            }
        }
    }
}

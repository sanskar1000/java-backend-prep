import java.util.ArrayList;

/**
 * ------------------------------------------------------------
 * Program Name : ArrayListStatistics
 * Topic        : Java Collections - ArrayList
 * Level        : Beginner to Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * This program stores integers in an ArrayList and calculates
 * basic statistics by traversing the list.
 *
 * Operations Performed:
 * - Find the largest number
 * - Find the smallest number
 * - Calculate the sum
 * - Calculate the average
 * - Count even elements
 * - Count odd elements
 *
 * Example:
 * Input:
 * [10, 25, 7, 40, 15, 30, 25, 5]
 *
 * Output:
 * Largest number          : 40
 * Smallest number         : 5
 * Sum of all numbers      : 157
 * Average                 : 19.63
 * Number of even elements : 3
 * Number of odd elements  : 5
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1) auxiliary space
 * ------------------------------------------------------------
 */

public class ArrayListStatistics {

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

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int evenCount = 0;
        int oddCount = 0;

        // Traverse the ArrayList and calculate statistics.
        for (int i = 0; i < numbers.size(); i++) {

            int number = numbers.get(i);

            sum += number;

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Calculate average after finding the total sum.
        double average = (double) sum / numbers.size();

        System.out.println("Largest number          : " + max);
        System.out.println("Smallest number         : " + min);
        System.out.println("Sum of all numbers      : " + sum);
        System.out.printf("Average                 : %.2f%n", average);
        System.out.println("Number of even elements : " + evenCount);
        System.out.println("Number of odd elements  : " + oddCount);
    }
}

import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : TrappingRainWater
 * Topic        : Arrays - Trapping Rain Water
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Given an array representing the heights of bars,
 * calculate the total amount of rain water that
 * can be trapped between the bars after rainfall.
 *
 * Example:
 * Input  : [4, 2, 0, 3, 2, 5]
 * Output : 9
 *
 * Approach:
 * 1. Build LeftMax array
 * 2. Build RightMax array
 * 3. Water Level =
 *      min(LeftMax, RightMax)
 * 4. Trapped Water =
 *      Water Level - Current Height
 * 5. Sum all trapped water
 *
 * Concepts Used:
 * - Arrays
 * - Prefix Maximum
 * - Suffix Maximum
 * - Dynamic Programming Idea
 * - Simulation
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Calculates total trapped rain water.
     *
     * @param heights array of bar heights
     * @return total trapped water
     */
    static int trapRainWater(int[] heights) {

        int n = heights.length;

        // At least 3 bars are required
        if (n < 3) {
            return 0;
        }

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Build LeftMax Array
        leftMax[0] = heights[0];

        for (int i = 1; i < n; i++) {

            leftMax[i] =
                    Math.max(
                            leftMax[i - 1],
                            heights[i]
                    );
        }

        // Build RightMax Array
        rightMax[n - 1] = heights[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            rightMax[i] =
                    Math.max(
                            rightMax[i + 1],
                            heights[i]
                    );
        }

        // Calculate Total Water
        int totalWater = 0;

        for (int i = 0; i < n; i++) {

            int waterLevel =
                    Math.min(
                            leftMax[i],
                            rightMax[i]
                    );

            totalWater +=
                    waterLevel - heights[i];
        }

        return totalWater;
    }

    /**
     * Prints array elements.
     *
     * @param arr array to print
     * @param message heading message
     */
    static void printArray(int[] arr,
                           String message) {

        System.out.print(message);

        for (int value : arr) {

            System.out.print(value + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter size of array : "
        );

        int n = sc.nextInt();

        if (n <= 0) {

            System.out.println(
                    "Invalid array size."
            );

            sc.close();
            return;
        }

        int[] heights = new int[n];

        System.out.print(
                "Enter heights : "
        );

        for (int i = 0; i < n; i++) {

            heights[i] = sc.nextInt();
        }

        printArray(
                heights,
                "Height Array : "
        );

        int trappedWater =
                trapRainWater(heights);

        System.out.println();

        System.out.println(
                "Total Trapped Water : "
                        + trappedWater
        );

        sc.close();
    }
}

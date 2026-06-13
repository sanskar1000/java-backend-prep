import java.util.Scanner;

/**
 * ------------------------------------------------------------
 * Program Name : ContainerWithMostWater
 * Topic        : Two Pointer Technique
 * Level        : Intermediate
 * Author       : Aradhya Thakur
 * Year         : 2026
 *
 * Description:
 * Given an array representing heights of vertical lines,
 * find the maximum amount of water a container can store.
 *
 * Example:
 * Input  : [1,8,6,2,5,4,8,3,7]
 * Output : 49
 *
 * Concepts Used:
 * - Arrays
 * - Two Pointer Technique
 * - Greedy Thinking
 * - Optimization
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

public class Main {

    /**
     * Finds maximum water container area.
     *
     * @param heights array of line heights
     * @return maximum possible area
     */
    static int findMaxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;

        int maxArea = 0;

        while (left < right) {

            int height =
                    Math.min(
                            heights[left],
                            heights[right]
                    );

            int width = right - left;

            int currentArea = height * width;

            maxArea =
                    Math.max(
                            maxArea,
                            currentArea
                    );

            if (heights[left] < heights[right]) {

                left++;

            } else {

                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter number of heights : "
        );

        int n = sc.nextInt();

        if (n <= 1) {

            System.out.println(
                    "At least 2 heights are required."
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

        int maxArea =
                findMaxArea(heights);

        System.out.println(
                "Maximum Area : "
                        + maxArea
        );

        sc.close();
    }
}

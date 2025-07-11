package _00_MathsProblem;

/*
* Leetcode: 976. Largest Perimeter Triangle
*
* Given an integer array nums, return the largest perimeter of a
* triangle with a non-zero area, formed from three of these lengths.
* If it is impossible to form any triangle of a non-zero area, return 0.

 */

import java.util.Arrays;

public class LargestPermeterTriangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums); // Sort in ascending order
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i - 1] + nums[i - 2] > nums[i]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }
        return 0; // No valid triangle
    }

    public static void main(String[] args) {

    }
}

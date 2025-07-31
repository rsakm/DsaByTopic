package _03Arrays;

public class DominantIndex {
    public static int dominantIndex(int[] nums) {
        int max = -1, secondMax = -1, index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return max >= 2 * secondMax ? index : -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        System.out.println("Dominant Index: " + dominantIndex(nums1)); // Output: 1

        // Test Case 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Dominant Index: " + dominantIndex(nums2)); // Output: -1

        // Test Case 3
        int[] nums3 = {0, 0, 0, 1};
        System.out.println("Dominant Index: " + dominantIndex(nums3)); // Output: 3
    }
}

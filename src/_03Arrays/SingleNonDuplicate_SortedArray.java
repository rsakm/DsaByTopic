package _03Arrays;

public class SingleNonDuplicate_SortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Ensure mid is even for correct pairing
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                // Pair is intact, move to the right half
                left = mid + 2;
            } else {
                // Broken pair, move to the left half
                right = mid;
            }
        }

        return nums[left];  // Left will be pointing to the single element
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));

        int[] arr2 = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(arr2));
    }
}

package _03Arrays;

/*
* Given an array of integers nums containing n + 1 integers where
* each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant
* extra space.
*
*
*
* */
public class FindDuplicate {


//    Binary Search on Value Range
//    The values range from 1 to n, not array indexes.
//    Use counting logic to apply binary search.

    //*
    // For nums = [1, 3, 4, 2, 2], binary search finds mid values and
    // checks how many elements ≤ mid.
    //
    //If count > mid, it means duplicate is in left half.

//    o(nlog(n))
    // */

    public static int findDuplicate(int[] nums) {
        int left = 1, right = nums.length - 1;
        int duplicate = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Count how many numbers <= mid
            int count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }

            if (count > mid) {
                duplicate = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return duplicate;
    }


    /*
    * Think of the array as a linked list where:

nums[i] is the "next" pointer.

Since there's one duplicate, there's a cycle in this list.

Use Floyd’s algorithm to find the entrance to the cycle → the duplicate.


* o(n)
*/
    public static int findDuplicate_Floyd(int[] nums) {
        // Phase 1: Finding the intersection point
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Finding the entrance to the cycle
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // or fast, both are at the duplicate
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));

        System.out.println(findDuplicate_Floyd(arr));
    }
}

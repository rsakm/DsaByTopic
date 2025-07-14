package _00_MathsProblem;

/*
* Leetcode: 1979. Find Greatest Common Divisor of Array
*
* Given an integer array nums, return the greatest common divisor of the smallest number
* and largest number in nums.

The greatest common divisor of two numbers is the largest positive integer that evenly
* divides both numbers.
*
* */
public class GCD_OfArray {
    public static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Find min and max
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Compute GCD using Euclidean Algorithm
        return gcd(min, max);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
}

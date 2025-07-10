package _00_MathsProblem;

/*
* Leetcode : 1486. XOR Operation in an Array
*
* You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.
* */
public class XOR_InAnArray {
    public static int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            int value = start + 2 * i;
            result ^= value;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(xorOperation(5,0));
        System.out.println(xorOperation(4,3));
    }
}

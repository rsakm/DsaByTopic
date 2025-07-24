package _00_MathsProblem;

/*
* Leetcode: 338. Counting Bits
*
* Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
* ans[i] is the number of 1's in the binary representation of i.



Example 1:

Input: n = 2
Output: [0,1,1]
Explanation:
0 --> 0
1 --> 1
2 --> 10


Example 2:

Input: n = 5
Output: [0,1,1,2,1,2]
Explanation:
0 --> 0
1 --> 1
2 --> 10
3 --> 11
4 --> 100
5 --> 101

 * */
import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }

        return ans;
    }

    private static int countOnes(int num) {
        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) count++;
            num >>= 1; // right shift by 1
        }

        return count;
    }


    public static void main(String[] args) {

            int n = 5;
            int[] result = countBits(n);

            System.out.println("Number of 1's in binary from 0 to " + n + ":");
            System.out.println(Arrays.toString(result));

    }
}

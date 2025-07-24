package _00_MathsProblem;

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

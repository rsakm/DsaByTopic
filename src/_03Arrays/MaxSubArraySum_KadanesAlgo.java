package _03Arrays;

public class MaxSubArraySum_KadanesAlgo {
    public static void main(String[] args) {
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(kadanesSum(nums));  // Expected: 7 (from 4, -1, -2, 1, 5)
    }

    static int kadanesSum(int[] arr) {
        int maxSum = arr[0];  //  Start from first element
        int currSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]); // either start new subarray or continue
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}

package _03Arrays;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int nums[]= {2,4,6,8,10};
        System.out.println(maxSubArraySum(nums));

    }

    static int maxSubArraySum(int[] arr){


        int maxSum = Integer.MIN_VALUE;

        for (int i =0;i<arr.length;i++){
            for (int j =i;j<arr.length;j++){

//                SubArray
                int currSum = 0;
                for (int k = i;k<=j;k++){
//                    SubArray Sum
                    currSum+=arr[k];
                }
                maxSum = Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
}

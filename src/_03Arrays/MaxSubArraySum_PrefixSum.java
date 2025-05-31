package _03Arrays;

public class MaxSubArraySum_PrefixSum {
    public static void main(String[] args) {

        int nums[] = {2,4,6,8,10};
        System.out.println(prefixSum(nums));

    }

    static int prefixSum(int[] arr){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];

//        calculating prefix array
        prefix[0] = arr[0];
        for (int i =1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];

        }

        for (int i =0; i<arr.length;i++){
            for (int j =0;j<arr.length;j++){

                currSum = i == 0 ? currSum= prefix[j] : prefix[j]-prefix[i-1];

                maxSum=Math.max(currSum,maxSum);

            }
        }

        return maxSum;
    }
}

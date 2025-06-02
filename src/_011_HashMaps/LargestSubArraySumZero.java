package _011_HashMaps;

import java.util.HashMap;

public class LargestSubArraySumZero {
    public static void main(String[] args) {

        int arr[] = {15,-2,2,-8,1,7,10,23};
        System.out.println(largestZeroSumSubArr(arr));

    }

    public static int largestZeroSumSubArr(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
//        (sum,index)

        int sum =0, len = 0;
        for (int j = 0;j<arr.length;j++){
            sum+=arr[j];
            if (hm.containsKey(sum)){
                len = Math.max(len, j- hm.get(sum));
            }else{
                hm.put(sum,j);
            }
        }

        return len;
    }
}

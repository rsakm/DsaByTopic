package _011_HashMaps;

import java.util.HashMap;

public class SubArraySum_K {
    public static void main(String[] args) {

    }
    public static int subArrSum(int[] arr, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();

        int sum =0;
        hm.put(0,1);
        int ans =0;
        for (int j =0;j<arr.length;j++){
            sum+=arr[j];
            if (hm.containsKey(sum-k)){
                ans+= hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}

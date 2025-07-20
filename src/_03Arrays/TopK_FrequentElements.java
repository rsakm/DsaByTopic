package _03Arrays;

import java.util.*;

public class TopK_FrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        // Step 2: Bucket sort based on frequency
        // Bucket index = frequency, value = list of numbers with that frequency
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (buckets[freq] == null)
                buckets[freq] = new ArrayList<>();
            buckets[freq].add(key);
        }

        // Step 3: Collect top k frequent elements from the buckets (from high to low frequency)
        List<Integer> resultList = new ArrayList<>();
        for (int i = buckets.length - 1; i >= 0 && resultList.size() < k; i--) {
            if (buckets[i] != null) {
                resultList.addAll(buckets[i]);
            }
        }

        // Step 4: Convert result to array
        int[] result = new int[k];
        for (int i = 0; i < k; i++)
            result[i] = resultList.get(i);
        return result;
    }

    public static void main(String[] args) {

            int[] nums = {1, 1, 1, 2, 2, 3};
            int k = 2;

            int[] result = topKFrequent(nums, k);
            System.out.println("Top " + k + " frequent elements: " + Arrays.toString(result));

    }
}

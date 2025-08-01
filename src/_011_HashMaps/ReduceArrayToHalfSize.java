package _011_HashMaps;

/*
Leetcode: 1338. Reduce Array Size to The Half

You are given an integer array arr. You can choose a set of integers and remove all
the occurrences of these integers in the array.

Return the minimum size of the set so that at least half of the integers of the array are
removed.
* */
import java.util.*;

public class ReduceArrayToHalfSize {
    public static int minSetSize(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(freqMap.values());
        frequencies.sort(Collections.reverseOrder());

        int removed = 0, size = 0;
        int half = arr.length / 2;

        for (int freq : frequencies) {
            removed += freq;
            size++;
            if (removed >= half) break;
        }

        return size;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,3,5,5,5,2,2,7};

        System.out.println("The reduced size is : "+minSetSize(arr));
    }
}

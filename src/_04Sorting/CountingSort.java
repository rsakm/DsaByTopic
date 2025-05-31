package _04Sorting;

public class CountingSort {
    public static void main(String[] args) {

    }

    public static void countingSort(int[] arr){

        int n = arr.length;
        int largestEle = arr[0];
        for (int i = 1;i<n;i++){
            largestEle= Math.max(largestEle,arr[i]);
        }

        int count[] = new int[largestEle+1];    /// countArray 0 to largest (range)
        for (int i =0;i<arr.length;i++){
            count[arr[i]]++;
        }

//        Sorting  ---> Iterate on count array
        int j =0;
        for (int i =0;i<count.length;i++){
            while (count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
}

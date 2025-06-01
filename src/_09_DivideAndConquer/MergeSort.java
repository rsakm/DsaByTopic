package _09_DivideAndConquer;

public class MergeSort {


    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        mergeSortHelper(arr, 0, arr.length - 1);
    }

    // Helper method with full control
    private static void mergeSortHelper(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergeSortHelper(arr, start, mid);
        mergeSortHelper(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    // Merge function
    private static void merge(int[] arr, int start, int mid, int end) {

        int n1 = mid-start+1;
        int n2 = end-mid;
        int temp[] = new int[n1+n2];

        int i = start;   //// iterator for left part
        int j = mid+1;   //// iterator for right part
        int k =0;        //// iterator for temp array

        while (i <= mid && j <= end){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

//        Left over elements : left
        while (i <= mid){
            temp[k++] = arr[i++];
        }

//        left over right
        while (j <= end){
            temp[k++] = arr[j++];
        }

//        temp into original array
        for (k =0, i=start; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    // Print function
    public static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // Main to test
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 6, 2, 7, 4, 1 };

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

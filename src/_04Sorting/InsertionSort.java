package _04Sorting;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];       // Element to be placed at correct position
            int j = i - 1;

            // Shift elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // Place key at correct position
        }
    }
}

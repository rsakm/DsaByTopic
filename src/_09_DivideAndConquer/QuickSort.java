package _09_DivideAndConquer;

public class QuickSort {

    public static void quickSort(int[] arr){
        quickSortHelper(arr,0,arr.length-1);
    }

    private static void quickSortHelper(int[] arr, int si, int ei){

        if (si >= ei){
            return;
        }

        int pivotIndex= partition(arr,si,ei);
        quickSortHelper(arr,si,pivotIndex-1);   ///left part
        quickSortHelper(arr,pivotIndex+1,ei);   ///right part

    }

//    partition
    private static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for (int j =si;j<=ei;j++){
            if (arr[j] < pivot){
                i++;
//                swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }

//        pivot at right place
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = pivot;

        return i;
    }


    private static void printArray(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 6, 2, 7, 4, 1 };

        System.out.println("Original array:");
        printArray(arr);
        quickSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}

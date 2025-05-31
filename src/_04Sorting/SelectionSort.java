package _04Sorting;

public class SelectionSort {
    public static void main(String[] args) {

    }

    public static void selectionSort(int[] arr){

        for (int i =0;i<arr.length-1;i++){
            int minPos = i;
            for (int j = i+1;j<arr.length;j++){
                if (arr[minPos] >arr[j]){
                    minPos=j;
                }
            }
//            Swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
}

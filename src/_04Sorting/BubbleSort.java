package _04Sorting;

public class BubbleSort {
    public static void main(String[] args) {

    }

    public static void bubbleSort(int[] arr){

        int n = arr.length;

//        For turns ( n=5, no. of turns = (4 0 to 3)
        for (int i =0;i<n-1;i++){

//            Comparison of elements   : turn 0 --> 0 to 3 index
            for (int j =0; j< n-i-1;j++){
                if(arr[j] > arr[j+1]){
//                    Swap
                    int temp = arr[j];
                    arr[j ] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
}
